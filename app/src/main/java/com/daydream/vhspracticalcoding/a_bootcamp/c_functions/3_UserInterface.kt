package com.daydream.vhspracticalcoding.a_bootcamp.c_functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daydream.vhspracticalcoding.a_bootcamp.b_classes.ProfileComposable

data class ProfileUIViewModel(
    val name: String,
    val lastName: String?,
    val isLoggedIn: MutableState<Boolean>,
) {

    fun login() {
        isLoggedIn.value = true

    }

    fun logout() {
        isLoggedIn.value = false
    }
}

@Composable
fun ProfileComposable() {
    val profileViewModel = remember { ProfileUIViewModel("Adrian", null, mutableStateOf(false)) }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Image(imageVector = Icons.Default.Person, contentDescription = "person")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Name: ${profileViewModel.name}")
            Spacer(modifier = Modifier.height(8.dp))
            if (profileViewModel.lastName != null) {
                Text(text = "Age: ${profileViewModel.lastName} years")
                Spacer(modifier = Modifier.height(8.dp))
            }
            Button(onClick = {
                if (profileViewModel.isLoggedIn.value) {
                    profileViewModel.logout()
                } else {
                    profileViewModel.logout()
                }
            }) {
                if (profileViewModel.isLoggedIn.value) {
                    Text(text = "Logout")
                } else {
                    Text(text = "Login")
                }
            }
        }
    }
}

@Preview
@Composable
fun ProfileComposablePreview() {
    ProfileComposable()
}
