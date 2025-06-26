package com.daydream.vhspracticalcoding.a_bootcamp.a_variables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class IntListViewModel {

    // TODO erstelle eine Liste mit Ints
}

class SolutionIntListViewModel {

    val intsList: List<Int> = listOf(1, 2, 3, 4, 5)
}

@Composable
fun IntsListComposable() {
    val solutionIntListViewModel = SolutionIntListViewModel()

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            solutionIntListViewModel.intsList.forEach { int ->
                Text(text = int.toString())
            }
        }
    }
}

@Preview
@Composable
fun IntsListComposablePreview() {
    IntsListComposable()
}































































