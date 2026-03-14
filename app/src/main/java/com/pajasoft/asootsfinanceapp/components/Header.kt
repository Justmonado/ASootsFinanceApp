package com.pajasoft.asootsfinanceapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pajasoft.asootsfinanceapp.models.User
import  com.pajasoft.asootsfinanceapp.ui.theme.DarkText
import com.pajasoft.asootsfinanceapp.ui.theme.GrayText

@Composable
fun Header(user: User){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFE8E8E8)),
                contentAlignment = Alignment.Center
            ){
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person",
                    modifier = Modifier
                        .size(28.dp),
                    tint = Color(0xFF5A5A6A)
                )
            }
            Column {
                Text(
                    text = "Hola ${user.nombre}",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkText
                )
                Text(
                    text = "Bienvenido",
                    fontSize = 13.sp,
                    color = GrayText
                )
            }
        }
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Menu",
            tint = DarkText,
            modifier = Modifier
                .size(26.dp)
        )
    }
}

