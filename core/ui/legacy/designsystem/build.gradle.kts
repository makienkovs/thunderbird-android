plugins {
    id(ThunderbirdPlugins.Library.android)
}

android {
    namespace = "app.k9mail.core.ui.legacy.designsystem"

    flavorDimensions += "version"
    productFlavors {
        register("mos")
    }
}

dependencies {
    api(projects.core.ui.legacy.theme2.common)
}
