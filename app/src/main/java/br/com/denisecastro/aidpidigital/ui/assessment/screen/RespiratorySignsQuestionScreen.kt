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
import br.com.denisecastro.aidpidigital.ui.assessment.components.answer.AssessmentAnswerCard
import br.com.denisecastro.aidpidigital.ui.assessment.components.background.AssessmentBackgroundWaves
import br.com.denisecastro.aidpidigital.ui.assessment.components.illustration.AssessmentChildIllustration
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun RespiratorySignsQuestionScreen(
    onBack: () -> Unit,
    onAnswerSelected: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(AssessmentHeaderBackground)
    ) {
        RespiratorySignsHeader(onBack = onBack)

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
                RespiratorySignsQuestionContent()
                Spacer(Modifier.height(14.dp))
                Column {
                    AssessmentAnswerCard(
                        text = stringResource(R.string.respiratory_signs_answer_yes),
                        icon = stringResource(R.string.assessment_danger_symbol),
                        iconColor = AssessmentDangerIcon,
                        iconBackground = AssessmentDangerBackground,
                        onClick = {
                            onAnswerSelected(true)
                        }
                    )

                    Spacer(Modifier.height(14.dp))

                    AssessmentAnswerCard(
                        text = stringResource(R.string.respiratory_signs_answer_no),
                        icon = stringResource(R.string.assessment_success_symbol),
                        iconColor = AssessmentSuccessIcon,
                        iconBackground = AssessmentSuccessBackground,
                        onClick = {
                            onAnswerSelected(false)
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun RespiratorySignsHeader(
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
                    text = stringResource(R.string.assessment_back_symbol),
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
                        3,
                        7
                    ),
                    fontSize = 13.sp,
                    color = AssessmentSecondary
                )
            }
        }

        Spacer(Modifier.height(18.dp))

        LinearProgressIndicator(
            progress = { 3f / 7f },
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
private fun RespiratorySignsQuestionContent() {
    BoxWithConstraints(
        modifier = Modifier.fillMaxWidth()
    ) {
        val illustrationWidth = maxWidth * 0.46f

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.respiratory_signs_question),
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
private fun RespiratorySignsQuestionScreenPreview() {
    AidpiDigitalTheme {
        RespiratorySignsQuestionScreen(
            onBack = {},
            onAnswerSelected = {}
        )
    }
}
