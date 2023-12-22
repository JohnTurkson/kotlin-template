plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

kotlin {
    jvmToolchain(21)
}

android {
    namespace = "com.johnturkson.kotlin.template.android"
    compileSdk = 34

    buildToolsVersion = "34.0.0"

    defaultConfig {
        applicationId = "com.johnturkson.kotlin.template.android"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            isDefault = true
        }

        release {
            postprocessing {
                isObfuscate = true
                isOptimizeCode = true
                isRemoveUnusedCode = true
                isRemoveUnusedResources = true
                proguardFiles("proguard-app-rules.pro")
            }
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.7"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    androidResources {
        generateLocaleConfig = true
    }

    dependenciesInfo {
        includeInBundle = true
        includeInApk = true
    }
}

dependencies {
    implementation(projects.common)
    
    implementation(platform(libs.compose.bom))
    androidTestImplementation(platform(libs.compose.bom))

    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.ui.test.junit4)

    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
}
