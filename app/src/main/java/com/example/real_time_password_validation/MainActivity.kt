package com.example.real_time_password_validation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.real_time_password_validation.ui.theme.RealtimePasswordValidationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RealtimePasswordValidationTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    MyScreen()
                }
            }
        }
    }
}

data class PasswordValidationState(
    val hasMinimum: Boolean = false,
    val hasUppercase: Boolean = false,
    val hasSpecialCharacter: Boolean = false,
    val successful: Boolean = false
)

class ValidatePassword {

    fun execute(password: String): PasswordValidationState {
        val validateSpecialCharacter = validateSpecialCharacter(password)
        val validateCapitalizedLetter = validateUppercase(password)
        val validateMinimum = validateMinimum(password)

        val hasError = listOf(
            validateSpecialCharacter,
            validateCapitalizedLetter,
            validateMinimum
        ).any { it }

        return PasswordValidationState(
            hasSpecialCharacter = validateSpecialCharacter,
            hasUppercase = validateCapitalizedLetter,
            hasMinimum = validateMinimum,
            successful = hasError
        )

    }

    private fun validateSpecialCharacter(password: String): Boolean =
        password.contains(Regex("[!@#\$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]"))

    private fun validateUppercase(password: String): Boolean =
        password.contains(Regex("[A-Z]"))

    private fun validateMinimum(password: String): Boolean =
        password.length >= 8
}