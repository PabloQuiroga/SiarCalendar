package com.siar.siarupgrades.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.siar.siarupgrades.ui.theme.SiarUpgradesTheme

/*****
 * Project: Siar Upgrades
 * Created by: Pablo Daniel Quiroga
 *****/
@Composable
fun HomeScreen(
    name: String
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { SetupTopBar() }
    ) { innerPadding ->
        Greeting(
            name = name,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SetupTopBar(){
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        ),
        title = {
            Text(
                "Centered Top App Bar",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        actions = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Localized description"
                )
            }
        },

    )
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
            .fillMaxSize(),
        textAlign = TextAlign.Center
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomePreview() {
    SiarUpgradesTheme {
        HomeScreen("pepe")
    }
}
