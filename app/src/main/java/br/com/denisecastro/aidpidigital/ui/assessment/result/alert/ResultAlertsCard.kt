package br.com.denisecastro.aidpidigital.ui.assessment.result.alert

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun ResultAlertsCard(
    alerts: List<String> = listOf(
        stringResource(R.string.result_alert_1),
        stringResource(R.string.result_alert_2),
        stringResource(R.string.result_alert_3),
        stringResource(R.string.result_alert_4),
        stringResource(R.string.result_alert_5)
    )
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = ResultDangerBackground
        ),
        border = BorderStroke(
            width = 1.dp,
            color = ResultDangerBorder
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 0.dp
        )
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
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
                    text = alert,
                    color = ResultDangerText,
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    modifier = Modifier.padding(start = 18.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ResultAlertsCardPreview() {
    AidpiDigitalTheme {
        ResultAlertsCard()
    }
}
