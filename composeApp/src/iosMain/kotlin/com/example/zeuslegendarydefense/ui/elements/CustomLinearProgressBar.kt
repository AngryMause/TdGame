package com.example.zeuslegendarydefense.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import zeuslegendarydefense.composeapp.generated.resources.Res

@Composable
fun CustomLinearProgressBar(
    modifier: Modifier = Modifier,
    progress: Float,
    background: DrawableResource,
    isShowLoading: Boolean = true
) {
    Box(
        modifier = modifier
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            LinearProgressIndicator(
                color = Yellow, modifier = Modifier.fillMaxWidth().paint(
                    painterResource(background), contentScale = ContentScale.FillBounds
                ).padding(12.dp)
            )
            if (isShowLoading) Image(
                painter = painterResource(Res.drawable.loading),
                contentDescription = null
            )
        }
    }
}