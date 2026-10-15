package br.com.denisecastro.aidpidigital.ui.assessment.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import br.com.denisecastro.aidpidigital.ui.assessment.result.buttons.PrimaryButton
import br.com.denisecastro.aidpidigital.ui.assessment.result.cards.ResultSectionCard
import br.com.denisecastro.aidpidigital.ui.assessment.result.header.ResultHeader
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.ResultAccentBlue
import br.com.denisecastro.aidpidigital.ui.theme.ResultBackground
import br.com.denisecastro.aidpidigital.ui.theme.ResultChipBackground
import br.com.denisecastro.aidpidigital.ui.theme.ResultDangerBackground
import br.com.denisecastro.aidpidigital.ui.theme.ResultDangerBorder
import br.com.denisecastro.aidpidigital.ui.theme.ResultDangerText
import br.com.denisecastro.aidpidigital.ui.theme.ResultNoteBackground
import br.com.denisecastro.aidpidigital.ui.theme.ResultNoteBorder
import br.com.denisecastro.aidpidigital.ui.theme.ResultNoteText
import br.com.denisecastro.aidpidigital.ui.theme.ResultNumberBackground
import br.com.denisecastro.aidpidigital.ui.theme.ResultText

@Composable
fun RespiratorySignsResultScreen(
    onBack: () -> Unit,
    onNewAssessment: () -> Unit,
    modifier: Modifier = Modifier
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
                .verticalScroll(androidx.compose.foundation.rememberScrollState())
                .padding(horizontal = 22.dp)
        ) {
            Spacer(Modifier.height(14.dp))
            RespiratoryDangerBanner()
            Spacer(Modifier.height(14.dp))
            RespiratoryDiagnosesCard()
            Spacer(Modifier.height(14.dp))
            RespiratoryConductCard()
            Spacer(Modifier.height(14.dp))
            RespiratoryVitalsCard()
            Spacer(Modifier.height(14.dp))
            RespiratoryAlertsCard()
            Spacer(Modifier.height(14.dp))
            RespiratoryClinicalNote()
            Spacer(Modifier.height(18.dp))
            PrimaryButton(onClick = onNewAssessment)
            Spacer(Modifier.height(22.dp))
        }
    }
}

@Composable
private fun RespiratoryDangerBanner() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(ResultDangerBackground)
            .border(
                1.dp,
                ResultDangerBorder,
                RoundedCornerShape(8.dp)
            )
            .padding(12.dp)
    ) {
        Text(
            text = stringResource(R.string.respiratory_result_danger_title),
            color = ResultDangerText,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(4.dp))
        Text(
            text = stringResource(R.string.respiratory_result_danger_description),
            color = ResultDangerText,
            fontSize = 11.sp,
            lineHeight = 15.sp
        )
    }
}

@Composable
private fun RespiratoryDiagnosesCard() {
    val diagnoses = listOf(
        R.string.respiratory_result_diagnosis_1,
        R.string.respiratory_result_diagnosis_2,
        R.string.respiratory_result_diagnosis_3
    )

    ResultSectionCard(
        title = stringResource(R.string.result_diagnoses_title)
    ) {
        diagnoses.forEach { diagnosis ->
            Row(
                modifier = Modifier.padding(vertical = 3.dp),
                verticalAlignment = Alignment.Top
            ) {
                Box(
                    modifier = Modifier
                        .padding(top = 6.dp)
                        .size(5.dp)
                        .clip(CircleShape)
                        .background(ResultAccentBlue)
                )

                Spacer(Modifier.width(7.dp))

                Text(
                    text = stringResource(diagnosis),
                    color = ResultText,
                    fontSize = 12.sp,
                    lineHeight = 17.sp
                )
            }
        }
    }
}

@Composable
private fun RespiratoryConductCard() {
    val conducts = listOf(
        R.string.respiratory_result_conduct_1,
        R.string.respiratory_result_conduct_2,
        R.string.respiratory_result_conduct_3,
        R.string.respiratory_result_conduct_4,
        R.string.respiratory_result_conduct_5,
        R.string.respiratory_result_conduct_6
    )

    ResultSectionCard(
        title = stringResource(R.string.result_conduct_title)
    ) {
        conducts.forEachIndexed { index, conduct ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                verticalAlignment = Alignment.Top
            ) {
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .clip(CircleShape)
                        .background(ResultNumberBackground),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = (index + 1).toString(),
                        color = ResultAccentBlue,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(Modifier.width(10.dp))
                Text(
                    text = stringResource(conduct),
                    modifier = Modifier.weight(1f),
                    color = ResultText,
                    fontSize = 12.sp,
                    lineHeight = 18.sp
                )
            }
        }
    }
}

@Composable
private fun RespiratoryVitalsCard() {
    val vitals = listOf(
        R.string.result_vital_rr,
        R.string.result_vital_spo2,
        R.string.result_vital_hr,
        R.string.result_vital_temperature
    )
    ResultSectionCard(
        title = stringResource(
            R.string.result_vitals_title
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            vitals.forEach { vital ->
                Text(
                    text = stringResource(vital),
                    color = ResultText,
                    fontSize = 11.sp,
                    maxLines = 1,
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(ResultChipBackground)
                        .padding(
                            horizontal = 8.dp,
                            vertical = 5.dp
                        )
                )
            }
        }
    }
}

@Composable
private fun RespiratoryAlertsCard() {
    val alerts = listOf(
        R.string.respiratory_result_alert_1,
        R.string.respiratory_result_alert_2,
        R.string.respiratory_result_alert_3,
        R.string.respiratory_result_alert_4,
        R.string.respiratory_result_alert_5
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(ResultDangerBackground)
            .border(
                1.dp,
                ResultDangerBorder,
                RoundedCornerShape(8.dp)
            )
            .padding(12.dp)
    ) {
        Text(
            text = stringResource(R.string.result_alert_title),
            color = ResultDangerText,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(8.dp))
        alerts.forEach { alert ->
            Text(
                text = stringResource(alert),
                color = ResultDangerText,
                fontSize = 12.sp,
                lineHeight = 19.sp,
                modifier = Modifier.padding(start = 18.dp)
            )
        }
    }
}

@Composable
private fun RespiratoryClinicalNote() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(ResultNoteBackground)
            .border(
                1.dp,
                ResultNoteBorder,
                RoundedCornerShape(8.dp)
            )
            .padding(12.dp)
    ) {
        Text(
            text = stringResource(R.string.result_note_title),
            color = ResultNoteText,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(6.dp))
        Text(
            text = stringResource(R.string.respiratory_result_note_description),
            color = ResultNoteText,
            fontSize = 12.sp,
            lineHeight = 17.sp,
            modifier = Modifier.padding(start = 18.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun RespiratorySignsResultScreenPreview() {
    AidpiDigitalTheme {
        RespiratorySignsResultScreen(
            onBack = {},
            onNewAssessment = {}
        )
    }
}
