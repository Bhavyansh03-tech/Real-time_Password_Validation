package com.example.real_time_password_validation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.real_time_password_validation.ui.theme.RealtimePasswordValidationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RealtimePasswordValidationTheme {

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

class validatePassword {

    fun execute(password: String): PasswordValidationState {

    }

    private fun validateSpecialCharacter(password: String): Boolean =
        password.contains(Regex("[!@#\$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]"))

    private fun validateUppercase(password: String): Boolean =
        password.contains(Regex("[A-Z]"))

    private fun validateMinimum(password: String): Boolean =
        password.length >= 8
}