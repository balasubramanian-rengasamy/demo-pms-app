package com.prime.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.io.Serializable

@Entity
@Table(name = "usermaster")
open class Usermaster  : Serializable {
  @Id
  @Column(name = "ID", nullable = false)
  open var id: Int? = null

  @Size(max = 100)
  @NotNull
  @Column(name = "Username", nullable = false, length = 100)
  open var username: String? = null

  @Size(max = 45)
  @NotNull
  @Column(name = "userid", nullable = false, length = 45)
  open var userid: String? = null

  @Size(max = 45)
  @NotNull
  @Column(name = "password", nullable = false, length = 45)
  open var password: String? = null

  @Size(max = 10)
  @NotNull
  @Column(name = "userrole", nullable = false, length = 10)
  open var userrole: String? = null
}
