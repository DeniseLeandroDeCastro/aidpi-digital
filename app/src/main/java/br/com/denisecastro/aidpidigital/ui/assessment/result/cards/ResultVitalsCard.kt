package br.com.denisecastro.aidpidigital.ui.assessment.result.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun ResultVitalsCard(
    vitals: List<String> = listOf(
        stringResource(R.string.result_vital_temperature),
        stringResource(R.string.result_vital_rr),
        stringResource(R.string.result_vital_hr),
        stringResource(R.string.result_vital_spo2),
        stringResource(R.string.result_vital_capillary),
        stringResource(R.string.result_vital_consciousness)
    )
) {
    ResultSectionCard(
        title = stringResource(R.string.result_vitals_title)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            vitals.chunked(4).forEach { rowItems ->
                Row(
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    rowItems.forEach { vital ->
                        ResultVitalChip(text = vital)
                    }
                }
            }
        }
    }
}

@Composable
private fun ResultVitalChip(
    text: String
) {
    Text(
        text = text,
        color = ResultText,
        fontSize = 11.sp,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
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
