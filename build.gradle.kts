import java.util.*

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


// Add these lines at the top of your build.gradle.kts file if needed
extra["payaraHome"] = "/Users/bala/_app_servers/payara6"
extra["contextRoot"] = "demo-pms-app"

// Helper function to create the common Exec configuration
private fun configureAsadminExec(task: Exec) {
  task.workingDir = extra["payaraHome"] as File
  val asadminFile = if (System.getProperty("os.name").lowercase(Locale.getDefault()).contains("windows")) {
    // Windows
    listOf(File(task.workingDir, "bin${File.separator}asadmin.bat").toString())
  } else {
    // Unix-like OS (including macOS)
    listOf(File(task.workingDir, "bin${File.separator}asadmin").toString())
  }
  task.commandLine = asadminFile
}

tasks {
  register<Exec>("startServer") {
    configureAsadminExec(this)
    args("start-domain")
  }

  register<Exec>("stopServer") {
    configureAsadminExec(this)
    args("stop-domain")
  }

  register<Exec>("redeploy") {
    dependsOn("war")
    configureAsadminExec(this)
    val warAppName = war.get().outputs.files.singleFile.name.substringBeforeLast('.')
    val warPath = war.get().archiveFile.get().asFile.absolutePath
    args("deploy", "--force=true", extra["contextRoot"], "--name=$warAppName", warPath)}
}
