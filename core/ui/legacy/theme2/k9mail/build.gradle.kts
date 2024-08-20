plugins {
    id(ThunderbirdPlugins.Library.android)
}

android {
    namespace = "app.k9mail.core.ui.legacy.theme2.k9mail"

    flavorDimensions += "version"

    productFlavors {
        create("mos") {
            dimension = "version"
            isDefault = true
        }
    }
}

dependencies {
    implementation(projects.core.ui.legacy.theme2.common)
}
