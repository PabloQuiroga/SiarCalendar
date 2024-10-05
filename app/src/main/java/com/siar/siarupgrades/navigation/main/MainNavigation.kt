package com.siar.siarupgrades.navigation.main

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.siar.siarupgrades.main.SplashScreen
import com.siar.siarupgrades.navigation.home.addHomeScreen

/*****
 * Project: Siar Upgrades
 * Created by: Pablo Daniel Quiroga
 *****/
@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MainNavScreen.SplashScreen.route
    ){
        composable(MainNavScreen.SplashScreen.route) {
            SplashScreen(navController, hiltViewModel())
        }

        addHomeScreen()
    }
}
