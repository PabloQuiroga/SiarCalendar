package com.siar.siarupgrades.navigation.home

/*****
 * Project: Siar Upgrades
 * Created by: Pablo Daniel Quiroga
 *****/
sealed class HomeNavScreen(val route: String){
    data object HomeScreen: HomeNavScreen("home_screen")
}
