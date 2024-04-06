package com.example.foodies.features.product_details.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodies.ApplicationTheme
import com.example.foodies.R
import com.example.foodies.navigation.Screens

@Composable
fun ProductDetails() {
    Column(
        modifier =
        Modifier
            .width(375.dp)
            .height(857.dp)


    ) {
        Image(
            painter = painterResource(id = R.drawable.tomym),
            contentDescription = null,
            modifier = Modifier
                .width(375.dp)
                .height(375.dp)
        )
        Box(
            modifier = Modifier
                .padding(top = 24.dp)
                .width(375.dp)
                .height(36.dp)
        ) {
            Text(
                text = "Том Ям",
                style = TextStyle(
                    fontWeight = FontWeight.W400,
                    lineHeight = 36.sp,
                    fontSize = 34.sp,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp
                    )
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 8.dp)
                .width(375.dp)
                .height(48.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp
                    ),
                text = "Кокосовое молоко, кальмары, креветки,\n" +
                        "помидоры черри, грибы вешанки",
                style = TextStyle(
                    fontWeight = FontWeight.W400,
                    lineHeight = 24.sp,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Left
                )
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 24.dp)
                .width(375.dp)
                .height(50.dp)
                .drawBehind {

                    drawLine(
                        Color.Black,
                        Offset(0f, 0f),
                        Offset(size.width, 0f),
                    )
                }

        ) {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            top = 13.dp,

                            bottom = 13.dp
                        )
                        .width(297.dp)
                        .height(24.dp),
                    text = "Вес",
                    style = TextStyle(
                        fontWeight = FontWeight.W400,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                )
                Text(
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            top = 13.dp,
                            end = 16.dp,
                            bottom = 13.dp
                        )
                        .width(38.dp)
                        .height(24.dp),
                    text = "400 ",
                    style = TextStyle(
                        fontWeight = FontWeight.W400,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                )
            }

        }
        Box(
            modifier = Modifier
                .width(375.dp)
                .height(50.dp)
                .drawBehind {

                    drawLine(
                        Color.Black,
                        Offset(0f, 0f),
                        Offset(size.width, 0f),
                    )
                }
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            top = 13.dp,

                            bottom = 13.dp
                        )
                        .width(297.dp)
                        .height(24.dp),
                    text = "Вес",
                    style = TextStyle(
                        fontWeight = FontWeight.W400,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                )
                Text(
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            top = 13.dp,
                            end = 16.dp,
                            bottom = 13.dp
                        )
                        .width(38.dp)
                        .height(24.dp),
                    text = "Вес",
                    style = TextStyle(
                        fontWeight = FontWeight.W400,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                )
            }

        }
        Box(
            modifier = Modifier
                .width(375.dp)
                .height(50.dp)
                .drawBehind {

                    drawLine(
                        Color.Black,
                        Offset(0f, 0f),
                        Offset(size.width, 0f),
                    )
                }
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            top = 13.dp,

                            bottom = 13.dp
                        )
                        .width(297.dp)
                        .height(24.dp),
                    text = "Вес",
                    style = TextStyle(
                        fontWeight = FontWeight.W400,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                )
                Text(
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            top = 13.dp,
                            end = 16.dp,
                            bottom = 13.dp
                        )
                        .width(38.dp)
                        .height(24.dp),
                    text = "Вес",
                    style = TextStyle(
                        fontWeight = FontWeight.W400,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                )
            }

        }
        Box(
            modifier = Modifier
                .width(375.dp)
                .height(50.dp)
                .drawBehind {

                    drawLine(
                        Color.Black,
                        Offset(0f, 0f),
                        Offset(size.width, 0f),
                    )
                }
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            top = 13.dp,

                            bottom = 13.dp
                        )
                        .width(297.dp)
                        .height(24.dp),
                    text = "Вес",
                    style = TextStyle(
                        fontWeight = FontWeight.W400,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                )
                Text(
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            top = 13.dp,
                            end = 16.dp,
                            bottom = 13.dp
                        )
                        .width(38.dp)
                        .height(24.dp),
                    text = "Вес",
                    style = TextStyle(
                        fontWeight = FontWeight.W400,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                )
            }

        }
        Box(
            modifier = Modifier
                .width(375.dp)
                .height(50.dp)
                .drawBehind {

                    drawLine(
                        Color.Black,
                        Offset(0f, 0f),
                        Offset(size.width, 0f),
                    )
                }
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            top = 13.dp,

                            bottom = 13.dp
                        )
                        .width(297.dp)
                        .height(24.dp),
                    text = "Вес",
                    style = TextStyle(
                        fontWeight = FontWeight.W400,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                )
                Text(
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            top = 13.dp,
                            end = 16.dp,
                            bottom = 13.dp
                        )
                        .width(38.dp)
                        .height(24.dp),
                    text = "Вес",
                    style = TextStyle(
                        fontWeight = FontWeight.W400,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                )
            }

        }
        Box(
            modifier = Modifier
                .width(375.dp)
                .height(72.dp)
                .padding(start = 16. dp,
                    top = 12. dp,
                    end = 16. dp,
                    bottom = 12. dp)
        ){
            Button(
                onClick = {
                },
                modifier = Modifier
                    .width(343.dp)
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF15412))
            ) {

            }
        }
    }
}

@Preview
@Composable
fun ProductDetailsPreview() {
    ApplicationTheme {
        ProductDetails()
    }
}