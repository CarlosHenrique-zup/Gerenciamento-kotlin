package com.crud.gerenciamento.service

import com.crud.gerenciamento.dto.MensagemDTO
import com.crud.gerenciamento.dto.PersonDTO
import com.crud.gerenciamento.entity.PersonEntity
import com.crud.gerenciamento.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl(val personRepository: PersonRepository): PersonService {

    val PESSOA_CRIADA_COM_SUCESSO: String = "Pessoa cadastrada com sucesso!"
    val PESSOA_DELETADA_COM_SUCESSO: String = "Pessoa deletada com sucesso!"
    val PESSOA_ATUALIZADA_COM_SUCESSO: String = "Pessoa atualizada com sucesso!"
    val PESSOA_INEXISTENTE: String = "Pessoa inexistente!"

    override fun findAll(): List<PersonEntity> {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): PersonEntity? {
        TODO("Not yet implemented")
    }

    override fun findByNome(nome: String): PersonEntity? {
        TODO("Not yet implemented")
    }

    override fun findByIdade(idade: Int): PersonEntity? {
        TODO("Not yet implemented")
    }

    override fun create(idPerson: Long, personDto: PersonDTO): MensagemDTO {
        TODO("Not yet implemented")
    }

    override fun update(idPerson: Long, personDTO: PersonDTO): MensagemDTO {
        TODO("Not yet implemented")
    }

    override fun delete(idPerson: Long): MensagemDTO {
        TODO("Not yet implemented")
    }


}