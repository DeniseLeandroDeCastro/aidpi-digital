package br.com.denisecastro.aidpidigital.ui.assessment.result.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun ResultDiagnosesCard(
    diagnoses: List<String> = listOf(
        stringResource(R.string.result_diagnosis_1),
        stringResource(R.string.result_diagnosis_2),
        stringResource(R.string.result_diagnosis_3),
        stringResource(R.string.result_diagnosis_4)
    )
) {
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
                    text = diagnosis,
                    color = ResultText,
                    fontSize = 12.sp,
                    lineHeight = 17.sp
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ResultDiagnosesCardPreview() {
    AidpiDigitalTheme {
        ResultDiagnosesCard()
    }
}
