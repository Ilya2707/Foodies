package com.example.foodies.features.products_list.presentation.catalog_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun FixedTopline(
    navController: NavController,
    viewModel: CatalogViewModel
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Topline()
        Categories()
        ItemList(
            navController,
            viewModel = viewModel
        )
    }
}













