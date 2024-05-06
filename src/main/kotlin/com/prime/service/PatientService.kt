package com.prime.service

import com.prime.entities.Patient
import jakarta.ejb.Local
import jakarta.ejb.Remote

@Local
@Remote
interface PatientService {

  fun findById(id: Long): Patient
}
