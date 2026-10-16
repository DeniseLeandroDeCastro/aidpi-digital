package br.com.denisecastro.aidpidigital.ui.assessment.components.answer

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun RespiratoryRateAnswerCard(
    title: String,
    description: String,
    highlighted: Boolean,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (highlighted) {
                AssessmentBackground
            } else {
                AssessmentCardBackground
            }
        ),
        border = BorderStroke(
            width = if (highlighted) 2.dp else 1.dp,
            color = if (highlighted) {
                AssessmentProgressBlue
            } else {
                AssessmentCardBorder
            }
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 0.dp
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 82.dp)
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = AssessmentNavy
                )

                Text(
                    text = description,
                    fontSize = 13.sp,
                    color = AssessmentSecondary
                )
            }

            Text(
                text = stringResource(R.string.assessment_next_symbol),
                fontSize = 27.sp,
                color = if (highlighted) {
                    AssessmentProgressBlue
                } else {
                    AssessmentChevron
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RespiratoryRateAnswerCardPreview() {
    AidpiDigitalTheme {
        RespiratoryRateAnswerCard(
            title = "≥ 50 respirações por minuto",
            description = "Respiração rápida",
            highlighted = true,
            onClick = {}
        )
    }
}
