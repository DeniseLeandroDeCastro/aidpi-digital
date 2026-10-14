
package br.com.denisecastro.aidpidigital.ui.home.components.card

import androidx.annotation.DrawableRes
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme

enum class ComplaintType(
    val title: String,
    @DrawableRes val iconRes: Int,
    val accent: Color,
    val iconBackground: Color,
    val cardBackground: Color
) {
    COUGH(
        "Tosse ou dificuldade para respirar",
        R.drawable.ic_wind,
        Color(0xFF1266D6),
        Color(0xFFE4F0FF),
        Color(0xFFF8FBFF)
    ),
    WHEEZING(
        "Sibilância ou chiado no peito",
        R.drawable.ic_waves,
        Color(0xFF773BE5),
        Color(0xFFF0E9FF),
        Color(0xFFFBF9FF)
    ),
    DIARRHEA(
        "Diarreia",
        R.drawable.ic_droplets,
        Color(0xFF0CA9BD),
        Color(0xFFE0F8FA),
        Color(0xFFF6FDFE)
    ),
    FEVER(
        "Febre",
        R.drawable.ic_thermometer,
        Color(0xFFE52535),
        Color(0xFFFFE8EB),
        Color(0xFFFFF8F9)
    ),
    EAR_PAIN(
        "Problema de ouvido",
        R.drawable.ic_ear,
        Color(0xFFF18412),
        Color(0xFFFFEFDC),
        Color(0xFFFFFBF5)
    ),
    SORE_THROAT(
        "Problema de garganta",
        R.drawable.ic_pill,
        Color(0xFF36AC69),
        Color(0xFFE5F7EC),
        Color(0xFFF7FCF9)
    )
}

@Composable
fun ComplaintCard(
    complaint: ComplaintType,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .height(100.dp)
            .background(
                color = complaintBackgroundColor(complaint.title),
                shape = RoundedCornerShape(20.dp)
            )
            .border(
                1.dp,
                Color(0xFFEAF0F8),
                RoundedCornerShape(20.dp)
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
                    complaint.iconBackground,
                    RoundedCornerShape(15.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(complaint.iconRes),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
        }

        Text(
            text = complaint.title,
            modifier = Modifier.weight(1f),
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF0C2047)
        )

        Text(
            text = "›",
            fontSize = 25.sp,
            color = complaint.accent
        )
    }
}


private fun complaintBackgroundColor(
    title: String
): Color {
    return when {
        title.contains("Tosse", ignoreCase = true) ->
            Color(0xFFCDEEFF)

        title.contains("Sibilância", ignoreCase = true) ->
            Color(0xFFE9D1FF)

        title.contains("Diarreia", ignoreCase = true) ->
            Color(0xFFC9F9D7)

        title.contains("Febre", ignoreCase = true) ->
            Color(0xFFFFD5DC)

        title.contains("ouvido", ignoreCase = true) ->
            Color(0xFFFFE5C2)

        title.contains("garganta", ignoreCase = true) ->
            Color(0xFFD6F4DE)

        else -> Color(0xFFF7FBFF)
    }
}


@Preview(showBackground = true, widthDp = 200)
@Composable
private fun ComplaintCardPreview() {
    AidpiDigitalTheme {
        ComplaintCard(
            complaint = ComplaintType.COUGH,
            onClick = {},
            modifier = Modifier.padding(12.dp)
        )
    }
}
