package com.example.questnavigastugas_116.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormIsian(
    modifier: Modifier = Modifier,
    onSubmitBtnClick: (String, String, String, String) -> Unit
) {
    @androidx.compose.runtime.Composable {
        var textNama by remember { mutableStateOf("") }
        var textAlamat by remember { mutableStateOf("") }
        var textJK by remember { mutableStateOf("") }
        var textStatus by remember { mutableStateOf("") }
        var showDialog by remember { mutableStateOf(false) }

        val gender = listOf("Laki-laki", "Perempuan")
        val statusPerkawinan = listOf("Janda", "Lajang", "Duda")

        val purpleBackground = Color(0xFFE6D5F5)
        val purpleButton = Color(0xFF7C3AED)
        val purpleHeader = Color(0xFFB794F6)

        Column(
            modifier = modifier
                .fillMaxSize()
                .background(purpleBackground)
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Formulir Pendaftaran",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(purpleHeader, shape = RoundedCornerShape(8.dp))
                    .padding(16.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .background(Color.White, shape = RoundedCornerShape(12.dp))
                    .padding(16.dp)
            ) {

                Text("NAMA LENGKAP", fontSize = 12.sp, color = Color.Gray)
                OutlinedTextField(
                    value = textNama,
                    onValueChange = { textNama = it },
                    singleLine = true,
                    placeholder = { Text("Isian nama lengkap", color = Color.Gray) },
                    modifier = Modifier.fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.LightGray,
                        unfocusedBorderColor = Color.LightGray
                    )
                )


                Text(
                    "JENIS KELAMIN",
                    fontSize = 12.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(top = 20.dp, bottom = 8.dp)
                )
                Column {
                    gender.forEach { item ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectable(
                                    selected = textJK == item,
                                    onClick = { textJK = item }
                                )
                                .padding(vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(selected = textJK == item, onClick = { textJK = item })
                            Text(item, modifier = Modifier.padding(start = 8.dp))
                        }
                    }
                }
                Text(
                    "STATUS PERKAWINAN",
                    fontSize = 12.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(top = 20.dp, bottom = 8.dp)
                )
                Column {
                    statusPerkawinan.forEach { item ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectable(
                                    selected = textStatus == item,
                                    onClick = { textStatus = item }
                                )
                                .padding(vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(selected = textStatus == item, onClick = { textStatus = item })
                            Text(item, modifier = Modifier.padding(start = 8.dp))
                        }
                    }
                }


                Text(
                    "ALAMAT",
                    fontSize = 12.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(top = 20.dp, bottom = 8.dp)
                )
                OutlinedTextField(
                    value = textAlamat,
                    onValueChange = { textAlamat = it },
                    singleLine = true,
                    placeholder = { Text("Alamat", color = Color.Gray) },
                    modifier = Modifier.fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.LightGray,
                        unfocusedBorderColor = Color.LightGray
                    )
                )
            }

        }
    }
}