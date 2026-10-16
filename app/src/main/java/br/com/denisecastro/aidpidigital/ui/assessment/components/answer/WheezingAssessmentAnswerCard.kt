package br.com.denisecastro.aidpidigital.ui.assessment.components.answer

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
fun WheezingAssessmentAnswerCard(
    title: String,
    icon: String,
    iconColor: Color,
    iconBackground: Color,
    onClick: () -> Unit,
    description: String? = null
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

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    fontSize = 15.sp,
                    lineHeight = 21.sp,
                    fontWeight = FontWeight.Bold,
                    color = AssessmentNavy
                )

                if (description != null) {
                    Spacer(Modifier.height(4.dp))

                    Text(
                        text = description,
                        fontSize = 12.sp,
                        lineHeight = 17.sp,
                        color = AssessmentSecondary
                    )
                }
            }

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
private fun WheezingAssessmentAnswerCardPreview() {
    AidpiDigitalTheme {
        WheezingAssessmentAnswerCard(
            title = stringResource(R.string.wheezing_answer_yes),
            description = stringResource(
                R.string.wheezing_answer_yes_description
            ),
            icon = stringResource(R.string.assessment_danger_symbol),
            iconColor = AssessmentDangerIcon,
            iconBackground = AssessmentDangerBackground,
            onClick = {}
        )
    }
}
