package br.com.denisecastro.aidpidigital.ui.assessment.result.cards

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun ResultVitalsCard() {
    ResultSectionCard(
        title = stringResource(R.string.result_vitals_title)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                ResultVitalChip(R.string.result_vital_temperature)
                ResultVitalChip(R.string.result_vital_rr)
                ResultVitalChip(R.string.result_vital_hr)
                ResultVitalChip(R.string.result_vital_spo2)
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                ResultVitalChip(R.string.result_vital_capillary)
                ResultVitalChip(R.string.result_vital_consciousness)
            }
        }
    }
}

@Composable
private fun ResultVitalChip(
    @StringRes textRes: Int
) {
    Text(
        text = stringResource(textRes),
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

@Preview(showSystemUi = true)
@Composable
private fun ResultVitalsCardPreview() {
    AidpiDigitalTheme {
        ResultVitalsCard()
    }
}


