package com.siar.siarupgrades.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.siar.siarupgrades.R
import com.siar.siarupgrades.navigation.home.HomeNavScreen
import kotlinx.coroutines.delay

/*****
 * Project: Siar Upgrades
 * Created by: Pablo Daniel Quiroga
 *****/
@Suppress("UnusedParameter")
@Composable
fun SplashScreen(
    navController: NavHostController,
    viewModel: MainViewModel
) {
    LaunchedEffect(key1 = true) {
        delay(3000) //TODO for demo
        navController.popBackStack()
        navController.navigate(HomeNavScreen.HomeScreen.route)
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.orange_400)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        Image(
            painterResource(R.drawable.siar),
            contentDescription = null
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SplashScreenPreview(){
    val navController = rememberNavController()
    SplashScreen(navController, MainViewModel())
}
