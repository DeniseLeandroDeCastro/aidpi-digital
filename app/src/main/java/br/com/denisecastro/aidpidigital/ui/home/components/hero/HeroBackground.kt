
package br.com.denisecastro.aidpidigital.ui.home.components.hero

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HeroBackground(
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        val path = Path().apply {
            // Topo arredondado, dentro da área visível
            moveTo(w * 0.98f, h * 0.17f)

            cubicTo(
                w * 0.87f, h * 0.04f,
                w * 0.73f, h * 0.14f,
                w * 0.63f, h * 0.30f
            )

            // Entrada suave pela esquerda
            cubicTo(
                w * 0.48f, h * 0.38f,
                w * 0.46f, h * 0.54f,
                w * 0.59f, h * 0.67f
            )

            // Parte inferior arredondada
            cubicTo(
                w * 0.68f, h * 0.77f,
                w * 0.72f, h * 0.91f,
                w * 0.63f, h * 0.98f
            )

            lineTo(w * 0.98f, h * 0.98f)

            // Lateral direita
            cubicTo(
                w * 0.995f, h * 0.80f,
                w * 0.995f, h * 0.36f,
                w * 0.98f, h * 0.17f
            )

            close()
        }

        drawPath(
            path = path,
            brush = Brush.linearGradient(
                colors = listOf(
                    Color(0xFFE0EFFF),
                    Color(0xFFB6DAFF),
                    Color(0xFF89C4FF)
                ),
                start = Offset(w * 0.60f, h * 0.15f),
                end = Offset(w, h)
            )
        )
    }
}

@Preview(showBackground = true, widthDp = 390, heightDp = 270)
@Composable
private fun HeroBackgroundPreview() {
    Box(
        modifier = Modifier.size(390.dp, 270.dp)
    ) {
        HeroBackground(Modifier.fillMaxSize())
    }
}
