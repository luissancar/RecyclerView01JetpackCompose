package com.example.recyclerview

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun RecyclerView03Grid() {

    val context = LocalContext.current
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        //columns = GridCells.Adaptive(150.dp),
        content = {
        items(getPollos()) { pollo ->
            ItemPollo(pollo = pollo) {
                Toast.makeText(context, it.name, Toast.LENGTH_SHORT).show()
            }
        }
    })


}
