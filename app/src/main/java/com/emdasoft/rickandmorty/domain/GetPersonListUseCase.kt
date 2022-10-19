package com.emdasoft.rickandmorty.domain

import com.emdasoft.rickandmorty.domain.models.Items
import retrofit2.Response

class GetPersonListUseCase(private val repository: Repository) {

    suspend fun getPersonList(count: Int): Response<Items> {
        return repository.getPersonList(count)
    }
}