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
import br.com.denisecastro.aidpidigital.ui.assessment.components.answer.RespiratoryRateAnswerCard
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun RespiratoryRateUnder12Screen(
    onBack: () -> Unit,
    onAnswerSelected: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(AssessmentHeaderBackground)
    ) {
        RespiratoryRateUnder12Header(onBack = onBack)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(AssessmentBackground)
                .verticalScroll(rememberScrollState())
                .padding(
                    horizontal = 20.dp,
                    vertical = 28.dp
                )
        ) {
            Text(
                text = "Frequência respiratória para criança < 12 meses",
                fontSize = 20.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight.Bold,
                color = AssessmentNavy
            )

            Spacer(Modifier.height(24.dp))

            RespiratoryRateAnswerCard(
                title = "≥ 50 respirações por minuto",
                description = "Respiração rápida",
                highlighted = true,
                onClick = {
                    onAnswerSelected(true)
                }
            )

            Spacer(Modifier.height(14.dp))

            RespiratoryRateAnswerCard(
                title = "< 50 respirações por minuto",
                description = "Respiração normal",
                highlighted = false,
                onClick = {
                    onAnswerSelected(false)
                }
            )
        }
    }
}

@Composable
private fun RespiratoryRateUnder12Header(
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(AssessmentHeaderBackground)
            .padding(horizontal = 18.dp, vertical = 14.dp)
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

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.assessment_cough_title),
                    fontSize = 18.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = AssessmentNavy
                )

                Spacer(Modifier.height(3.dp))

                Text(
                    text = stringResource(R.string.assessment_progress, 5, 7),
                    fontSize = 13.sp,
                    color = AssessmentSecondary
                )
            }
        }

        Spacer(Modifier.height(18.dp))

        LinearProgressIndicator(
            progress = { 5f / 7f },
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

@Preview(showSystemUi = true)
@Composable
private fun RespiratoryRateUnder12ScreenPreview() {
    AidpiDigitalTheme {
        RespiratoryRateUnder12Screen(
            onBack = {},
            onAnswerSelected = {}
        )
    }
}
