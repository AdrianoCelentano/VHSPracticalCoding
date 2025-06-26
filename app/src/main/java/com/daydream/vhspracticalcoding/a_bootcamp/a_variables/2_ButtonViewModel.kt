package com.daydream.vhspracticalcoding.a_bootcamp.a_variables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Datentypen

class ButtonViewModel {

    //TODO erstelle jeweils eine Variable für Höhe, Text und Sichtbarkeit

}

class SolutionButtonViewModel {

    val height: Int = 50
    val text: String = "Click me"
    val isVisible = true
}

@Composable
fun ButtonComposable() {
    val buttonViewmodel = SolutionButtonViewModel()

    Box(modifier = Modifier.fillMaxSize()) {
        if (buttonViewmodel.isVisible) {
            Button(
                modifier = Modifier
                    .align(Alignment.Center)
                    .height(buttonViewmodel.height.dp),
                onClick = {}) {
                Text(text = buttonViewmodel.text)
            }
        }
    }
}

@Preview
@Composable
fun ButtonComposablePreview() {
    ButtonComposable()
}