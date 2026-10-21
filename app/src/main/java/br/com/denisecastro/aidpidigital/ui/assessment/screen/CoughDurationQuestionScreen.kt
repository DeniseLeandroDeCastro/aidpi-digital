package br.com.denisecastro.aidpidigital.ui.assessment.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.assessment.components.answer.CoughDurationAnswerCard
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentBackground
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentHeaderBackground
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentNavy
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentProgressBlue
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentProgressTrack

@Composable
fun CoughDurationQuestionScreen(
    onBack: () -> Unit,
    onAnswerSelected: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(AssessmentBackground)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(AssessmentHeaderBackground)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 12.dp,
                        end = 16.dp,
                        top = 14.dp,
                        bottom = 12.dp
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = onBack) {
                    Icon(
                        painter = painterResource(R.drawable.ic_arrow_back),
                        contentDescription = stringResource(
                            R.string.cough_duration_back
                        ),
                        tint = AssessmentNavy
                    )
                }

                Column {
                    Text(
                        text = stringResource(
                            R.string.cough_duration_header
                        ),
                        color = AssessmentNavy,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = stringResource(
                            R.string.cough_duration_progress
                        ),
                        color = AssessmentNavy,
                        fontSize = 13.sp
                    )
                }
            }

            LinearProgressIndicator(
                progress = { 1f },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 17.dp)
                    .height(6.dp),
                color = AssessmentProgressBlue,
                trackColor = AssessmentProgressTrack
            )

            Spacer(Modifier.height(12.dp))

            HorizontalDivider(
                color = AssessmentProgressTrack
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 17.dp)
        ) {
            Spacer(Modifier.height(28.dp))

            Text(
                text = stringResource(
                    R.string.cough_duration_question
                ),
                color = AssessmentNavy,
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(Modifier.height(24.dp))

            CoughDurationAnswerCard(
                text = stringResource(R.string.cough_duration_less_14),
                onClick = { onAnswerSelected(false) }
            )

            Spacer(Modifier.height(13.dp))

            CoughDurationAnswerCard(
                text = stringResource(R.string.cough_duration_14_or_more),
                onClick = { onAnswerSelected(true) }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CoughDurationQuestionScreenPreview() {
    AidpiDigitalTheme {
        CoughDurationQuestionScreen(
            onBack = {},
            onAnswerSelected = {}
        )
    }
}
