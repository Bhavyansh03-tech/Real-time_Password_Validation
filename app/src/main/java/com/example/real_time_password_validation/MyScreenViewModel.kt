package com.example.real_time_password_validation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

@OptIn(ExperimentalCoroutinesApi::class)
class MyScreenViewModel(
    private val validatePassword: ValidatePassword = ValidatePassword()
): ViewModel() {

    var password by mutableStateOf("")

    val passwordError =
        snapshotFlow { password }
            .mapLatest { validatePassword.execute(it) }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = PasswordValidationState()
            )

    fun onPasswordChange(password: String) {
        this.password = password
    }
}