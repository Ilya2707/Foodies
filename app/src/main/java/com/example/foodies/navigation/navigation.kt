package com.example.foodies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodies.features.product_details.presentation.FixProductDetails
import com.example.foodies.features.products_list.presentation.catalog_screen.CatalogViewModel
import com.example.foodies.features.products_list.presentation.catalog_screen.FixedTopline

@Composable
fun Navigation(catalogViewModel: CatalogViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.ProductListScreen.route) {
        composable(route = Screens.ProductListScreen.route) {
            FixedTopline(
                navController = navController,
                viewModel = catalogViewModel
            )
        }
        composable(route = Screens.ProductDetailsScreen.route) {
            FixProductDetails()
        }
    }
}