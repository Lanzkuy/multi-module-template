pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "multi-module-template"
include(":app")
include(":core:common")
include(":core:local")
include(":core:network")
include(":core:ui")
include(":features:feature1:data")
include(":features:feature1:domain")
include(":features:feature1:presentation")
