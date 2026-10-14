package br.com.denisecastro.aidpidigital.ui.assessment.components.question

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun AssessmentQuestionContent() {
    BoxWithConstraints(
        modifier = Modifier.fillMaxWidth()
    ) {
        val illustrationWidth = maxWidth * 0.46f
        val descriptionWidth = maxWidth - illustrationWidth

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.assessment_danger_question),
                modifier = Modifier.fillMaxWidth(0.78f),
                fontSize = 24.sp,
                lineHeight = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = AssessmentNavy
            )

            Spacer(modifier = Modifier.height(18.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
            ) {
                Text(
                    text = stringResource(
                        R.string.assessment_danger_description
                    ),
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .width(descriptionWidth),
                    fontSize = 15.sp,
                    lineHeight = 23.sp,
                    color = AssessmentSecondary
                )
                Image(
                    painter = painterResource(R.drawable.assessment_child),
                    contentDescription = stringResource(
                        R.string.assessment_child_description
                    ),
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .width(illustrationWidth)
                        .height(260.dp)
                        .graphicsLayer {
                            scaleX = 1.12f
                            scaleY = 1.12f
                            transformOrigin = TransformOrigin(
                                pivotFractionX = 1f,
                                pivotFractionY = 0f
                            )
                        }
                        .offset(x = 14.dp, y = (-120).dp)
                )
            }
        }
    }
}

@Preview(
    showSystemUi = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun AssessmentQuestionContentPreview() {
    AidpiDigitalTheme {
        AssessmentQuestionContent()
    }
}