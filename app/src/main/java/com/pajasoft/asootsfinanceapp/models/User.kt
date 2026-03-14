package com.pajasoft.asootsfinanceapp.models

data class User (
    val nombre: String,
    val saldo : Double
)

val user = User (
    "Alfonso",
    280.99
)