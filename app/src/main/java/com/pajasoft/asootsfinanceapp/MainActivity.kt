package com.pajasoft.asootsfinanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.PaddingValues

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding


import androidx.compose.material3.Scaffold


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



import com.pajasoft.asootsfinanceapp.ui.theme.ASootsFinanceAppTheme

import com.pajasoft.asootsfinanceapp.components.Inicio


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ASootsFinanceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Inicio2(innerPadding)
                }
            }
        }
    }
}


@Composable
fun Inicio2(innerPadding: PaddingValues) {
    Box(modifier = Modifier
        .padding(innerPadding)) {
        Inicio()
    }
}






@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ASootsFinanceAppTheme {
       Inicio2(innerPadding = PaddingValues(top = 0.dp))
    }
}