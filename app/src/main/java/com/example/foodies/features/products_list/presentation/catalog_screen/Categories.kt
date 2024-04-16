package com.example.foodies.features.products_list.presentation.catalog_screen
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodies.ApplicationTheme

@Composable
fun Categories() {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val tabItems = listOf<String>("Роллы", "Суши", "Наборы", "Горячие блюда", "Супы", "Десерты")

    LazyRow(
        modifier = Modifier
            .padding(top = 8.dp)
            .width(375.dp)
            .height(40.dp),

        ) {
        item {

            tabItems.forEachIndexed { index, item ->
                Button(
                    onClick = { selectedTabIndex = index },
                    modifier = Modifier
                        .padding(
                            start = if (index == 0) 16.dp else 8.dp,
                            end = if (index == tabItems.lastIndex) 16.dp else 0.dp
                        )
                        .height(40.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selectedTabIndex == index)
                            MaterialTheme.colorScheme.primary
                        else
                            MaterialTheme.colorScheme.background
                    ),
                    shape = RoundedCornerShape(8.dp)

                ) {
                    Text(
                        text = item,
                        style = if (selectedTabIndex == index)
                            MaterialTheme.typography.labelSmall
                        else
                            MaterialTheme.typography.labelMedium,
                        textAlign = TextAlign.Center

                    )

                }

            }
        }
    }

}


@Preview
@Composable
fun FixCategoriesPreview() {
    ApplicationTheme {
        Categories()
    }
}
