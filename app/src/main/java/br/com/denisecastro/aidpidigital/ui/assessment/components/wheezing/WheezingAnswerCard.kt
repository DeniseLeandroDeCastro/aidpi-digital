package br.com.denisecastro.aidpidigital.ui.assessment.components.wheezing

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun WheezingAnswerCard(
    title: String,
    description: String? = null,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(
                min = if (description != null) 66.dp else 47.dp
            )
            .clip(RoundedCornerShape(11.dp))
            .background(ResultCardBackground)
            .border(
                width = 1.dp,
                color = WheezingCardBorder,
                shape = RoundedCornerShape(11.dp)
            )
            .clickable(onClick = onClick)
            .padding(
                horizontal = 13.dp,
                vertical = 10.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = title,
                color = AssessmentNavy,
                fontSize = 12.sp,
                lineHeight = 17.sp,
                fontWeight = FontWeight.Bold
            )
            if (description != null) {
                Spacer(Modifier.height(3.dp))
                Text(
                    text = description,
                    color = AssessmentSecondary,
                    fontSize = 11.sp,
                    lineHeight = 15.sp
                )
            }
        }
        Spacer(Modifier.width(12.dp))
        Text(
            text = stringResource(R.string.assessment_next_symbol),
            color = WheezingArrow,
            fontSize = 24.sp
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun WheezingAnswerCardPreview() {
    AidpiDigitalTheme {
        WheezingAnswerCard(
            title = stringResource(R.string.wheezing_answer_yes),
            description = stringResource(R.string.wheezing_answer_yes_description),
            onClick = {}
        )
    }
}
