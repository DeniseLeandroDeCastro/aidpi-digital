package br.com.denisecastro.aidpidigital.ui.home.components.card

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import br.com.denisecastro.aidpidigital.domain.model.ComplaintType
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme
import br.com.denisecastro.aidpidigital.ui.theme.ComplaintCardBorder
import br.com.denisecastro.aidpidigital.ui.theme.ComplaintCardText

@Composable
fun ComplaintCard(
    complaint: ComplaintType,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val style = complaint.toCardStyle()

    Row(
        modifier = modifier
            .height(100.dp)
            .background(
                color = style.cardBackground,
                shape = RoundedCornerShape(20.dp)
            )
            .border(
                width = 1.dp,
                color = ComplaintCardBorder,
                shape = RoundedCornerShape(20.dp)
            )
            .clickable(onClick = onClick)
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(
                    color = style.iconBackground,
                    shape = RoundedCornerShape(15.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(style.iconRes),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
        }

        Text(
            text = stringResource(style.titleRes),
            modifier = Modifier.weight(1f),
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = ComplaintCardText
        )

        Canvas(
            modifier = Modifier.size(
                width = 8.dp,
                height = 14.dp
            )
        ) {
            val stroke = 1.5.dp.toPx()

            drawLine(
                color = style.accent,
                start = Offset(size.width * 0.25f, size.height * 0.15f),
                end = Offset(size.width * 0.75f, size.height * 0.5f),
                strokeWidth = stroke,
                cap = StrokeCap.Round
            )

            drawLine(
                color = style.accent,
                start = Offset(size.width * 0.75f, size.height * 0.5f),
                end = Offset(size.width * 0.25f, size.height * 0.85f),
                strokeWidth = stroke,
                cap = StrokeCap.Round
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
private fun ComplaintCardPreview() {
    AidpiDigitalTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            ComplaintType.entries.forEach { complaint ->
                ComplaintCard(
                    complaint = complaint,
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}
