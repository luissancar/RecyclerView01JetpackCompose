package com.example.recyclerview


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.recyclerview.model.Pollo

@Composable
fun RecyclerView02() {
    LazyColumn {

        /*
        items(getPollos()){
            ItemPollo(pollo = it)
        }*/
        // o

        items(getPollos()) { pollo ->
            ItemPollo(pollo = pollo)
        }

    }
}

@Composable
fun ItemPollo(pollo: Pollo) {
    Card(border = BorderStroke(2.dp, Color.Cyan), modifier = Modifier.fillMaxWidth()) {
        Row() {
            Image(
                painter = painterResource(id = pollo.photo),
                contentDescription = null,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp).padding(20.dp),
                contentScale = ContentScale.Crop
            )
            Text(text = pollo.name, modifier = Modifier.align(Alignment.CenterVertically))

        }
    }
}


fun getPollos(): List<Pollo> {
    return listOf(
        Pollo("Pollo A", R.drawable.pollo01),
        Pollo("Pollo A", R.drawable.pollo02),
        Pollo("Pollo A", R.drawable.pollo03),
        Pollo("Pollo A", R.drawable.pollo04)
    )
}