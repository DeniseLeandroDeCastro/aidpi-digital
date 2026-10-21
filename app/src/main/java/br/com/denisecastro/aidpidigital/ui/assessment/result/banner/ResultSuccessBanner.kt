package br.com.denisecastro.aidpidigital.ui.assessment.result.banner

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
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
import br.com.denisecastro.aidpidigital.ui.theme.ResultSuccessBackground
import br.com.denisecastro.aidpidigital.ui.theme.ResultSuccessBorder
import br.com.denisecastro.aidpidigital.ui.theme.ResultSuccessText

@Composable
fun ResultSuccessBanner(
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = ResultSuccessBackground
        ),
        border = BorderStroke(
            width = 1.dp,
            color = ResultSuccessBorder
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 0.dp
        )
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_check_circle),
                contentDescription = null,
                tint = ResultSuccessText,
                modifier = Modifier.size(18.dp)
            )

            Spacer(Modifier.width(8.dp))

            Column {
                Text(
                    text = title,
                    color = ResultSuccessText,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = description,
                    color = ResultSuccessText,
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
private fun ResultSuccessBannerPreview() {
    AidpiDigitalTheme {
        ResultSuccessBanner(
            title = "NÃO É PNEUMONIA",
            description = "Tosse ou resfriado comum. Tratamento sintomático em casa."
        )
    }
}
