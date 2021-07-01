package com.crud.gerenciamento.controller

import com.crud.gerenciamento.entity.PersonEntity
import com.crud.gerenciamento.repository.PersonRepository
import com.crud.gerenciamento.service.PersonService
import org.apache.coyote.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.persistence.EntityNotFoundException
import javax.validation.Valid

@RestController
@RequestMapping("/person")
class PersonController(var repository: PersonRepository) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@Valid @RequestBody person: PersonEntity): PersonEntity {
        repository.save(person)
        return person
    }

    @GetMapping
    fun read() = ResponseEntity.ok(repository.findAll())

    @GetMapping("/{id}")
    fun readForId(@PathVariable("id") id: Long): PersonEntity{
        return repository.findById(id).orElseThrow{EntityNotFoundException()}
    }

//    @GetMapping("/{idade}")
//    fun showByAge(@RequestParam("idade") idade: Int): PersonEntity{
//        return repository.findByIdade(idade).orElseThrow{EntityNotFoundException()}
//    }
//
//    @GetMapping("/{nome}")
//    fun showByName(@RequestParam("nome") nome: String): PersonEntity{
//        return repository.findByNomeStartingWith(nome).orElseThrow{EntityNotFoundException()}
//    }

    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @Valid @RequestBody personEntity: PersonEntity): ResponseEntity<PersonEntity> {
        val personDBOptional = repository.findById(id)
        val toSave = personDBOptional.orElseThrow{ RuntimeException("Person id: $id não encontrado")}
            .copy(nome = personEntity.nome, idade = personEntity.idade, email = personEntity.email, dataNascimento = personEntity.dataNascimento)
        return ResponseEntity.ok(repository.save(toSave))
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long) = repository.findById(id).ifPresent{repository.delete(it)}


}