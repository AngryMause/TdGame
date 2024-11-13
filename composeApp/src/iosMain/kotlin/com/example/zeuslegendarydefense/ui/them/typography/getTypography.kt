package com.example.zeuslegendarydefense.ui.them.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import zeuslegendarydefense.composeapp.generated.resources.Res

@Composable
fun getTypography(): Typography {
    val font = Font(
        Res.font.jainipurva_regular, weight = FontWeight.Bold, style = FontStyle.Normal
    )
    val balooThambi = FontFamily(
        font
    )
    return Typography(
        h1 = TextStyle(
            fontFamily = balooThambi,
            fontSize = 38.sp,

            fontWeight = FontWeight.Bold,
        ),
        h2 = TextStyle(
            fontFamily = balooThambi,
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
        ),
        h3 = TextStyle(
            fontFamily = balooThambi,
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
        ),
        h4 = TextStyle(
            fontFamily = balooThambi,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        ),
        h5 = TextStyle(
            fontFamily = balooThambi,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
        ),
        body1 = TextStyle(
            fontFamily = balooThambi,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
        )
    )
}