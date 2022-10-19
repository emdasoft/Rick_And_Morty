package com.emdasoft.rickandmorty.data

import com.emdasoft.rickandmorty.domain.Repository
import com.emdasoft.rickandmorty.domain.models.Items
import com.emdasoft.rickandmorty.domain.models.Person
import retrofit2.Response

object RepositoryImpl:Repository {
    override suspend fun getPersonList(count: Int): Response<Items> {
        TODO("Not yet implemented")
    }

    override suspend fun getPerson(id: Int): Response<Person> {
        TODO("Not yet implemented")
    }
}