package com.example.recyclerview

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recyclerview.model.Pollo
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RecyclerStickyView() {

    val context = LocalContext.current

    val pollos = getPollos().groupBy { it.ciudad }  // necesitamos agruparlos en un map
    //  val pollos: Map<String, List<Pollo>> =getPollos().groupBy { it.ciudad }  // necesitamos agruparlos en un map

    LazyColumn(

        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        pollos.forEach { (ciudad, Pollo) ->

            stickyHeader { 
                Text(text = ciudad, modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan),
                    fontSize = 17.sp,
                )
            }

            items(Pollo) { pollo ->
                ItemPollo(pollo = pollo) {
                    Toast.makeText(context, it.name, Toast.LENGTH_SHORT).show()
                }
            }
        }

    }


}



