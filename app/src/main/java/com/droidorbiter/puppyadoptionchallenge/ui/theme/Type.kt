package com.droidorbiter.puppyadoptionchallenge.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
        body1 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        )

        /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */

)

val AppTypography = Typography(
        body1 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                lineHeight = 22.sp,
                fontSize = 16.sp
        ),
        h1 = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W700,
                fontSize = 28.sp,
                color = Color.Black
        ),
        h2 = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W700,
                lineHeight = 42.sp,
                letterSpacing = 2.sp ,
                fontSize = 25.sp,
                color = Color.White
        ),
        h3 = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W700,
                fontSize = 20.sp,
                color = Color.White
        ),
        h4 = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W700,
                fontSize = 28.sp,
                color = Color.White
        )
)

val HeaderTypography = Typography(
        h1 = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W900,
                lineHeight = 35.sp,
                letterSpacing = 2.sp ,
                fontSize = 28.sp,
                color = Color.White
        )
)

