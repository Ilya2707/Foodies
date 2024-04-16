package com.example.foodies.features.products_list.presentation.catalog_screen

import android.widget.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodies.ApplicationTheme
import com.example.foodies.R

@Composable
fun Topline() {
    Row(
        modifier = Modifier
            .width(375.dp)
            .height(60.dp)
            .padding(start = 8.dp, top = 16.dp, end = 8.dp, bottom = 0.dp)
    ) {
        ButtonTopLine(icon = ImageVector.vectorResource(R.drawable.filter)) { TODO() }
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .padding(
                    start = 80.dp,
                    end = 80.34.dp
                )
                .width(110.66.dp)
                .height(44.dp)
        )
        ButtonTopLine(icon = ImageVector.vectorResource(R.drawable.ic_search)) { TODO() }
    }
}

@Composable
fun ButtonTopLine(
    icon: ImageVector,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .width(44.dp)
            .height(44.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color.Transparent
        ),
        contentPadding = PaddingValues(0.dp)
    )
    {

        Image(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.padding(12.dp)
        )
    }
}


@Preview
@Composable
fun CatalogScreenPreview() {
    ApplicationTheme {
        Topline()
    }
}

