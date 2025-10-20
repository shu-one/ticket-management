plugins {
    kotlin("jvm") version "2.2.20"
    alias(ktorLibs.plugins.ktor)
}

repositories {
    mavenCentral()
}

group = "shhashi.ticket-management"
version = "0.0.0"

application {
    mainClass = "shhashi.ticketManagement.api.MainKt"
}

dependencies {
    implementation(ktorLibs.server.core)
    implementation(ktorLibs.server.tomcat)
}

ktor {
    fatJar {
        archiveFileName.set("ticket-management-api.jar")
    }
}
