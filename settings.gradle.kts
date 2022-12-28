pluginManagement {
    plugins {
        id("com.johnturkson.kotlin") version "1.0.0-SNAPSHOT"
        id("com.johnturkson.graalvm") version "1.0.0-SNAPSHOT"
        id("com.johnturkson.publishing") version "1.0.0-SNAPSHOT"
    }
    
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://maven.pkg.github.com/JohnTurkson/packages")
            credentials {
                val githubActor: String? by settings
                val githubToken: String? by settings
                username = githubActor ?: System.getenv("GITHUB_ACTOR")
                password = githubToken ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/JohnTurkson/packages")
            credentials {
                val githubActor: String? by settings
                val githubToken: String? by settings
                username = githubActor ?: System.getenv("GITHUB_ACTOR")
                password = githubToken ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

rootProject.name = "kotlin-template"
