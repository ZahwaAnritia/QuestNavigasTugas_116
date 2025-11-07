package com.example.questnavigastugas_116.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.questnavigastugas_116.R

@Composable
fun ListPeserta(
    onBackBtnClick: () -> Unit,
    onHomeBtnClick: () -> Unit,
    onFormBtnClick: () -> Unit
) {
    val items = listOf(
        Pair(first = stringResource(R.string.nama_lengkap), second = "Dimas Putra"),
        Pair(first = stringResource(R.string.jenis_kelamin), second = "Laki-laki"),
        Pair(first = stringResource(R.string.alamat), second = "Yogyakarta"),
        Pair(first = stringResource(R.string.status_perkawinan), second = "Lajang")
    )