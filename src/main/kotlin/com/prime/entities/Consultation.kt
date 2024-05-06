package com.prime.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.io.Serializable
import java.math.BigDecimal
import java.time.Instant
import java.time.LocalDateTime

@Entity
@Table(name = "consultation")
open class Consultation : Serializable {
  @Id
  @Column(name = "ID", nullable = false)
  open var id: Int? = null

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "Patient_ID", nullable = false)
  open var patient: Patient? = null

  @NotNull
  @Column(name = "RegistrationDate", nullable = false)
  open var registrationDate: LocalDateTime? = null

  @Size(max = 45)
  @Column(name = "Title", length = 45)
  open var title: String? = null

  @Lob
  @Column(name = "Notes")
  open var notes: String? = null

  @Lob
  @Column(name = "Treatment")
  open var treatment: String? = null

  @Column(name = "Fees", precision = 10)
  open var fees: BigDecimal? = null

  @Column(name = "Fees1", precision = 10)
  open var fees1: BigDecimal? = null

  @Column(name = "Fees2", precision = 10)
  open var fees2: BigDecimal? = null

  @Column(name = "FeesReceived", precision = 10)
  open var feesReceived: BigDecimal? = null

  @Size(max = 10)
  @Column(name = "Weight", length = 10)
  open var weight: String? = null

  @Size(max = 20)
  @Column(name = "BloodPressure", length = 20)
  open var bloodPressure: String? = null

  @Size(max = 20)
  @Column(name = "SugarLevel", length = 20)
  open var sugarLevel: String? = null

  @Column(name = "Critical")
  open var critical: Byte? = null

  @Size(max = 1)
  @Column(name = "Hptn", length = 1)
  open var hptn: String? = null

  @Size(max = 1)
  @Column(name = "Obse", length = 1)
  open var obse: String? = null

  @Size(max = 1)
  @Column(name = "Hd", length = 1)
  open var hd: String? = null

  @Size(max = 1)
  @Column(name = "Thyroid", length = 1)
  open var thyroid: String? = null

  @Size(max = 1)
  @Column(name = "Misc", length = 1)
  open var misc: String? = null

  @NotNull
  @Column(name = "CreatedDate", nullable = false)
  open var createdDate: LocalDateTime? = null

  @Column(name = "ModifiedDate")
  open var modifiedDate: LocalDateTime? = null

  @Column(name = "RegisteredBy")
  open var registeredBy: Int? = null

  @Size(max = 50)
  @Column(name = "vatfee1desc", length = 50)
  open var vatfee1desc: String? = null

  @Size(max = 50)
  @Column(name = "vatfee2desc", length = 50)
  open var vatfee2desc: String? = null

  @Size(max = 50)
  @Column(name = "vatfee3desc", length = 50)
  open var vatfee3desc: String? = null

  @Size(max = 50)
  @Column(name = "vatfee4desc", length = 50)
  open var vatfee4desc: String? = null

  @Size(max = 50)
  @Column(name = "vatfee5desc", length = 50)
  open var vatfee5desc: String? = null

  @Column(name = "vatfee1", precision = 10, scale = 2)
  open var vatfee1: BigDecimal? = null

  @Column(name = "vatfee2", precision = 10, scale = 2)
  open var vatfee2: BigDecimal? = null

  @Column(name = "vatfee3", precision = 10, scale = 2)
  open var vatfee3: BigDecimal? = null

  @Column(name = "vatfee4", precision = 10, scale = 2)
  open var vatfee4: BigDecimal? = null

  @Column(name = "vatfee5", precision = 10, scale = 2)
  open var vatfee5: BigDecimal? = null

  @Size(max = 3)
  @Column(name = "invoiceGeneratedFlag", length = 3)
  open var invoiceGeneratedFlag: String? = null

  @Column(name = "invoiceGeneratedDate")
  open var invoiceGeneratedDate: LocalDateTime? = null
}
