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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun ResultConductCard(
    conducts: List<String> = listOf(
        stringResource(R.string.result_conduct_1),
        stringResource(R.string.result_conduct_2),
        stringResource(R.string.result_conduct_3),
        stringResource(R.string.result_conduct_4),
        stringResource(R.string.result_conduct_5),
        stringResource(R.string.result_conduct_6)
    )
) {
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
                    text = conduct,
                    modifier = Modifier.weight(1f),
                    color = ResultText,
                    fontSize = 12.sp,
                    lineHeight = 18.sp
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ResultConductCardPreview() {
    AidpiDigitalTheme {
        ResultConductCard()
    }
}
