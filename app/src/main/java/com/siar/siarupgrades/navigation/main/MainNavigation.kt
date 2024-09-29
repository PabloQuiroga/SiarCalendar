package com.siar.siarupgrades.navigation.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.siar.siarupgrades.navigation.home.HomeNavScreen
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
        startDestination = HomeNavScreen.HomeScreen.route
    ){
        addHomeScreen()
    }
}