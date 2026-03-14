package com.pajasoft.asootsfinanceapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pajasoft.asootsfinanceapp.models.Tarjetas
import com.pajasoft.asootsfinanceapp.ui.theme.ASootsFinanceAppTheme
import com.pajasoft.asootsfinanceapp.ui.theme.MintGreen
import com.pajasoft.asootsfinanceapp.ui.theme.SoftBeige
import com.pajasoft.asootsfinanceapp.ui.theme.LavenderBlue

import com.pajasoft.asootsfinanceapp.ui.theme.DarkText
import com.pajasoft.asootsfinanceapp.ui.theme.GrayText

@Composable
fun CardsSection(
    tarjeta: List<Tarjetas>,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .height(220.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        TarjetaG(
            tarjeta = tarjeta[0],
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        )

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            TarjetaS(
                tarjeta = tarjeta[1],
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )

            TarjetaS(
                tarjeta = tarjeta[2],
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )

        }
    }
}

@Composable
fun TarjetaG(
    tarjeta: Tarjetas,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = tarjeta.bgcolor),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "Activity Icon",
                    modifier = Modifier.size(36.dp),
                    tint = DarkText
                )

                Text(
                    text = tarjeta.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkText
                )

                Text(
                    text = "de la Semana",
                    fontSize = 12.sp,
                    color = GrayText
                )
            }
        }
    }
}



@Composable
fun TarjetaS(
    tarjeta: Tarjetas,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = tarjeta.bgcolor),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = tarjeta.title,
                    fontSize = 13.sp,
                    color = GrayText
                )

                Text(
                    text = "$${tarjeta.amount}",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkText
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewSummaryCards() {

    val tarjetass = listOf(
        Tarjetas(
            title = "Actividad",
            amount = 0.0,
            bgcolor = MintGreen
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

    ASootsFinanceAppTheme {
        CardsSection(tarjeta = tarjetass)
    }
}