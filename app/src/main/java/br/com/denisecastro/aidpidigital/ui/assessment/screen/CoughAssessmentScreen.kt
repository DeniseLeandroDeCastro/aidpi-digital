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
import br.com.denisecastro.aidpidigital.ui.assessment.components.answer.AssessmentAnswerCard
import br.com.denisecastro.aidpidigital.ui.assessment.components.background.AssessmentBackgroundWaves
import br.com.denisecastro.aidpidigital.ui.assessment.components.header.AssessmentHeader
import br.com.denisecastro.aidpidigital.ui.assessment.components.question.AssessmentQuestionContent
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun CoughAssessmentScreen(
    onBack: () -> Unit,
    onAnswerSelected: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(AssessmentHeaderBackground)
    ) {
        AssessmentHeader(onBack = onBack)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(AssessmentBackground)
        ) {
            AssessmentBackgroundWaves(modifier = Modifier.fillMaxSize())
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
                AssessmentQuestionContent()
                Spacer(Modifier.height(14.dp))
                Column()
                {
                    AssessmentAnswerCard(
                        text = stringResource(R.string.assessment_answer_yes),
                        icon = stringResource(R.string.assessment_danger_symbol),
                        iconColor = AssessmentDangerIcon,
                        iconBackground = AssessmentDangerBackground,
                        onClick = { onAnswerSelected(true) }
                    )

                    Spacer(Modifier.height(14.dp))
                    AssessmentAnswerCard(
                        text = stringResource(R.string.assessment_answer_no),
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

@Preview(showSystemUi = true)
@Composable
private fun CoughAssessmentScreenPreview() {
    AidpiDigitalTheme {
        CoughAssessmentScreen(
            onBack = {},
            onAnswerSelected = {}
        )
    }
}
