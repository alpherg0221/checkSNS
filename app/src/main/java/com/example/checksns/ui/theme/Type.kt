package com.example.checksns.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.example.checksns.R

val provider = GoogleFont.Provider(
        providerAuthority = "com.google.android.gms.fonts",
        providerPackage = "com.google.android.gms",
        certificates = R.array.com_google_android_gms_fonts_certs
)

val notoSansJpFont = GoogleFont(name = "Noto Sans Japanese")

val notoSansJpFontFamily = FontFamily(
        Font(googleFont = notoSansJpFont, fontProvider = provider)
)

val NotoSansJpTypography = Typography(
        displayLarge = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 57.sp,
                lineHeight = 64.0.sp,
                letterSpacing = (-0.2).sp
        ),
        displayMedium = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 45.sp,
                lineHeight = 52.0.sp,
                letterSpacing = 0.0.sp
        ),
        displaySmall = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 36.sp,
                lineHeight = 44.0.sp,
                letterSpacing = 0.0.sp
        ),
        headlineLarge = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 32.sp,
                lineHeight = 40.0.sp,
                letterSpacing = 0.0.sp
        ),
        headlineMedium = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 28.sp,
                lineHeight = 36.0.sp,
                letterSpacing = 0.0.sp
        ),
        headlineSmall = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 24.sp,
                lineHeight = 32.0.sp,
                letterSpacing = 0.0.sp
        ),
        titleLarge = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 22.sp,
                lineHeight = 28.0.sp,
                letterSpacing = 0.0.sp
        ),
        titleMedium = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                lineHeight = 24.0.sp,
                letterSpacing = 0.2.sp
        ),
        titleSmall = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 20.0.sp,
                letterSpacing = 0.1.sp
        ),
        bodyLarge = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.0.sp,
                letterSpacing = 0.5.sp
        ),
        bodyMedium = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 20.0.sp,
                letterSpacing = 0.2.sp
        ),
        bodySmall = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 16.0.sp,
                letterSpacing = 0.4.sp
        ),
        labelLarge = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 20.0.sp,
                letterSpacing = 0.1.sp
        ),
        labelMedium = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 16.0.sp,
                letterSpacing = 0.5.sp
        ),
        labelSmall = TextStyle(
                fontFamily = notoSansJpFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 11.sp,
                lineHeight = 16.0.sp,
                letterSpacing = 0.5.sp
        ),
)