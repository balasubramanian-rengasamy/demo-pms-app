package com.prime.service

import com.prime.entities.Patient
import jakarta.ejb.Stateless
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import jakarta.transaction.Transactional
import java.io.Serializable

@Stateless
open class PatientServiceImpl : PatientService, Serializable {

  @PersistenceContext
  open lateinit var entityManager: EntityManager

  @Transactional
  override fun findById(id: Long): Patient {
    return entityManager.find(Patient::class.java, id)
      ?: throw RuntimeException("Patient with id: $id not found.")
  }
}
