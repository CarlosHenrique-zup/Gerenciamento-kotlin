package com.crud.gerenciamento.entity

import com.sun.istack.NotNull
import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.Size

@Entity
@Table(name = "person")
data class PersonEntity(
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @field:NotNull
    @field:Size(min = 5, max = 50, message = "")
    var nome: String,

    @field:NotNull
    var idade: Int,

    @field:NotNull
    @field:Email
    var email: String,

    @field:NotNull
    var dataNascimento: LocalDate,
)