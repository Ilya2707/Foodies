package com.example.foodies.features.product_details.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodies.ApplicationTheme

@Composable
fun NutritionalValue() {
    val nutritionalValueNames =
        listOf<String>("Вес", "Енерг. ценность", "Белки", "Жиры", "Углеводы")
    Column(
        modifier = Modifier
            .width(375.dp)
            .height(250 .dp)
            .verticalScroll(rememberScrollState())
    ) {
        for (i in nutritionalValueNames) {
            if (nutritionalValueNames.indexOf(i) == 0) {
                Spacer(
                    modifier = Modifier
                        .width(375.dp)
                        .height(1.dp)
                        .background(Color.LightGray)
                )
            }
            Row(
                modifier = Modifier
                    .width(375.dp)
                    .height(50.dp)

            ) {
                Text(
                    text = i,
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            top = 13.dp,
                            end = 8.dp,
                            bottom = 13.dp
                        )
                        .weight(1.3f, true),
                    style = MaterialTheme.typography.bodySmall,

                    )

                Text(
                    text = "700 г",
                    modifier = Modifier
                        .padding(
                            top = 13.dp,
                            bottom = 13.dp,
                            end = 16.dp
                        )
                        .weight(1f, true),
                    textAlign = TextAlign.Right,
                    style = MaterialTheme.typography.displayLarge
                )
            }
            Spacer(
                modifier = Modifier
                    .width(375.dp)
                    .height(1.dp)
                    .background(Color.LightGray)
            )
        }
    }

}

@Preview
@Composable
fun NutritionalValuePreview() {
    ApplicationTheme {
        NutritionalValue()
    }
}