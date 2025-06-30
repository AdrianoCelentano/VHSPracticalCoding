package com.daydream.vhspracticalcoding.b_todo_app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

class TodoViewModel {

    val tasks = mutableStateListOf<Task>()
    val input = mutableStateOf("")

    fun addRandomTask() {
        tasks.add(Task("Task Random", false))
    }

    fun deleteTask(task: Task) {
        tasks.remove(task)
    }

    fun addTask() {
        tasks.add(Task(input.value, false))
    }
    fun getInput(): String {
        return input.value
    }

    fun updateInput(newInput: String) {
        input.value = newInput
    }

}

@Composable
fun TodoComposable() {

    val todoViewModel = remember { TodoViewModel() }

    Column {
        todoViewModel.tasks.forEach { task ->
            Row {
                Text(text = task.description)
                Button(onClick = {
                    todoViewModel.deleteTask(task)
                }) {
                    Text(text = "Delete")
                }
            }
        }

        Button(onClick = {
            todoViewModel.addRandomTask()
        }) {
            Text(text = "Add random Task")
        }

        TextField(
            value = todoViewModel.getInput(),
            onValueChange = { todoViewModel.updateInput(it) }
        )
        Button(onClick = {
            todoViewModel.addTask()
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