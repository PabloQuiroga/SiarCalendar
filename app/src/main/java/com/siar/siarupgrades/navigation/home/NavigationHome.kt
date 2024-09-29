package com.siar.siarupgrades.navigation.home

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.siar.siarupgrades.home.HomeScreen

/*****
 * Project: Siar Upgrades
 * Created by: Pablo Daniel Quiroga
 *****/
fun NavGraphBuilder.addHomeScreen(){
    composable(
        HomeNavScreen.HomeScreen.route
    ){
        HomeScreen(hiltViewModel())
    }
}