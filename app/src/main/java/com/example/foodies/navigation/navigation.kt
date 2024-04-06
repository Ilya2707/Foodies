package com.example.foodies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodies.features.product_details.presentation.ProductDetails
import com.example.foodies.features.products_list.presentation.catalog_screen.FixedTopline

@Composable
fun Navigation(){
    val navController = rememberNavController()
   NavHost(navController = navController, startDestination = Screens.ProductListScreen.route ){
       composable(route = Screens.ProductListScreen.route){
           FixedTopline(navController = navController)
       }
       composable(route = Screens.ProductDetailsScreen.route){
           ProductDetails()
       }
   }
}