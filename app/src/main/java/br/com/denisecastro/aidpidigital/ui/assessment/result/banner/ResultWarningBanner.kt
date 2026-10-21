package br.com.denisecastro.aidpidigital.ui.assessment.result.banner

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.ResultWarningBackground
import br.com.denisecastro.aidpidigital.ui.theme.ResultWarningBorder
import br.com.denisecastro.aidpidigital.ui.theme.ResultWarningText

@Composable
fun ResultWarningBanner(
    title: String,
    description: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = ResultWarningBackground
        ),
        border = BorderStroke(
            width = 1.dp,
            color = ResultWarningBorder
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 0.dp
        )
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.Top
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_warning_circle),
                contentDescription = null,
                tint = ResultWarningText,
                modifier = Modifier.size(18.dp)
            )

            Spacer(Modifier.width(8.dp))

            Column {
                Text(
                    text = title,
                    color = ResultWarningText,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = description,
                    color = ResultWarningText,
                    fontSize = 11.sp,
                    lineHeight = 15.sp,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ResultWarningBannerPreview() {
    AidpiDigitalTheme {
        ResultWarningBanner(
            title = "TOSSE CRÔNICA - Investigar",
            description = "Tosse há 14 dias ou mais. Necessita investigação adicional."
        )
    }
}
