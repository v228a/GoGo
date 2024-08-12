package com.example.gogo_todoapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

@Composable
fun FABAddToDo() {
    FloatingActionButton(
        onClick = {  },
    ) {
        Icon(Icons.Filled.Add, "Floating action button.")
    }
}