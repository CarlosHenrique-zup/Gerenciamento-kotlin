package com.crud.gerenciamento.repository

import com.crud.gerenciamento.entity.PersonEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PersonRepository : CrudRepository<PersonEntity, Long> {
    override fun findById(id: Long): Optional<PersonEntity>

//    fun findByNomeStartingWith(nome: String): Optional<PersonEntity>

//    fun findByIdade(idade: Int): Optional<PersonEntity>

}