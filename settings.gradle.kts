rootProject.name = "renovate-issue"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library("caffeine", "com.github.ben-manes.caffeine", "caffeine").version("3.0.4")
        }
    }
}