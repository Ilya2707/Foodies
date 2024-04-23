package com.example.foodies.features.product_details.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodies.ApplicationTheme
import com.example.foodies.R

@Composable
fun FixProductDetails() {
Column {
    Column(
        modifier = Modifier
            //.verticalScroll(rememberScrollState())
            .width(375.dp)
            .weight(9f,true)
    ) {
        Image(
            painter = painterResource(id = R.drawable.photo),
            contentDescription = null,
            modifier = Modifier
                .width(375.dp)
                .height(375.dp)
        )
        Text(
            text = "Том Ям",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 24.dp,
                    bottom = 8.dp
                )
        )
        Text(
            text = "Кокосовое молоко, кальмары, креветки,\n" +
                    "помидоры черри, грибы вешанки ",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    bottom = 24.dp
                )
        )

        NutritionalValue()

    }
    FixedButton("В корзину за 720 ₽",modifier = Modifier
        .padding(
            start = 16.dp,
            top = 12.dp,
            end = 16.dp,
            bottom = 12.dp
        )
        .width(343.dp)
        .height(48.dp)
        .weight(1f,true))
}

}

@Preview
@Composable
fun FixProductDetailsPreview() {
    ApplicationTheme {
        FixProductDetails()
    }
}