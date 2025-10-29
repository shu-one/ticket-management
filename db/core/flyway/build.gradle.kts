import org.flywaydb.gradle.task.AbstractFlywayTask

buildscript {
  dependencies {
    classpath("org.flywaydb:flyway-database-postgresql:11.8.0")
    classpath("org.postgresql:postgresql:42.7.8")
  }
}

plugins {
  kotlin("jvm") version "2.2.20"
  id("org.flywaydb.flyway") version "11.15.0"
}

tasks.withType(AbstractFlywayTask::class.java) {
  notCompatibleWithConfigurationCache("Not Supported.")
}

flyway {
  url = System.getenv("FLYWAY_URL")
  user = System.getenv("FLYWAY_USER")
  password = System.getenv("FLYWAY_PASSWORD")
}
