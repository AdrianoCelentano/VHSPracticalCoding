package com.daydream.vhspracticalcoding.z_handout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RowExample() {
    // Row ordnet die Elemente nebneneinander an
    Row {
        Text("Hello")
        Text("World")
    }
}

@Preview
@Composable
fun RowExamplePreview() {
    RowExample()
}

@Composable
fun ColumnExample() {
    // Column ordnet die Elemente untereinander an
    Column {
        Text("Hello")
        Text("World")
    }
}

@Preview
@Composable
fun ColumnExamplePreview() {
    ColumnExample()
}

@Composable
fun RowColumnExample() {
    // Row und Column können auch ineinander verschachtelt werden
    Column {
        Row {
            Text("Add")
            Image(Icons.Default.Add, contentDescription = "add")
        }
        Text("World")
    }
}

@Preview
@Composable
fun RowColumnExamplePreview() {
    RowColumnExample()
}

@Composable
fun ModifierExample() {
    Column(modifier = Modifier.background(color = Color.Cyan)) {
        Row {
            // padding definiert den Abstand zwischen dem Element und den anderen Elementen
            Text(modifier = Modifier.padding(16.dp), text = "Add")
            Image(Icons.Default.Add, contentDescription = "add")
        }
        Text("World")
        // padding kann auch nur nach oben angewendet werden
        Text(modifier = Modifier.padding(top = 8.dp), text = "Top padding")
    }
}

@Preview
@Composable
fun PaddingExamplePreview() {
    ModifierExample()
}

// Button
class ButtonViewModel {

    // mutable state wird für die UI benötigt
    val counter: MutableState<Int> = mutableStateOf(0)

    fun increaseCounter() {
        // Mutable state muss immer mit .value aufgerufen werden
        // Kurzform von counter.value = counter.value + 1
        counter.value++
    }

    fun getCount(): String {
        // toString() wandelt die Zahl in einen String um
        return counter.value.toString()
    }

}

@Composable
fun ButtonComposable() {
    val buttonViewModel = remember { ButtonViewModel() }

    // Button und Text werden in einem Column (Spalte) untereinander platziert
    Column {

        Button(
            onClick = { buttonViewModel.increaseCounter() }
        ) {
            // Button hat einen Text (manchmal gibt es auch Buttons mit Icons zB)
            Text(text = "Count")
        }

        Text(buttonViewModel.getCount())
    }

}

@Preview
@Composable
fun ButtonComposablePreview() {
    ButtonComposable()
}


// Text Input
class TextInputViewModel() {
    val text = mutableStateOf("")
}

@Composable
fun TextInputComposable() {
    val textInputViewModel = remember { TextInputViewModel() }
    TextField(
        value = textInputViewModel.text.value,
        onValueChange = { textInputViewModel.text.value = it }
    )
}

@Preview
@Composable
fun TextInputComposablePreview() {
    TextInputComposable()
}


//List
class ListViewModel() {
    val items = mutableStateListOf<String>("item 1", "item 2")
}

@Composable
fun ListComposable() {
    val listViewModel = remember { ListViewModel() }

    Column {
        listViewModel.items.forEach { item ->
            Text(text = item)
        }
    }
}

@Preview
@Composable
fun ListComposablePreview() {
    ListComposable()
}