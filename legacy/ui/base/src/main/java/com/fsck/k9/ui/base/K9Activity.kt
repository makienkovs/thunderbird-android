package com.fsck.k9.ui.base

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.Menu
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.lifecycle.asLiveData
import app.k9mail.legacy.ui.theme.ThemeManager
import com.fsck.k9.controller.push.PushController
import java.util.Locale
import org.koin.android.ext.android.inject

abstract class K9Activity(private val themeType: ThemeType) : AppCompatActivity() {
    constructor() : this(ThemeType.DEFAULT)

    private val pushController: PushController by inject()
    protected val themeManager: ThemeManager by inject()
    private val appLanguageManager: AppLanguageManager by inject()

    private var overrideLocaleOnLaunch: Locale? = null

    override fun attachBaseContext(baseContext: Context) {
        overrideLocaleOnLaunch = appLanguageManager.getOverrideLocale()

        val newBaseContext = overrideLocaleOnLaunch?.let { locale ->
            LocaleContextWrapper(baseContext, locale)
        } ?: baseContext

        super.attachBaseContext(newBaseContext)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        initializeTheme()
        initializePushController()
        super.onCreate(savedInstanceState)

        setLayoutDirection()
        listenForAppLanguageChanges()
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        menu.let {
            val color = ContextCompat.getColor(this, com.fsck.k9.core.R.color.status_bar_menu_text)
            val colorSearchHint = ContextCompat.getColor(this, com.fsck.k9.core.R.color.search_hint)
            val cursor = ContextCompat.getDrawable(this, com.fsck.k9.core.R.drawable.cursor)
            menu.setTextColor(color)
            menu.setSearchColor(colorHint = colorSearchHint, cursor = cursor)
        }
        return super.onPrepareOptionsMenu(menu)
    }

    // On Android 12+ the layout direction doesn't seem to be updated when recreating the activity. This is a problem
    // when switching from an LTR to an RTL language (or the other way around) using the language picker in the app.
    private fun setLayoutDirection() {
        if (Build.VERSION.SDK_INT >= 31) {
            window.decorView.layoutDirection = resources.configuration.layoutDirection
        }
    }

    private fun listenForAppLanguageChanges() {
        appLanguageManager.overrideLocale.asLiveData().observe(this) { overrideLocale ->
            if (overrideLocale != overrideLocaleOnLaunch) {
                recreateCompat()
            }
        }
    }

    private fun initializeTheme() {
        val theme = when (themeType) {
            ThemeType.DEFAULT -> themeManager.appThemeResourceId
            ThemeType.DIALOG -> themeManager.translucentDialogThemeResourceId
        }
        setTheme(theme)

        val color = ContextCompat.getColor(this, com.fsck.k9.core.R.color.status_bar)
        window.statusBarColor = color
        val decorView = window.decorView
        WindowCompat.getInsetsController(window, decorView).isAppearanceLightStatusBars = false
        window.navigationBarColor = color
    }

    private fun initializePushController() {
        pushController.init()
    }

    protected fun setLayout(@LayoutRes layoutResId: Int) {
        setContentView(layoutResId)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
            ?: error("K9 layouts must provide a toolbar with id='toolbar'.")

        setSupportActionBar(toolbar)
    }

    protected fun recreateCompat() {
        ActivityCompat.recreate(this)
    }
}

enum class ThemeType {
    DEFAULT,
    DIALOG,
}

fun Menu.setTextColor(color: Int) {
    for (i in 0 until size()) {
        val menuItem = getItem(i)
        val spanString = SpannableString(menuItem.title.toString())
        spanString.setSpan(ForegroundColorSpan(color),0, spanString.length,0)
        menuItem.setTitle(spanString)
        menuItem.subMenu?.setTextColor(color)
    }
}

@SuppressLint("PrivateApi")
fun Menu.setSearchColor(colorHint: Int, cursor: Drawable?) {
    for (i in 0 until size()) {
        val menuItem = getItem(i)
        val searchView = menuItem.actionView
        if (searchView is SearchView) {
            val searchEditText: EditText? = searchView.findViewById(androidx.appcompat.R.id.search_src_text)
            searchEditText?.setHintTextColor(colorHint)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                searchEditText?.setTextCursorDrawable(cursor)
            } else {
                try {
                    val field = TextView::class.java.getDeclaredField("mCursorDrawable")
                    field.isAccessible = true
                    field.set(searchEditText, cursor)
                } catch (ignored: Exception) {}
            }
        }
    }
}
