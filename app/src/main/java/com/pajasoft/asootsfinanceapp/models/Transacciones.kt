package com.pajasoft.asootsfinanceapp.models

import androidx.compose.ui.graphics.vector.ImageVector

data class Transaccion(
    val nombre:String,
    val categoria: String,
    val monto: Double,
    val time: String,
    val icon: ImageVector
)