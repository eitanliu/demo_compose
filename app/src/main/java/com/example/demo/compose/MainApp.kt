package com.example.demo.compose

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MainApp(
    appState: MainAppState
) {
    NavigationSuiteScaffold(
        navigationSuiteItems = {
            appState.tabs.forEachIndexed { index, text ->
                item(
                    selected = index == 0,
                    onClick = {},
                    icon = {},
                    label = {
                        Text(text)
                    }
                )
            }
        },
    ) {
        DrawColorRing()
    }

}

@Preview
@Composable
fun DrawColorRing() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        var radius = 300.dp
        var ringWidth = 30.dp
        Canvas(
            modifier = Modifier.size(radius)
        ) {
            drawCircle( // 画圆
                brush = Brush.sweepGradient(
                    listOf(Color.Red, Color.Green, Color.Red),
                    Offset(radius.toPx() / 2f, radius.toPx() / 2f)
                ),
                radius = radius.toPx() / 2f,
                style = Stroke(
                    width = ringWidth.toPx()
                )
            )
        }
    }
}