plugins {
    id(ThunderbirdPlugins.Library.android)
}

android {
    namespace = "app.k9mail.core.ui.legacy.theme2.k9mail"

    flavorDimensions += "version"
    productFlavors {
        register("mos")
    }
}

dependencies {
    implementation(projects.core.ui.legacy.theme2.common)
}
