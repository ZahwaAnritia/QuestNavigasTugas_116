package com.example.questnavigastugas_116.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_116.R

@Composable
fun SplashScreen(
    onSubmitClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD8B4FE))
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(60.dp))

        Text(
            text = "Selamat Datang",
            fontSize = 40.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF6B21A8)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "CARD-IST",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF6B21A8),
                letterSpacing = 2.sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "\uD83D\uDDA5\uFE0F", fontSize = 72.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "MOBILE APP", fontSize = 14.sp, color = Color(0xFF6B21A8))
            Text(
                text = "2025",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF6B21A8)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            Text(
                text = stringResource(id = R.string.author_name),
                fontSize = 16.sp,
                color = Color(0xFF6B21A8)
            )
            Text(
                text = stringResource(id = R.string.author_nim),
                fontSize = 14.sp,
                color = Color(0xFF6B21A8)
            )
        }
        Button(
            onClick = onSubmitClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9333EA))
        ) {
            Text(text = "Submit", fontSize = 16.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(32.dp))
    }
}
