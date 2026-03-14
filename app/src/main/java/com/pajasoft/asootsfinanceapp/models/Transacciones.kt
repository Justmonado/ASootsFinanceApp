package com.pajasoft.asootsfinanceapp.models

data class Transaccion(
    val nombre:String,
    val categoria: String,
    val monto: Double,
    val time: String
)