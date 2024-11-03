package com.siar.siarupgrades.navigation.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.siar.siarupgrades.home.HomeScreen

/*****
 * Project: Siar Upgrades
 * Created by: Pablo Daniel Quiroga
 *****/
fun NavGraphBuilder.addHomeScreen(){
    composable<HomeScreen>{ backStackEntry ->
        val home: HomeScreen = backStackEntry.toRoute()
        HomeScreen(name = home.name)
    }
}
