package br.com.denisecastro.aidpidigital.ui.assessment.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.assessment.result.alert.ResultAlertsCard
import br.com.denisecastro.aidpidigital.ui.assessment.result.banner.ResultDangerBanner
import br.com.denisecastro.aidpidigital.ui.assessment.result.buttons.PrimaryButton
import br.com.denisecastro.aidpidigital.ui.assessment.result.cards.ResultConductCard
import br.com.denisecastro.aidpidigital.ui.assessment.result.cards.ResultDiagnosesCard
import br.com.denisecastro.aidpidigital.ui.assessment.result.cards.ResultVitalsCard
import br.com.denisecastro.aidpidigital.ui.assessment.result.header.ResultHeader
import br.com.denisecastro.aidpidigital.ui.assessment.result.note.ResultClinicalNote
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.ResultBackground

@Composable
fun PneumoniaResultScreen(
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
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 22.dp)
        ) {
            Spacer(Modifier.height(14.dp))

            ResultDangerBanner(
                title = stringResource(R.string.pneumonia_result_title),
                description = stringResource(
                    R.string.pneumonia_result_description
                )
            )

            Spacer(Modifier.height(14.dp))

            ResultDiagnosesCard(
                diagnoses = listOf(
                    stringResource(R.string.pneumonia_diagnosis_1),
                    stringResource(R.string.pneumonia_diagnosis_2)
                )
            )

            Spacer(Modifier.height(14.dp))

            ResultConductCard(
                conducts = listOf(
                    stringResource(R.string.pneumonia_conduct_1),
                    stringResource(R.string.pneumonia_conduct_2),
                    stringResource(R.string.pneumonia_conduct_3)
                )
            )

            Spacer(Modifier.height(14.dp))

            ResultVitalsCard(
                vitals = listOf(
                    stringResource(R.string.pneumonia_vital_rr),
                    stringResource(R.string.pneumonia_vital_temperature),
                    stringResource(R.string.pneumonia_vital_pattern)
                )
            )

            Spacer(Modifier.height(14.dp))

            ResultAlertsCard(
                alerts = listOf(
                    stringResource(R.string.pneumonia_alert_1),
                    stringResource(R.string.pneumonia_alert_2),
                    stringResource(R.string.pneumonia_alert_3)
                )
            )

            Spacer(Modifier.height(14.dp))

            ResultClinicalNote(
                description = stringResource(
                    R.string.pneumonia_clinical_note
                )
            )

            Spacer(Modifier.height(18.dp))
            PrimaryButton(onClick = onNewAssessment)
            Spacer(Modifier.height(22.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun PneumoniaResultScreenPreview() {
    AidpiDigitalTheme {
        PneumoniaResultScreen(
            onBack = {},
            onNewAssessment = {}
        )
    }
}


