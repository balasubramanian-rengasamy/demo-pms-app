package com.prime.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.io.Serializable
import java.time.Instant
import java.time.LocalDateTime

@Entity
@Table(name = "appointment")
open class Appointment : Serializable {
  @Id
  @Column(name = "ID", nullable = false)
  open var id: Int? = null

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "Patient_ID", nullable = false)
  open var patient: Patient? = null

  @NotNull
  @Column(name = "AppointmentDate", nullable = false)
  open var appointmentDate: LocalDateTime? = null

  @Size(max = 45)
  @Column(name = "Reason", length = 45)
  open var reason: String? = null

  @NotNull
  @Column(name = "createdDate", nullable = false)
  open var createdDate: LocalDateTime? = null
}
