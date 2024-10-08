plugins {
    id(ThunderbirdPlugins.Library.androidCompose)
}

android {
    namespace = "app.k9mail.core.ui.compose.theme2.k9mail"
    resourcePrefix = "core_ui_theme2_k9mail"

    flavorDimensions += "version"
    productFlavors {
        register("mos")
    }
}

dependencies {
    api(projects.core.ui.compose.theme2.common)
}
