package br.com.denisecastro.aidpidigital.ui.assessment.components.illustration

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme

@Composable
fun AssessmentChildIllustration(
    width: Dp,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(R.drawable.assessment_child),
        contentDescription = stringResource(R.string.assessment_child_description),
        contentScale = ContentScale.Fit,
        modifier = modifier
            .width(width)
            .height(260.dp)
            .graphicsLayer {
                scaleX = 1.12f
                scaleY = 1.12f
                transformOrigin = TransformOrigin(
                    pivotFractionX = 1f,
                    pivotFractionY = 0f
                )
            }
            .offset(
                x = 14.dp,
                y = (-50).dp
            )
    )
}

@Preview(showSystemUi = true)
@Composable
private fun AssessmentChildIllustrationPreview() {
    AidpiDigitalTheme {
        AssessmentChildIllustration(
            width = 170.dp
        )
    }
}
