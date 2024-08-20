plugins {
    id(ThunderbirdPlugins.Library.android)
}

android {
    namespace = "app.k9mail.core.ui.legacy.theme2.common"

    flavorDimensions += "version"

    productFlavors {
        create("mos") {
            dimension = "version"
            isDefault = true
        }
    }
}

dependencies {
    api(libs.android.material)
}
