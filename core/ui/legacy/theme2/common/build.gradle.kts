plugins {
    id(ThunderbirdPlugins.Library.android)
}

android {
    namespace = "app.k9mail.core.ui.legacy.theme2.common"

    flavorDimensions += "version"
    productFlavors {
        register("mos")
    }
}

dependencies {
    api(libs.android.material)
}
