package com.daydream.vhspracticalcoding.a_bootcamp.a_variables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class StringsListViewModel {

    // TODO erstelle eine Liste mit Strings
}

class SolutionStringsListViewModel {

    val stringsList: List<String> = listOf("Eins", "Zwei", "Drei", "Vier", "Fünf")
}

@Composable
fun StringsListComposable() {
    val stringsListViewModel = SolutionStringsListViewModel()

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            stringsListViewModel.stringsList.forEach { string ->
                Text(text = string)
            }
        }
    }
}

@Preview
@Composable
fun StringsListComposablePreview() {
    StringsListComposable()
}
































































