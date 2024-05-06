package com.prime.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.io.Serializable
import java.time.Instant
import java.time.LocalDateTime

@Entity
@Table(name = "newcallers")
open class Newcaller : Serializable {
  @Id
  @Column(name = "ID", nullable = false)
  open var id: Int? = null

  @Size(max = 45)
  @NotNull
  @Column(name = "Firstname", nullable = false, length = 45)
  open var firstname: String? = null

  @Size(max = 45)
  @NotNull
  @Column(name = "Lastname", nullable = false, length = 45)
  open var lastname: String? = null

  @Size(max = 30)
  @NotNull
  @Column(name = "Phoneno", nullable = false, length = 30)
  open var phoneno: String? = null

  @NotNull
  @Column(name = "AppointmentDate", nullable = false)
  open var appointmentDate: LocalDateTime? = null

  @Size(max = 100)
  @Column(name = "Notes", length = 100)
  open var notes: String? = null
}
