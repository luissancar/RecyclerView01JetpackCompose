package com.example.recyclerview

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RecyclerView01() {
    Text(text = "")
    LazyColumn {
        item{ Text(text = "Header")}

        item { Text("Hola") }
        item { Text("Hola") }
        item { Text("Hola") }
        item { Text("Hola") }
        items(10) {
            Text(text = "item $it")
        }
        val lista = listOf("a", "b", "c")
        items(lista) {
            Text(text = it.toString())
        }

        item{ Text(text = "Footer")}

    }
}