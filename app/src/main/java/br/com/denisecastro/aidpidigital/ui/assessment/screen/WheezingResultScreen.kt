package br.com.denisecastro.aidpidigital.ui.assessment.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.assessment.result.header.ResultHeader
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentNavy
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentProgressBlue
import br.com.denisecastro.aidpidigital.ui.theme.ResultBackground
import br.com.denisecastro.aidpidigital.ui.theme.ResultCardBackground
import br.com.denisecastro.aidpidigital.ui.assessment.result.buttons.PrimaryButton
import br.com.denisecastro.aidpidigital.ui.theme.WarningBackground
import br.com.denisecastro.aidpidigital.ui.theme.WarningBorder
import br.com.denisecastro.aidpidigital.ui.theme.WarningText


@Composable
fun WheezingResultScreen(
    onBack: () -> Unit,
    onNewAssessment: () -> Unit,
    modifier: Modifier = Modifier,
    isLoading: Boolean = false
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(ResultBackground)
    ) {
        ResultHeader(onBack = onBack)

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 22.dp)
        ) {
            Spacer(Modifier.height(14.dp))
            WheezingWarningCard()
            Spacer(Modifier.height(14.dp))
            WheezingDiagnosesCard()
            Spacer(Modifier.height(14.dp))
            WheezingConductCard()
            Spacer(Modifier.height(14.dp))
            WheezingClinicalNoteCard()
            Spacer(Modifier.height(18.dp))
            PrimaryButton(
                onClick = onNewAssessment,
                isLoading = isLoading
            )
            Spacer(Modifier.height(22.dp))
        }
    }
}

@Composable
private fun WheezingWarningCard() {
    WheezingCard(
        backgroundColor = MaterialTheme.colorScheme.tertiaryContainer,
        borderColor = MaterialTheme.colorScheme.tertiary
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = stringResource(R.string.wheezing_result_warning_title),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleSmall
            )

            Text(
                text = stringResource(R.string.wheezing_result_warning_description),
                color = Color.White,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
private fun WheezingDiagnosesCard() {
    WheezingCard {
        Column(
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            WheezingSectionTitle(
                text = stringResource(
                    R.string.wheezing_result_diagnoses_title
                )
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(8.dp)
                        .background(
                            AssessmentProgressBlue,
                            CircleShape
                        )
                )
                Text(
                    text = stringResource(R.string.wheezing_result_diagnosis),
                    color = AssessmentNavy,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
private fun WheezingConductCard() {
    val recommendations = listOf(
        R.string.wheezing_result_recommendation_1,
        R.string.wheezing_result_recommendation_2,
        R.string.wheezing_result_recommendation_3,
        R.string.wheezing_result_recommendation_4
    )

    WheezingCard {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            WheezingSectionTitle(
                text = stringResource(
                    R.string.wheezing_result_recommendations_title
                )
            )
            recommendations.forEachIndexed { index, textRes ->
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(28.dp)
                            .background(
                                AssessmentProgressBlue,
                                CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${index + 1}",
                            color = ResultCardBackground,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Text(
                        text = stringResource(textRes),
                        color = AssessmentNavy,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}
@Composable
private fun WheezingClinicalNoteCard() {
    WheezingCard(
        backgroundColor = MaterialTheme.colorScheme.primaryContainer,
        borderColor = AssessmentProgressBlue
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = stringResource(R.string.wheezing_result_note_title),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = stringResource(R.string.wheezing_result_note_description),
                color = Color.White,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
private fun WheezingCard(
    backgroundColor: Color = ResultCardBackground,
    borderColor: Color = MaterialTheme.colorScheme.outlineVariant,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        ),
        border = BorderStroke(1.dp, borderColor),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Box(
            modifier = Modifier.padding(16.dp)
        ) {
            content()
        }
    }
}

@Composable
private fun WheezingSectionTitle(text: String) {
    Text(
        text = text,
        color = AssessmentNavy,
        fontWeight = FontWeight.Bold,
        style = MaterialTheme.typography.titleMedium
    )
}

@Preview(showSystemUi = true)
@Composable
private fun WheezingResultScreenPreview() {
    AidpiDigitalTheme {
        WheezingResultScreen(
            onBack = {},
            onNewAssessment = {}
        )
    }
}
