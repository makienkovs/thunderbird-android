plugins {
    id(ThunderbirdPlugins.Library.android)
}

android {
    namespace = "org.openintents.openpgp"

    buildFeatures {
        aidl = true
    }

    flavorDimensions += "version"

    productFlavors {
        create("mos") {
            dimension = "version"
            isDefault = true
        }
    }
}

dependencies {
    api(libs.androidx.lifecycle.common)
    api(libs.androidx.preference)
    api(libs.androidx.fragment)

    implementation(libs.androidx.annotation)
    implementation(libs.timber)
}
