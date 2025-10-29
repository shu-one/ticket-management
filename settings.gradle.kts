rootProject.name = "ticket-management"

include(":api", ":db:core:flyway")

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }

  versionCatalogs {
    create("ktorLibs") {
      from("io.ktor:ktor-version-catalog:3.3.1")
    }
  }
}
