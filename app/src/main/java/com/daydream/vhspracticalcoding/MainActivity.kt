package com.daydream.vhspracticalcoding

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.daydream.vhspracticalcoding.b_todo_app.TodoViewModel
import com.daydream.vhspracticalcoding.a_bootcamp.a_variables.IntsListComposable

class MainActivity : ComponentActivity() {

    val todoViewmodel = TodoViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            IntsListComposable()
        }
    }
}