package com.korniykom.birthdaycard.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.korniykom.birthdaycard.R

val Mali = FontFamily(
    Font(
        resId = R.font.mali_bold,
        weight = FontWeight.Bold
    ),
    Font(
        resId = R.font.mali_medium,
        weight = FontWeight.Medium
    )
)

val Nunito = FontFamily(
    Font(
        resId = R.font.nunito_normal,
        weight = FontWeight.Normal
    ),
    Font(
        resId = R.font.nunito_semibold,
        weight = FontWeight.SemiBold
    )
)

val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = Mali,
        fontWeight = FontWeight.Bold,
        color = OnSurface
    ),
    headlineMedium = TextStyle(
        fontFamily = Mali,
        fontWeight = FontWeight.Medium,
        color = OnSurface
    ),
    bodyLarge = TextStyle(
        fontFamily = Nunito,
        fontWeight = FontWeight.SemiBold,
        color = OnSurface
    ),
    bodyMedium = TextStyle(
        fontFamily = Nunito,
        fontWeight = FontWeight.Normal,
        color = OnSurface
    ),
)