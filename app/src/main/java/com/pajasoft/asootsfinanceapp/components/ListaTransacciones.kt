package com.pajasoft.asootsfinanceapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pajasoft.asootsfinanceapp.models.Transaccion
import com.pajasoft.asootsfinanceapp.ui.theme.GrayText

@Composable
fun TransactionsSection(transaccion: List<Transaccion>) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Transaction",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "See All",
                color = GrayText
            )

        }

        LazyColumn {
            items(transaccion) { t ->
                TransactionItem(t)
            }
        }
    }
}