plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.graalvm)
}

kotlin {
    jvmToolchain(21)
}

graalvmNative {
    toolchainDetection.set(true)
}

dependencies {
    implementation(projects.common)
}
