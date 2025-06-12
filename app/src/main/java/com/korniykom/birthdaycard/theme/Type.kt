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
        fontSize = 36.sp,
        lineHeight = 42.sp,
        color = OnSurface
    ),
    headlineMedium = TextStyle(
        fontFamily = Mali,
        fontWeight = FontWeight.Medium,
        fontSize = 21.sp,
        lineHeight = 25.sp,
        color = OnSurface
    ),
    bodyLarge = TextStyle(
        fontFamily = Nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 21.sp,
        lineHeight = 25.sp,
        color = OnSurface
    ),
    bodyMedium = TextStyle(
        fontFamily = Nunito,
        fontWeight = FontWeight.Normal,
        fontSize = 21.sp,
        lineHeight = 25.sp,
        color = OnSurface
    ),









    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)