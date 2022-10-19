package com.emdasoft.rickandmorty.data

import com.emdasoft.rickandmorty.domain.models.Items
import com.emdasoft.rickandmorty.domain.models.Person
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

//    @GET("character?page={num}")
//    suspend fun getNext(@Path("num") num: Int): Response<Items>

    @GET("character/")
    suspend fun getPersonList(
        @Query("page") page: Int = 1
    ): Response<Items>

    @GET("character/{id}")
    suspend fun getPerson(@Path("id") id: Int): Response<Person>
}

