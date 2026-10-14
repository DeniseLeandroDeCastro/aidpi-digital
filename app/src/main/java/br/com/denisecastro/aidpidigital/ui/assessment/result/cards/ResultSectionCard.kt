package br.com.denisecastro.aidpidigital.ui.assessment.result.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import androidx.compose.ui.res.stringResource
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun ResultSectionCard(
    title: String,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(ResultCardBackground)
            .border(
                width = 1.dp,
                color = ResultCardBorder,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(12.dp)
    ) {
        Text(
            text = title,
            color = ResultText,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(8.dp))

        content()
    }
}

@Preview(
    showSystemUi = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun ResultSectionCardPreview() {
    AidpiDigitalTheme {
        ResultSectionCard(
            title = stringResource(R.string.result_diagnoses_title)
        ) {
            Text(
                text = stringResource(R.string.result_diagnosis_1),
                color = ResultText
            )
        }
    }
}