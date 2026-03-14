package com.pajasoft.asootsfinanceapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pajasoft.asootsfinanceapp.models.Tarjetas
import com.pajasoft.asootsfinanceapp.models.Transaccion
import com.pajasoft.asootsfinanceapp.models.User
import com.pajasoft.asootsfinanceapp.ui.theme.BackgroundColor
import com.pajasoft.asootsfinanceapp.ui.theme.GrayText
import com.pajasoft.asootsfinanceapp.ui.theme.LavenderBlue
import com.pajasoft.asootsfinanceapp.ui.theme.MintGreen
import com.pajasoft.asootsfinanceapp.ui.theme.SoftBeige

@Composable
fun Inicio() {

    val user = User(nombre = "Alfonso", saldo = 2500.00)

    val tarjetas = listOf(
        Tarjetas(
            title = "Actividad",
            amount = 0.0,
            bgcolor = MintGreen,

        ),
        Tarjetas(
            title = "Ventas",
            amount = 280.99,
            bgcolor = SoftBeige
        ),
        Tarjetas(
            title = "Ganancias",
            amount = 280.99,
            bgcolor = LavenderBlue
        )
    )

    val transaccion = listOf(
        Transaccion(
            nombre = "Supermarket",
            categoria = "Groceries",
            monto = 45.99,
            time = "10:30 AM"
        ),
        Transaccion(
            nombre = "Gas Station",
            categoria =  "Fuel",
            monto = -30.50,
            time = "12:15 PM"
        ),
        Transaccion(
            nombre = "Coffee Shop",
            categoria = "Food and Drinks",
            monto = 5.75,
            time = "8:00 AM"
        ),
        Transaccion(
            nombre = "Electronics Store",
            categoria = "Electronics",
            monto = -120.00,
            time = "3:45 PM"
        ),
        Transaccion(
            nombre = "Bookstore",
            categoria = "Books",
            monto = 22.50,
            time = "11:00 AM"
        ),
        Transaccion(
            nombre = "Restaurant",
            categoria = "Dining",
            monto = 68.30,
            time = "7:30 PM"
        ),
        Transaccion(
            nombre = "Supermarket",
            categoria = "Groceries",
            monto = 45.99,
            time = "10:30 AM"
        ),
        Transaccion(
            nombre = "Gas Station",
            categoria =  "Fuel",
            monto = -30.50,
            time = "12:15 PM"
        ),
        Transaccion(
            nombre = "Coffee Shop",
            categoria = "Food and Drinks",
            monto = 5.75,
            time = "8:00 AM"
        ),
        Transaccion(
            nombre = "Electronics Store",
            categoria = "Electronics",
            monto = -120.00,
            time = "3:45 PM"
        ),
        Transaccion(
            nombre = "Bookstore",
            categoria = "Books",
            monto = 22.50,
            time = "11:00 AM"
        ),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
    ) {

        Header(user)

        Spacer(modifier = Modifier.height(8.dp))
        CardsSection(tarjeta = tarjetas)
        Spacer(modifier = Modifier.height(24.dp))


        Column(modifier = Modifier.weight(1f)) {

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
            Text(text = "Transactions", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = "See All", color = GrayText)
        }


            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(bottom = 16.dp)
            ) {
            items(transaccion) { item ->
                TransactionItem(item)
            }
        }
        }
    }
}
