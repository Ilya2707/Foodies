package com.example.foodies.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.foodies.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp,
        lineHeight = 16.sp,
        color = Color.Black
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    )
    ,
    labelSmall = TextStyle(
        fontStyle = FontStyle(R.font.roboto_light),
        fontWeight = FontWeight.W500,
        fontSize = 16.sp,
        lineHeight = 16.sp,
        color = Color(0xFFFFFFFF)
    ),
    labelMedium = TextStyle(
        fontStyle = FontStyle(R.font.roboto_light),
        fontWeight = FontWeight.W500,
        fontSize = 16.sp,
        lineHeight = 16.sp,
        color = Color.Black
    ),
    bodyMedium = TextStyle(
        fontStyle = FontStyle(R.font.roboto_light),
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        color = Color.Gray
    )
)