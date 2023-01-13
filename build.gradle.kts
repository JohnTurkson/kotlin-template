import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.gradle.application")
    id("org.jetbrains.kotlin.jvm")
}

group = "com.johnturkson.example"
version = "1.0.0-SNAPSHOT"

application {
    mainClass.set("com.johnturkson.example.MainKt")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

// tasks.withType<KotlinCompile> {
//     kotlinOptions.jvmTarget = "17"
// }
