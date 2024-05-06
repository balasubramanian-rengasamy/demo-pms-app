package com.prime

import com.prime.service.PatientService
import jakarta.annotation.PostConstruct
import jakarta.ejb.EJB
import jakarta.ejb.Singleton
import jakarta.ejb.Startup

@Startup
@Singleton
open class ApplicationStartup {

  @EJB
  lateinit var patientService: PatientService

  @PostConstruct
  fun startup() {
    println("-".repeat(100))
    println("ApplicationStartup")
    try {
      println(patientService.findById(5797))
    }catch (ex: Exception){println(ex.message)}

    try {
      println(patientService.findById(5977))
    }catch (ex: Exception){println(ex.message)}
    try {
      println(patientService.findById(51797))
    }catch (ex: Exception){println(ex.message)}
    println("-".repeat(100))
  }
}
