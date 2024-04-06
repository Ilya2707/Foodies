package com.example.foodies.navigation

sealed class Screens(val route: String) {
    object ProductListScreen: Screens("product_screen")
    object ProductDetailsScreen: Screens("product_details")
    object ShoppingCartScreen: Screens("shopping_cart")
}