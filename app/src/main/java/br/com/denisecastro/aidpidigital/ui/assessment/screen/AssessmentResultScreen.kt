package br.com.denisecastro.aidpidigital.ui.assessment.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.ui.assessment.result.alert.ResultAlertsCard
import br.com.denisecastro.aidpidigital.ui.assessment.result.banner.ResultDangerBanner
import br.com.denisecastro.aidpidigital.ui.assessment.result.buttons.ResultNewAssessmentButton
import br.com.denisecastro.aidpidigital.ui.assessment.result.cards.ResultConductCard
import br.com.denisecastro.aidpidigital.ui.assessment.result.cards.ResultDiagnosesCard
import br.com.denisecastro.aidpidigital.ui.assessment.result.cards.ResultVitalsCard
import br.com.denisecastro.aidpidigital.ui.assessment.result.header.ResultHeader
import br.com.denisecastro.aidpidigital.ui.assessment.result.note.ResultClinicalNote

import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.ResultBackground

@Composable
fun AssessmentResultScreen(
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
            ResultDangerBanner()

            Spacer(Modifier.height(14.dp))
            ResultDiagnosesCard()

            Spacer(Modifier.height(14.dp))
            ResultConductCard()

            Spacer(Modifier.height(14.dp))
            ResultVitalsCard()

            Spacer(Modifier.height(14.dp))
            ResultAlertsCard()

            Spacer(Modifier.height(14.dp))
            ResultClinicalNote()

            Spacer(Modifier.height(18.dp))
            ResultNewAssessmentButton(
                onClick = onNewAssessment
            )

            Spacer(Modifier.height(22.dp))
        }
    }
}

@Preview(
    name = "Resultado da Avaliação",
    showSystemUi = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun AssessmentResultScreenPreview() {
    AidpiDigitalTheme {
        AssessmentResultScreen(
            onBack = {},
            onNewAssessment = {}
        )
    }
}
