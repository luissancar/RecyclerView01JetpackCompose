package com.example.recyclerview

import com.example.recyclerview.model.Pollo


fun getPollos(): List<Pollo> {
    return listOf(
        Pollo("Pollo A", R.drawable.pollo01),
        Pollo("Pollo B", R.drawable.pollo02),
        Pollo("Pollo C", R.drawable.pollo03),
        Pollo("Pollo D", R.drawable.pollo04)
    )
}