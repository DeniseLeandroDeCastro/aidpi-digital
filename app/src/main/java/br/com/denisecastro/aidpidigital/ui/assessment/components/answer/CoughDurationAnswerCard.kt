package br.com.denisecastro.aidpidigital.ui.assessment.components.answer

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentCardBackground
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentCardBorder
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentChevron
import br.com.denisecastro.aidpidigital.ui.theme.AssessmentNavy

@Composable
fun CoughDurationAnswerCard(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = AssessmentCardBackground
        ),
        border = BorderStroke(
            width = 1.dp,
            color = AssessmentCardBorder
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 0.dp
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(58.dp)
                .padding(horizontal = 17.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = text,
                color = AssessmentNavy,
                fontSize = 16.sp
            )

            Icon(
                painter = painterResource(
                    R.drawable.ic_chevron_right
                ),
                contentDescription = null,
                tint = AssessmentChevron,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CoughDurationAnswerCardPreview() {
    AidpiDigitalTheme {
        CoughDurationAnswerCard(
            text = "Menos de 14 dias",
            onClick = {}
        )
    }
}
