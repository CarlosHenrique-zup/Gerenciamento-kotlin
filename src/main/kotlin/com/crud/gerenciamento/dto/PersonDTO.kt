package com.crud.gerenciamento.dto

import com.sun.istack.NotNull
import java.time.LocalDate
import javax.validation.constraints.Email
import javax.validation.constraints.Size

data class PersonDTO(

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