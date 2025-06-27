package com.daydream.vhspracticalcoding.b_todo_app

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

class TodoViewModel {

    fun addRandomTask() {
        tasks.add(Task("Task Random", false))
    }

    val tasks = mutableStateListOf<Task>()
}

@Composable
fun TodoComposable() {
    val todoViewModel = remember { TodoViewModel() }

    Column {
        todoViewModel.tasks.forEach { task ->
            Text(text = task.description)
        }
        Button(onClick = {
            todoViewModel.addRandomTask()
        }) {
            Text(text = "Add Task")
        }
    }
}

@Preview
@Composable
fun TodoComposablePreview() {
    TodoComposable()
}