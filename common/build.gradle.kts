plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    jvmToolchain(21)

    jvm()
    androidTarget()
}

android {
    namespace = "com.johnturkson.kotlin.template.android"
    compileSdk = 34

    buildToolsVersion = "34.0.0"

    defaultConfig {
        minSdk = 26
    }
}
