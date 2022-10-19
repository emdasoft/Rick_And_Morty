package com.emdasoft.rickandmorty.domain

import com.emdasoft.rickandmorty.domain.models.Person
import retrofit2.Response

class GetPersonUseCase(private val repository: Repository) {

    suspend fun getPerson(id: Int): Response<Person> {
        return repository.getPerson(id)
    }
}