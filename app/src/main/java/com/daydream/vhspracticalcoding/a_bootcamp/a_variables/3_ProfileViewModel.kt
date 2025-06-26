package com.daydream.vhspracticalcoding.a_bootcamp.a_variables

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

// Operatoren

class ProfileViewModel {

    ///TODO 1.) erstelle jeweils eine Variable für Name, Alter und Größe

    ///TODO 2.) erstelle eine Variable die true ist wenn der User über 18 ist

    ///TODO 3.) erstelle eine Variable mit dem aktuellen Jahr und berechne damit das Geburtsjahr

    ///TODO 3.) erstelle eine Variable mit dem aktuellen Jahr und berechne damit das Geburtsjahr

}

class SolutionProfileViewModel {

    val name: String = "Adrian"
    val age: Int = 38
    val heightInMeter: Double = 1.9
    val isLoggedIn: Boolean = false

    val isOlderThan18: Boolean = age >= 18

    val currentYear: Int = 2025
    val birthYear: Int = currentYear - age

}

@Composable
fun ProfileComposable() {
    val profileViewmodel = SolutionProfileViewModel()
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Image(imageVector = Icons.Default.Person, contentDescription = "person")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Name: ${profileViewmodel.name}")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Age: ${profileViewmodel.age} years")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Height: ${profileViewmodel.heightInMeter} meter")
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = {}) {
                if (profileViewmodel.isLoggedIn) {
                    Text(text = "Logout")
                } else {
                    Text(text = "Login")
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text("Birth Year: ${profileViewmodel.birthYear}")
            Spacer(modifier = Modifier.height(8.dp))
            if (profileViewmodel.isOlderThan18) {
                Text("Alcohol Advertisement")
            }
        }
    }
}

@Preview
@Composable
fun ProfileComposablePreview() {
    ProfileComposable()
}





































































