package com.siar.siarupgrades.navigation.main

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.siar.siarupgrades.main.MainViewModel
import com.siar.siarupgrades.main.SplashScreen
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
        startDestination = MainNavScreen.SplashScreen.route
    ){
        addSplashScreen(navController)

        addHomeScreen()
    }
}

fun NavGraphBuilder.addSplashScreen(navController: NavHostController){
    composable(MainNavScreen.SplashScreen.route) {
        val viewmodel: MainViewModel = hiltViewModel()

        SplashScreen(
            goToHomeScreen = { navigateToHomeScreen(navController) },
            viewModel = viewmodel
        )
    }
}

fun navigateToHomeScreen(navController: NavHostController) {
    navController.popBackStack()
    navController.navigate(HomeNavScreen.HomeScreen.route)
}
