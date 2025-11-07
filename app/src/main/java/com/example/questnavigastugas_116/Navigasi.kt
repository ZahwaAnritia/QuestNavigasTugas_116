package com.example.questnavigastugas_116

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas_116.view.FormIsian
import com.example.questnavigastugas_116.view.ListPeserta
import com.example.questnavigastugas_116.view.SplashScreen



enum class Navigasi {
    Splash,     // Beranda
    List,       // List Peserta
    Formulir    // Formulir Pendaftaran
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    var daftarPeserta by rememberSaveable { mutableStateOf(listOf<Pair<String, String>>()) }


    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Splash.name,
            modifier = Modifier.padding(isiRuang)
        ) {
            
            composable(route = Navigasi.Splash.name) {
                SplashScreen(
                    onSubmitClick = {
                        // Dari Beranda -> ke List Peserta
                        navController.navigate(Navigasi.List.name)
                    }
                )
            }

            // 🔹 Halaman List Peserta
            composable(route = Navigasi.List.name) {
                ListPeserta(
                    dataPeserta = daftarPeserta, // kirim data ke ListPeserta
                    onBackBtnClick = {
                        navController.popBackStack(Navigasi.Splash.name, inclusive = false)
                    },
                    onHomeBtnClick = {
                        navController.navigate(Navigasi.Splash.name) {
                            popUpTo(Navigasi.Splash.name) { inclusive = true }
                        }
                    },
                    onFormBtnClick = {
                        // buka halaman form pendaftaran
                        navController.navigate(Navigasi.Formulir.name)
                    }
                )
            }
            composable(route = Navigasi.Formulir.name) {
                FormIsian(
                    onSubmitBtnClick = { _, _, _, _ ->
                        // Setelah submit, kembali ke List Peserta
                        navController.navigate(Navigasi.List.name) {
                            popUpTo(Navigasi.List.name) { inclusive = true }
                        }

                    }
                )

            }
        }
    }
}