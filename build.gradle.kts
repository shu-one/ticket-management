plugins {
  kotlin("jvm") version "2.2.20" apply false
  id("org.jlleitschuh.gradle.ktlint") version "13.1.0" apply false
}

subprojects {
  repositories {
    mavenCentral()
  }

  apply(plugin = "org.jlleitschuh.gradle.ktlint")

  configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    version.set("1.7.1")
    android.set(false)
    outputToConsole.set(true)
    coloredOutput.set(true)
    ignoreFailures.set(false)
    filter {
      exclude("**/generated/**", "**/kotlin/**")
    }
  }
}
