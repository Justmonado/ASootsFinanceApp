package com.pajasoft.asootsfinanceapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pajasoft.asootsfinanceapp.models.Transaccion
import com.pajasoft.asootsfinanceapp.ui.theme.ASootsFinanceAppTheme
import com.pajasoft.asootsfinanceapp.ui.theme.GrayText

@Composable
fun TransactionItem(transaccion: Transaccion) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 6.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {

                Box(
                    modifier = Modifier
                        .size(45.dp)
                        .clip(CircleShape)
                        .background(Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = transaccion.icon,
                        contentDescription = "icon",
                        tint = Color.White
                    )
                }

                Column(
                    modifier = Modifier.padding(start = 12.dp)
                ) {

                    Text(
                        text = transaccion.nombre,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )

                    Text(
                        text = transaccion.categoria,
                        color = GrayText,
                        fontSize = 13.sp
                    )
                }
            }

            Column(horizontalAlignment = Alignment.End) {

                Text(
                    text = "$${transaccion.monto}",
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = transaccion.time,
                    color = GrayText,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTransacciones(){

    val transaccion = Transaccion(
        nombre = "Supermarket",
        categoria = "Groceries",
        monto = 45.99,
        time = "10:30 AM",
        icon = Icons.Default.ShoppingCart
    )

    ASootsFinanceAppTheme {
        TransactionItem(transaccion)
    }
}