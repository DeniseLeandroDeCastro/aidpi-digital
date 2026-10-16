package br.com.denisecastro.aidpidigital.ui.assessment.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.assessment.components.answer.ChildAgeAnswerCard
import br.com.denisecastro.aidpidigital.ui.assessment.components.background.AssessmentBackgroundWaves
import br.com.denisecastro.aidpidigital.ui.assessment.components.illustration.AssessmentChildIllustration
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun ChildAgeQuestionScreen(
    onBack: () -> Unit,
    onAgeSelected: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(AssessmentHeaderBackground)
    ) {
        ChildAgeHeader(onBack = onBack)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(AssessmentBackground)
        ) {
            AssessmentBackgroundWaves(
                modifier = Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                        top = 28.dp,
                        bottom = 32.dp
                    )
            ) {
                ChildAgeQuestionContent()
                Spacer(Modifier.height(74.dp))

                Column {
                    ChildAgeAnswerCard(
                        text = stringResource(R.string.child_age_under_12_months),
                        onClick = { onAgeSelected(true) }
                    )

                    Spacer(Modifier.height(14.dp))

                    ChildAgeAnswerCard(
                        text = stringResource(R.string.child_age_1_to_5_years),
                        onClick = { onAgeSelected(false) }
                    )
                }
            }
        }
    }
}

@Composable
private fun ChildAgeHeader(
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(AssessmentHeaderBackground)
            .padding(
                horizontal = 18.dp,
                vertical = 14.dp
            )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(AssessmentBackButtonBackground)
                    .clickable(onClick = onBack),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(
                        R.string.assessment_back_symbol
                    ),
                    fontSize = 34.sp,
                    lineHeight = 34.sp,
                    color = AssessmentSecondary
                )
            }

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(R.string.assessment_cough_title),
                    fontSize = 18.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = AssessmentNavy
                )

                Spacer(Modifier.height(3.dp))

                Text(
                    text = stringResource(
                        R.string.assessment_progress,
                        4,
                        7
                    ),
                    fontSize = 13.sp,
                    color = AssessmentSecondary
                )
            }
        }

        Spacer(Modifier.height(18.dp))

        LinearProgressIndicator(
            progress = { 4f / 7f },
            modifier = Modifier
                .fillMaxWidth()
                .height(7.dp)
                .clip(RoundedCornerShape(50)),
            color = AssessmentProgressBlue,
            trackColor = AssessmentProgressTrack,
            drawStopIndicator = {}
        )
    }
}

@Composable
private fun ChildAgeQuestionContent() {
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
                    R.string.child_age_question
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
                    text = stringResource(R.string.child_age_guidance),
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .width(descriptionWidth),
                    fontSize = 15.sp,
                    lineHeight = 23.sp,
                    color = AssessmentSecondary
                )
                AssessmentChildIllustration(
                    width = illustrationWidth,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .offset(y = 60.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ChildAgeQuestionScreenPreview() {
    AidpiDigitalTheme {
        ChildAgeQuestionScreen(
            onBack = {},
            onAgeSelected = {}
        )
    }
}
