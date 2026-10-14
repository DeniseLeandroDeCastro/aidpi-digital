package br.com.denisecastro.aidpidigital.ui.assessment.components.answer

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.*

@Composable
fun AssessmentAnswerCard(
    text: String,
    icon: String,
    iconColor: Color,
    iconBackground: Color,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(22.dp))
            .background(AssessmentCardBackground)
            .border(
                width = 1.dp,
                color = AssessmentCardBorder,
                shape = RoundedCornerShape(22.dp)
            )
            .clickable(onClick = onClick)
            .defaultMinSize(minHeight = 88.dp)
            .padding(
                horizontal = 16.dp,
                vertical = 16.dp
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = Modifier
                .size(52.dp)
                .clip(CircleShape)
                .background(iconBackground),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = icon,
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                color = iconColor
            )
        }

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

@Preview(
    showSystemUi = true,
    widthDp = 390,
    heightDp = 844
)
@Composable
private fun AssessmentAnswerCardPreview() {
    AidpiDigitalTheme {
        AssessmentAnswerCard(
            text = stringResource(R.string.assessment_answer_yes),
            icon = stringResource(R.string.assessment_danger_symbol),
            iconColor = AssessmentDangerIcon,
            iconBackground = AssessmentDangerBackground,
            onClick = {}
        )
    }
}
