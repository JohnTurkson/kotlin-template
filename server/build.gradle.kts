plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlinx.serialization)
    alias(libs.plugins.graalvm)
}

kotlin {
    jvmToolchain(21)
}

graalvmNative {
    toolchainDetection = true
    
    binaries {
        named("main") {
            mainClass = "com.johnturkson.kotlin.template.server.MainKt"
        }
    }
}

dependencies {
    implementation(projects.common)
    
    implementation(platform(libs.ktor.bom))
    implementation(libs.ktor.client.cio)
}
