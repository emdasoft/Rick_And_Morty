package com.emdasoft.rickandmorty.domain

import com.emdasoft.rickandmorty.domain.models.Items
import com.emdasoft.rickandmorty.domain.models.Person
import retrofit2.Response

interface Repository {

    suspend fun getPersonList(count: Int): Response<Items>

    suspend fun getPerson(id: Int) : Response<Person>

}