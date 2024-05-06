package com.prime.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.io.Serializable
import java.math.BigDecimal
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "patient")
open class Patient : Serializable {
  @Id
  @Column(name = "ID", nullable = false)
  var id: Long? = null

  @Size(max = 45)
  @NotNull
  @Column(name = "FirstName", nullable = false, length = 45)
  var firstName: String? = null

  @Size(max = 45)
  @NotNull
  @Column(name = "LastName", nullable = false, length = 45)
  var lastName: String? = null

  @Column(name = "DateOfBirth")
  var dateOfBirth: LocalDate? = null

  @Size(max = 1)
  @Column(name = "Sex", length = 1)
  var sex: String? = null

  @Size(max = 10)
  @Column(name = "Height", length = 10)
  var height: String? = null

  @Size(max = 10)
  @Column(name = "Weight", length = 10)
  var weight: String? = null

  @Size(max = 30)
  @Column(name = "InsuranceNo", length = 30)
  var insuranceNo: String? = null

  @Size(max = 2000)
  @NotNull
  @Column(name = "Address", nullable = false, length = 2000)
  var address: String? = null

  @Size(max = 30)
  @Column(name = "PhoneNo", length = 30)
  var phoneNo: String? = null

  @Size(max = 45)
  @Column(name = "Nextofkin", length = 45)
  var nextofkin: String? = null

  @Size(max = 30)
  @Column(name = "Nokphone", length = 30)
  var nokphone: String? = null

  @Size(max = 30)
  @Column(name = "MobileNo", length = 30)
  var mobileNo: String? = null

  @Lob
  @Column(name = "Notes")
  var notes: String? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "createdby")
  var createdby: Usermaster? = null

  @Column(name = "createdDate")
  var createdDate: LocalDateTime? = null

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "modifiedby")
  var modifiedby: Usermaster? = null

  @Column(name = "modifiedDate")
  var modifiedDate: LocalDateTime? = null

  @Column(name = "PreviousBalance", precision = 10, scale = 2)
  var previousBalance: BigDecimal? = null

  @Size(max = 20)
  @Column(name = "notestype", length = 20)
  var notestype: String? = null

  @Size(max = 30)
  @Column(name = "Nationality", length = 30)
  var nationality: String? = null

  @Size(max = 1)
  @NotNull
  @Column(name = "Deleted", nullable = false, length = 1)
  var deleted: String? = null
  override fun toString(): String {
    return "Patient(id=$id, firstName=$firstName, lastName=$lastName, dateOfBirth=$dateOfBirth, sex=$sex, height=$height, weight=$weight, createdDate=$createdDate, modifiedby=$modifiedby, modifiedDate=$modifiedDate, previousBalance=$previousBalance, createdby=$createdby)"
  }


}
