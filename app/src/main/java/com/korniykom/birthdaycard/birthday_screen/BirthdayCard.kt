package com.korniykom.birthdaycard.birthday_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.BoxWithConstraintsScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.korniykom.birthdaycard.R
import com.korniykom.birthdaycard.theme.BirthdayCardTheme

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun BirthdayCard(
    modifier: Modifier = Modifier
) {
    BoxWithConstraints {
        val isTablet = maxWidth > 640.dp && maxHeight > 800.dp

        val cardWidth = if(isTablet) 640.dp else 380.dp
        val cardHeight = if(isTablet) 800.dp else 480.dp
        val cardRadius = if(isTablet) 28.dp else 16.dp
        val textSpacer = if(isTablet) 56.dp else 32.dp
        val bottomSpacer = if(isTablet) 24.dp else 16.dp
        val titleFontSize = if(isTablet) 60.sp else 36.sp
        val bottomFontSize = if(isTablet) 26.sp else 16.sp
        val bodyFontSize = if(isTablet) 34.sp else 21.sp
        val titleLineHeight = if(isTablet) 72.sp else 43.sp
        val bodyLineHeight = if(isTablet) 40.sp else 25.sp
        val bottomLineHeight = if(isTablet) 32.sp else 20.sp


        Card(
            modifier = Modifier
                .height(cardHeight)
                .width(cardWidth),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface,
            ),
            shape = RoundedCornerShape(cardRadius),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.sprinkles_bg),
                    contentDescription = "Sprinkles background",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "You're invited!",
                        style = MaterialTheme.typography.headlineLarge
                            .copy(
                                fontSize = titleFontSize,
                                lineHeight = titleLineHeight
                                )
                    )
                    Text(
                        text = "Join us for a birthday bash \uD83C\uDF89",
                        style = MaterialTheme.typography.headlineMedium
                            .copy(
                                fontSize = bodyFontSize,
                                lineHeight = bodyLineHeight
                            )
                    )
                    Spacer(modifier = Modifier.height(textSpacer))
                    Row {
                        Text(
                            text = "Date: ",
                            style = MaterialTheme.typography.bodyMedium
                                .copy(
                                    fontSize = bodyFontSize,
                                    lineHeight = bodyLineHeight,
                                    fontWeight = FontWeight.SemiBold
                                )
                        )
                        Text(
                            text = "June 14, 2025",
                            style = MaterialTheme.typography.bodyMedium
                                .copy(
                                    fontSize = bodyFontSize,
                                    lineHeight = bodyLineHeight,
                                ),
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = .8f)
                        )
                    }
                    Row {
                        Text(
                            text = "Time: ",
                            style = MaterialTheme.typography.bodyMedium
                                .copy(
                                    fontSize = bodyFontSize,
                                    lineHeight = bodyLineHeight,
                                    fontWeight = FontWeight.SemiBold
                                )
                        )
                        Text(
                            text = "3:00 PM",
                            style = MaterialTheme.typography.bodyMedium
                                .copy(
                                    fontSize = bodyFontSize,
                                    lineHeight = bodyLineHeight
                                ),
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = .8f)
                        )
                    }
                    Row {
                        Text(
                            text = "Location: ",
                            style = MaterialTheme.typography.bodyMedium
                                .copy(
                                    fontSize = bodyFontSize,
                                    lineHeight = bodyLineHeight,
                                    fontWeight = FontWeight.SemiBold
                                ),
                        )
                        Text(
                            text = "Party Central, 123",
                            style = MaterialTheme.typography.bodyMedium
                                .copy(
                                    fontSize = bodyFontSize,
                                    lineHeight = bodyLineHeight,
                                ),
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = .8f)
                        )
                    }
                    Text(
                        text = "Celebration Lane",
                        style = MaterialTheme.typography.bodyMedium
                            .copy(
                                fontSize = bodyFontSize,
                                lineHeight = bodyLineHeight,
                            ),
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = .8f)
                    )
                }
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(
                        text = "RSVP by June 9",
                        style = MaterialTheme.typography.bodyMedium
                            .copy(
                                fontSize = bottomFontSize,
                                lineHeight = bodyLineHeight
                            ),
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = .8f)
                    )
                    Spacer(modifier = Modifier.height(bottomSpacer))
                }
            }
        }
    }
}

@Preview
@Composable
private fun BirthdayCardPreview() {
    BirthdayCardTheme {
        BirthdayCard()
    }
}