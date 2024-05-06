package com.prime.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.io.Serializable

@Entity
@Table(name = "insurancecompany")
open class Insurancecompany: Serializable {
  @Id
  @Column(name = "ID", nullable = false)
  open var id: Int? = null

  @Size(max = 45)
  @NotNull
  @Column(name = "InsuranceCompany", nullable = false, length = 45)
  open var insuranceCompany: String? = null
}
