package br.com.denisecastro.aidpidigital.ui.assessment.components.question

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.assessment.components.illustration.AssessmentChildIllustration
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
                text = stringResource(
                    R.string.assessment_danger_question
                ),
                modifier = Modifier.fillMaxWidth(0.78f),
                fontSize = 24.sp,
                lineHeight = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = AssessmentNavy
            )

            Spacer(Modifier.height(18.dp))

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

                AssessmentChildIllustration(
                    width = illustrationWidth,
                    modifier = Modifier.align(Alignment.TopEnd)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun AssessmentQuestionContentPreview() {
    AidpiDigitalTheme {
        AssessmentQuestionContent()
    }
}
