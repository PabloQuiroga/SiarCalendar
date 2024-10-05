package com.siar.siarupgrades.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.siar.siarupgrades.navigation.main.MainNavigation
import com.siar.siarupgrades.ui.theme.SiarUpgradesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            SiarUpgradesTheme {
                MainNavigation()
            }
        }
    }
}

