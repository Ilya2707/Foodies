package com.example.foodies.features.products_list.presentation.catalog_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.foodies.R
import com.example.foodies.navigation.Screens

@Composable
fun ItemList(
    navController: NavController,
    viewModel: CatalogViewModel
) {
    val list by viewModel.productListState.collectAsState()
    LazyVerticalGrid(
        modifier = Modifier.padding(12.dp),
        columns = GridCells.Fixed(2)
    ) {
        items(list.size) { i ->
            Column(
                modifier = Modifier
                    .padding(4.dp)
                    .width(167.5.dp)
                    .height(290.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(MaterialTheme.colorScheme.secondary)
                    .clickable { navController.navigate(Screens.ProductDetailsScreen.route) },

                //horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.photo),
                    contentDescription = null,
                    modifier = Modifier
                        .width(167.5.dp)
                        .height(170.dp)
                )

                Text(
                    text = list[i].name,
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier
                        .padding(
                            start = 12.dp,
                            top = 12.dp,
                            end = 12.dp,
                            bottom = 4.dp
                        )
                )

                Text(
                    text = "${list[i].measure} ${list[i].measureUnit}",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier
                        .padding(
                            start = 12.dp,
                            end = 12.dp,
                            bottom = 12.dp
                        )
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(
                            start = 12.dp,
                            end = 12.dp,
                            bottom = 12.dp
                        )
                        .width(143.5.dp)
                        .height(40.dp)
                        .align(Alignment.CenterHorizontally),
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.surface),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = list[i].priceCurrent.toString(),
                        style = MaterialTheme.typography.bodyLarge,
                    )
                }

            }
        }
    }
}


