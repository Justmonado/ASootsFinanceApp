package com.pajasoft.asootsfinanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pajasoft.asootsfinanceapp.components.Header
import com.pajasoft.asootsfinanceapp.models.Tarjetas
import com.pajasoft.asootsfinanceapp.models.user
import com.pajasoft.asootsfinanceapp.ui.theme.ASootsFinanceAppTheme
import com.pajasoft.asootsfinanceapp.components.CardsSection


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ASootsFinanceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Inicio(innerPadding)
                }
            }
        }
    }
}


@Composable
fun Inicio(innerPadding: PaddingValues){


    

}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ASootsFinanceAppTheme {
       Inicio(innerPadding = PaddingValues(0.dp))
    }
}