package com.example.recyclerview

import com.example.recyclerview.model.Pollo


fun getPollos(): List<Pollo> {
    return listOf(
        Pollo("Pollo A","Murcia", R.drawable.pollo01),
        Pollo("Pollo B", "Granada",R.drawable.pollo02),
        Pollo("Pollo C", "Granada",R.drawable.pollo03),
        Pollo("Pollo D", "Granada",R.drawable.pollo04),
        Pollo("Pollo E", "Granada",R.drawable.pollo01),
        Pollo("Pollo F","Murcia", R.drawable.pollo02),
        Pollo("Pollo G", "Almería",R.drawable.pollo03),
        Pollo("Pollo H", "Murcia",R.drawable.pollo04)
    )
}