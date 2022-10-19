package com.emdasoft.rickandmorty.domain.models

data class Person(
    val id: Int,
    val name: String,
    val gender: String,
    val image: String,
    val status: String,
    val created: String,
    val episode: List<String>,
    val location: Location,
    val species: String,
    val type: String,
    val url: String,
)

data class Location(
    val name: String,
    val url: String
)