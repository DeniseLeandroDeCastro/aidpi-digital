package br.com.denisecastro.aidpidigital.ui.home.components.card

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color
import br.com.denisecastro.aidpidigital.R
import br.com.denisecastro.aidpidigital.domain.model.ComplaintType
import br.com.denisecastro.aidpidigital.ui.theme.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.denisecastro.aidpidigital.ui.theme.AidpiDigitalTheme

internal data class ComplaintCardStyle(
    @StringRes val titleRes: Int,
    @DrawableRes val iconRes: Int,
    val accent: Color,
    val iconBackground: Color,
    val cardBackground: Color
)

internal fun ComplaintType.toCardStyle(): ComplaintCardStyle =
    when (this) {
        ComplaintType.COUGH -> ComplaintCardStyle(
            R.string.complaint_cough,
            R.drawable.ic_wind,
            CoughAccent,
            CoughIconBackground,
            CoughCardBackground
        )

        ComplaintType.WHEEZING -> ComplaintCardStyle(
            R.string.complaint_wheezing,
            R.drawable.ic_waves,
            WheezingAccent,
            WheezingIconBackground,
            WheezingCardBackground
        )

        ComplaintType.DIARRHEA -> ComplaintCardStyle(
            R.string.complaint_diarrhea,
            R.drawable.ic_droplets,
            DiarrheaAccent,
            DiarrheaIconBackground,
            DiarrheaCardBackground
        )

        ComplaintType.FEVER -> ComplaintCardStyle(
            R.string.complaint_fever,
            R.drawable.ic_thermometer,
            FeverAccent,
            FeverIconBackground,
            FeverCardBackground
        )

        ComplaintType.EAR_PAIN -> ComplaintCardStyle(
            R.string.complaint_ear_pain,
            R.drawable.ic_ear,
            EarPainAccent,
            EarPainIconBackground,
            EarPainCardBackground
        )

        ComplaintType.SORE_THROAT -> ComplaintCardStyle(
            R.string.complaint_sore_throat,
            R.drawable.ic_pill,
            SoreThroatAccent,
            SoreThroatIconBackground,
            SoreThroatCardBackground
        )
}