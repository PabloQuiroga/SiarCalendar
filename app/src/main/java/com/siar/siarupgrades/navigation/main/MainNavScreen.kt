package com.siar.siarupgrades.navigation.main

/*****
 * Project: Siar Upgrades
 * Created by: Pablo Daniel Quiroga
 *****/
sealed class MainNavScreen(val route: String){
    data object SplashScreen: MainNavScreen("splash_screen")
}
