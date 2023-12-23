plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlinx.serialization)
}

kotlin {
    jvmToolchain(21)
    
    jvm()
    androidTarget()
    
    sourceSets {
        commonMain {
            dependencies {
                implementation(project.dependencies.platform(libs.kotlinx.serialization.bom))
                implementation(libs.kotlinx.serialization)
            }
        }
    }
}

android {
    namespace = "com.johnturkson.kotlin.template.common"
    compileSdk = 34
    
    buildToolsVersion = "34.0.0"
    
    defaultConfig {
        minSdk = 26
    }
}
