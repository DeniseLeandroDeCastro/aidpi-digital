package br.com.denisecastro.aidpidigital.ui.assessment.components.background

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun AssessmentBackgroundWaves(
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        val upperWave = Path().apply {
            moveTo(w, 0f)
            cubicTo(
                w * 0.72f, h * 0.07f,
                w * 0.55f, h * 0.23f,
                w * 0.58f, h * 0.36f
            )
            cubicTo(
                w * 0.67f, h * 0.49f,
                w * 0.88f, h * 0.52f,
                w, h * 0.57f
            )
            lineTo(w, 0f)
            close()
        }

        drawPath(
            path = upperWave,
            color = AssessmentWavePrimary
        )

        val bottomWave = Path().apply {
            moveTo(0f, h * 0.69f)
            cubicTo(
                w * 0.28f, h * 0.86f,
                w * 0.53f, h * 0.85f,
                w, h * 0.69f
            )
            lineTo(w, h)
            lineTo(0f, h)
            close()
        }

        drawPath(
            path = bottomWave,
            color = AssessmentWavePrimary
        )

        val lowerWave = Path().apply {
            moveTo(0f, h * 0.91f)
            cubicTo(
                w * 0.38f, h * 0.96f,
                w * 0.72f, h * 0.78f,
                w, h * 0.78f
            )
            lineTo(w, h)
            lineTo(0f, h)
            close()
        }

        drawPath(
            path = lowerWave,
            color = AssessmentWaveSecondary
        )
    }
}

@Preview(
    showSystemUi = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun AssessmentBackgroundWavesPreview() {
    AidpiDigitalTheme {
        AssessmentBackgroundWaves(
            modifier = Modifier.fillMaxSize()
        )
    }
}