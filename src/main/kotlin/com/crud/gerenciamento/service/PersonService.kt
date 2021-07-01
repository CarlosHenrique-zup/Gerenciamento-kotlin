package com.crud.gerenciamento.service

import com.crud.gerenciamento.dto.MensagemDTO
import com.crud.gerenciamento.dto.PersonDTO
import com.crud.gerenciamento.entity.PersonEntity

interface PersonService {

    fun findAll(): List<PersonEntity>

    fun findById(id: Long): PersonEntity?

    fun findByNome(nome: String): PersonEntity?

    fun findByIdade(idade: Int): PersonEntity?

    fun create(idPerson:Long, personDto: PersonDTO): MensagemDTO

    fun update(idPerson: Long, personDTO: PersonDTO) : MensagemDTO

    fun delete(idPerson: Long): MensagemDTO


}