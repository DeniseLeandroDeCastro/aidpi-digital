package br.com.denisecastro.aidpidigital.ui.assessment.result.alert

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun ResultAlertsCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(ResultDangerBackground)
            .border(
                width = 1.dp,
                color = ResultDangerBorder,
                shape = RoundedCornerShape(8.dp)
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

        val alerts = listOf(
            R.string.result_alert_1,
            R.string.result_alert_2,
            R.string.result_alert_3,
            R.string.result_alert_4,
            R.string.result_alert_5
        )

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

@Preview(
    showSystemUi = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun ResultAlertsCardPreview() {
    AidpiDigitalTheme {
        ResultAlertsCard()
    }
}
