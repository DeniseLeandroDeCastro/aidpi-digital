package br.com.denisecastro.aidpidigital.ui.assessment.components.answer

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun ChildAgeAnswerCard(
    text: String,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 88.dp),
        shape = RoundedCornerShape(22.dp),
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
                .defaultMinSize(minHeight = 88.dp)
                .padding(
                    horizontal = 16.dp,
                    vertical = 16.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = text,
                modifier = Modifier.weight(1f),
                fontSize = 15.sp,
                lineHeight = 21.sp,
                fontWeight = FontWeight.Bold,
                color = AssessmentNavy
            )

            Text(
                text = stringResource(
                    R.string.assessment_next_symbol
                ),
                fontSize = 27.sp,
                color = AssessmentChevron
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ChildAgeAnswerCardPreview() {
    AidpiDigitalTheme {
        ChildAgeAnswerCard(
            text = stringResource(
                R.string.child_age_under_12_months
            ),
            onClick = {}
        )
    }
}
