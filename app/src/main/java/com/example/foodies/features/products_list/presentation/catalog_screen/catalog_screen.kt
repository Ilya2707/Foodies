package com.example.foodies.features.products_list.presentation.catalog_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.foodies.ApplicationTheme
import com.example.foodies.R
import com.example.foodies.navigation.Screens

@Composable
fun FixedTopline(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Catalog()
        Categories()
        LazyVerticalGrid(
            modifier = Modifier.padding(12.dp),
            columns = GridCells.Fixed(2),
            content = {
                items(100) { i ->
                    Box(
                        modifier = Modifier
                            .width(178.dp)
                            .height(300.dp)
                            .padding(4.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .width(170.dp)
                                .height(292.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.secondary)
                        ) {
                            Column(modifier = Modifier.fillMaxSize()) {
                                Box(
                                    modifier = Modifier
                                        .width(170.dp)
                                        .height(170.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.tomym),
                                        contentDescription = null,
                                        modifier = Modifier.fillMaxSize()
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .width(170.dp)
                                        .height(122.dp)
                                        .padding(12.dp)
                                ) {
                                    Column(modifier = Modifier.fillMaxSize()) {
                                        Box(
                                            modifier = Modifier
                                                .width(146.dp)
                                                .height(46.dp)

                                        ) {
                                            Column(modifier = Modifier.fillMaxSize()) {
                                                Box(
                                                    modifier = Modifier
                                                        .width(146.dp)
                                                        .height(20.dp)
                                                ) {
                                                    Text(
                                                        text = "Название блюда",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight.W500,
                                                            lineHeight = 20.sp,
                                                            fontSize = 15.sp,
                                                            textAlign = TextAlign.Center,
                                                        )
                                                    )
                                                }
                                                Box(
                                                    modifier = Modifier
                                                        .width(146.dp)
                                                        .height(24.dp)
                                                        .padding(bottom = 4.dp)
                                                ) {
                                                    Text(
                                                        text = "500 г.",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight.W100,
                                                            lineHeight = 20.sp,
                                                            fontSize = 15.sp,
                                                            textAlign = TextAlign.Center,
                                                        )
                                                    )
                                                }
                                            }
                                        }
                                        Button(
                                            onClick = {
                                                navController.navigate(Screens.ProductDetailsScreen.route)
                                            },
                                            modifier = Modifier
                                                .width(164.dp)
                                                .height(40.dp),
                                            colors = ButtonDefaults.buttonColors(Color.White)
                                        ) {

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            })
    }
}

@Composable
fun Catalog() {
    Row(
        modifier = Modifier
            .width(375.dp)
            .height(60.dp)
            .padding(start = 8.dp, top = 16.dp, end = 8.dp, bottom = 0.dp)
    ) {
        OutlinedButton(
            onClick = { onClick() },
            modifier = Modifier
                .height(44.dp)
                .width(44.dp),
            shape = RoundedCornerShape(0),
            border = BorderStroke(0.dp, Color.Transparent),
            contentPadding = PaddingValues(0.dp)

        ) {
            Box(
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
                    .padding(0.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.icon),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }

        }
        Box(
            modifier = Modifier
                .width(271.dp)
                .height(44.dp)
                .padding(start = 80.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(110.dp)
                    .height(44.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        OutlinedButton(
            onClick = { onClick() },
            modifier = Modifier
                .height(44.dp)
                .width(44.dp),
            shape = RoundedCornerShape(0),
            border = BorderStroke(0.dp, Color.Transparent),
            contentPadding = PaddingValues(10.dp)

        ) {
            Image(
                painter = painterResource(R.drawable.search),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
fun Categories() {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val tabItems = listOf<String>("Роллы", "Суши", "Наборы", "Горячие блюда", "Супы", "Десерты")
    Box(
        modifier = Modifier
            .height(72.dp)
            .width(375.dp)
            .padding(
                start = 0.dp,
                top = 16.dp,
                end = 0.dp,
                bottom = 16.dp

            )
    ) {
        ScrollableTabRow(
            selectedTabIndex = selectedTabIndex,
            modifier = Modifier
                .width(375.dp)
                .height(40.dp)
                .background(MaterialTheme.colorScheme.background),
            edgePadding = 16.dp,
            divider = {}


        ) {
            tabItems.forEachIndexed { index, item ->
                Tab(
                    selected = index == selectedTabIndex,
                    onClick = { selectedTabIndex = index },
                    text = {
                        Text(
                            text = item,
                            style = TextStyle(
                                fontWeight = FontWeight.W500,
                                lineHeight = 16.sp,
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                                color = if (selectedTabIndex == index) MaterialTheme.colorScheme.surface else MaterialTheme.colorScheme.onSurface
                            )
                        )
                    },
                    modifier = Modifier
                        .height(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(if (selectedTabIndex == index) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.background)
                )
            }

        }
    }


}


fun onClick() {
    TODO("Not yet implemented")
}


@Preview
@Composable
fun CatalogScreenPreview() {
    ApplicationTheme {
        Catalog()
    }
}

@Preview
@Composable
fun CategoriesScreenPreview() {
    ApplicationTheme {
        Categories()
    }
}

