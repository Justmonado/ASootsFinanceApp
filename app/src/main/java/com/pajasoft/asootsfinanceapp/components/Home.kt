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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Devices
import androidx.compose.material.icons.filled.GasMeter
import androidx.compose.material.icons.filled.LocalCafe
import androidx.compose.material.icons.filled.LocalGasStation
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
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
fun HomeScreen() {

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
            time = "10:30 AM",
            icon = Icons.Default.ShoppingCart
        ),
        Transaccion(
            nombre = "Gas Station",
            categoria =  "Fuel",
            monto = -30.50,
            time = "12:15 PM",
            icon = Icons.Default.LocalGasStation
        ),
        Transaccion(
            nombre = "Coffee Shop",
            categoria = "Food and Drinks",
            monto = 5.75,
            time = "8:00 AM",
            icon = Icons.Default.LocalCafe
        ),
        Transaccion(
            nombre = "Electronics Store",
            categoria = "Electronics",
            monto = -120.00,
            time = "3:45 PM",
            icon = Icons.Default.Devices
        ),
        Transaccion(
            nombre = "Bookstore",
            categoria = "Books",
            monto = 22.50,
            time = "11:00 AM",
            icon= Icons.AutoMirrored.Filled.MenuBook
        ),
        Transaccion(
            nombre = "Restaurant",
            categoria = "Dining",
            monto = 68.30,
            time = "7:30 PM",
            Icons.Default.Restaurant
        ),
        Transaccion(
            nombre = "Supermarket",
            categoria = "Groceries",
            monto = 45.99,
            time = "10:30 AM",
            icon = Icons.Default.ShoppingCart
        ),
        Transaccion(
            nombre = "Gas Station",
            categoria =  "Fuel",
            monto = -30.50,
            time = "12:15 PM",
            icon = Icons.Default.LocalGasStation
        ),
        Transaccion(
            nombre = "Coffee Shop",
            categoria = "Food and Drinks",
            monto = 5.75,
            time = "8:00 AM",
            icon = Icons.Default.LocalCafe
        ),
        Transaccion(
            nombre = "Electronics Store",
            categoria = "Electronics",
            monto = -120.00,
            time = "3:45 PM",
            icon = Icons.Default.Devices
        ),
        Transaccion(
            nombre = "Bookstore",
            categoria = "Books",
            monto = 22.50,
            time = "11:00 AM",
            icon= Icons.AutoMirrored.Filled.MenuBook
        ),
        Transaccion(
            nombre = "Restaurant",
            categoria = "Dining",
            monto = 68.30,
            time = "7:30 PM",
            Icons.Default.Restaurant
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


        Column(modifier = Modifier
            .weight(1f)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
            Text(text = "Transactions", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = "See All", color = GrayText)
        }


            LazyColumn(
                modifier = Modifier.
                fillMaxSize(),
                contentPadding = PaddingValues(bottom = 16.dp)
            ) {
            items(transaccion) { item ->
                TransactionItem(item)
            }
        }
        }
    }
}
