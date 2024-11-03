package com.siar.siarupgrades.navigation.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.siar.siarupgrades.home.HomeScreen

/*****
 * Project: Siar Upgrades
 * Created by: Pablo Daniel Quiroga
 *****/
fun NavGraphBuilder.addHomeScreen(){
    composable<HomeScreen>{
        HomeScreen()
    }
}
