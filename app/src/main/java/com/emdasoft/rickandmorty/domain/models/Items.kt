package com.emdasoft.rickandmorty.domain.models

data class Items(
    val info: Info,
    val results: List<Person>
)

data class Info(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: Any
)