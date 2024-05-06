plugins {
  kotlin("jvm") version "1.9.23"
  kotlin("plugin.allopen") version "1.9.23"
  war
}

group = "com.prime"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  compileOnly("jakarta.platform:jakarta.jakartaee-api:10.0.0")
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}
kotlin {
  jvmToolchain(17)
}

allOpen {
  annotations(
    "jakarta.persistence.Entity",
    "jakarta.ejb.Stateless",
  )
}
