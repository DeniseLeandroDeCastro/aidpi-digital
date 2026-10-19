package br.com.denisecastro.aidpidigital.ui.assessment.result.banner

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
fun ResultDangerBanner(
    title: String = stringResource(R.string.result_danger_title),
    description: String = stringResource(R.string.result_danger_description)
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
                text = title,
                color = ResultDangerText,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(Modifier.height(4.dp))

            Text(
                text = description,
                color = ResultDangerText,
                fontSize = 11.sp,
                lineHeight = 15.sp
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ResultDangerBannerPreview() {
    AidpiDigitalTheme {
        ResultDangerBanner()
    }
}
