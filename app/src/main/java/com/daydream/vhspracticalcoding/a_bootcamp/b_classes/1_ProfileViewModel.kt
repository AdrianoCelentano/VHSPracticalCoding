package com.daydream.vhspracticalcoding.a_bootcamp.b_classes

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Klassen

class ProfileViewModel {

    ///TODO 1.) erstelle eine Klasse Profile mit den Variablen Name, Alter, Größe und LoginStatus
    ///TODO 2.) speichere eine Instanz dieser Klasse in einer Variablen

}

class SolutionProfileViewModel {

    val profile: SolutionProfile = SolutionProfile(
        name = "Adrian",
        age = 38,
        heightInMeter = 1.9,
        isLoggedIn = false
    )
}

data class SolutionProfile(
    val name: String = "Adrian",
    val age: Int = 38,
    val heightInMeter: Double = 1.9,
    val isLoggedIn: Boolean = false
)

@Composable
private fun ProfileComposable() {
    val profileViewmodel = SolutionProfileViewModel()
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Image(imageVector = Icons.Default.Person, contentDescription = "person")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Name: ${profileViewmodel.profile.name}")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Age: ${profileViewmodel.profile.age} years")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Height: ${profileViewmodel.profile.heightInMeter} meter")
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = {}) {
                if (profileViewmodel.profile.isLoggedIn) {
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





































































