package com.prime.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.Size
import java.io.Serializable
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalTime

@Entity
@Table(name = "timesheet")
open class Timesheet : Serializable {
  @Id
  @Column(name = "ID", nullable = false)
  open var id: Int? = null

  @Column(name = "WorkDate")
  open var workDate: LocalDate? = null

  @Column(name = "StartTime")
  open var startTime: LocalTime? = null

  @Column(name = "EndTime")
  open var endTime: LocalTime? = null

  @Column(name = "Amount", precision = 10, scale = 2)
  open var amount: BigDecimal? = null

  @Size(max = 255)
  @Column(name = "Remarks")
  open var remarks: String? = null

  @Column(name = "LateFlag")
  open var lateFlag: Int? = null

  @Column(name = "LateMinutes")
  open var lateMinutes: Int? = null
}
