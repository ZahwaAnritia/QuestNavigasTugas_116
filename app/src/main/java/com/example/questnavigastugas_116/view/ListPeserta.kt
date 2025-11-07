package com.example.questnavigastugas_116.view

import android.R.color.black
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_116.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListPeserta(
    onBackBtnClick: () -> Unit,
    onHomeBtnClick: () -> Unit,
    onFormBtnClick: () -> Unit
) {
    val items = listOf(
        Pair(first = stringResource(R.string.nama_lengkap), second = "Zahwa Anritia"),
        Pair(first = stringResource(R.string.jenis_kelamin), second = "Perempuan"),
        Pair(first = stringResource(R.string.alamat), second = "Yogyakarta"),
        Pair(first = stringResource(R.string.status_perkawinan), second = "Lajang")
    )
    val purpleBackground = Color(0xFFE6D5F5)
    val purpleHeader = Color(0xFFB794F6)
    val purpleButton = Color(0xFF7C3AED)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.tampil),
                        color = Color.White,
                        fontSize = 27.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = purpleHeader
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxSize()
                .background(purpleBackground)
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                shape = MaterialTheme.shapes.medium
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items.forEach { item ->
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = item.first.uppercase(),
                                fontSize = 16.sp,
                                color = Color.Gray
                            )
                            Text(
                                text = item.second,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.Cursive,
                                fontSize = 22.sp,
                                color = Color.Black
                            )
                            Divider(
                                modifier = Modifier.padding(vertical = 8.dp),
                                thickness = 1.dp,
                                color = Color(0xFFCE93D8)
                            )
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = onHomeBtnClick,
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = purpleButton
                    )
                ) {
                    Text("Beranda")
                }

                Button(
                    onClick = onFormBtnClick,
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = purpleButton
                    )
                ) {
                    Text("Formulir Pendaftaran")
                }
            }

        }
    }
}