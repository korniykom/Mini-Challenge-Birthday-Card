package com.korniykom.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.korniykom.birthdaycard.birthday_screen.BirthdayScreen
import com.korniykom.birthdaycard.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayCardTheme {
                BirthdayScreen()
            }
        }
    }
}
