
package br.com.denisecastro.aidpidigital.ui.home.components.hero

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.ui.home.components.brand.AidpiLogo
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun HeroSection(
    modifier: Modifier = Modifier
) {
    BoxWithConstraints(
        modifier = modifier
            .fillMaxWidth()
            .height(260.dp)
            .background(AidpiSurface)
    ) {
        val illustrationSize = maxWidth * 0.52f

        HeroBackground(
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .fillMaxWidth()
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 12.dp
                )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                AidpiLogo()

                Spacer(Modifier.width(12.dp))

                Column {
                    Text(
                        text = "AIDPI Digital",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = AidpiTextPrimary
                    )

                    Text(
                        text = "Atenção Integrada à Saúde da Criança",
                        style = MaterialTheme.typography.bodySmall,
                        color = AidpiTextSecondary
                    )
                }
            }

            Spacer(Modifier.height(26.dp))

            Box(
                modifier = Modifier
                    .width(30.dp)
                    .height(3.dp)
                    .background(
                        AidpiBlue,
                        RoundedCornerShape(50)
                    )
            )

            Spacer(Modifier.height(12.dp))

            Text(
                text = "Como podemos\najudar hoje?",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = AidpiTextPrimary
            )

            Spacer(Modifier.height(10.dp))

            Text(
                text = "Selecione a principal queixa da criança para iniciar a avaliação.",
                style = MaterialTheme.typography.bodySmall,
                color = AidpiTextSecondary,
                modifier = Modifier.fillMaxWidth(0.53f)
            )
        }

        HeroIllustration(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .size(illustrationSize)
        )

        DecorativeRays(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 64.dp, end = 16.dp)
                .size(38.dp)
        )
    }
}

@Composable
private fun DecorativeRays(
    modifier: Modifier = Modifier
) {
    Canvas(modifier) {
        val blue = Color(0xFF1674E8)
        val w = size.width
        val h = size.height
        val stroke = 4.dp.toPx()

        drawLine(
            blue,
            Offset(w * 0.15f, h * 0.40f),
            Offset(w * 0.30f, h * 0.08f),
            stroke,
            cap = StrokeCap.Round
        )

        drawLine(
            blue,
            Offset(w * 0.48f, h * 0.52f),
            Offset(w * 0.76f, h * 0.24f),
            stroke,
            cap = StrokeCap.Round
        )

        drawLine(
            blue,
            Offset(w * 0.63f, h * 0.82f),
            Offset(w * 0.94f, h * 0.72f),
            stroke,
            cap = StrokeCap.Round
        )
    }
}

@Preview(showBackground = true, widthDp = 390)
@Composable
private fun HeroSectionPreview() {
    AidpiDigitalTheme {
        HeroSection()
    }
}
