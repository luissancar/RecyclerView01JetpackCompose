package com.example.recyclerview.model

import androidx.annotation.DrawableRes

data class Pollo(
    var name: String,
    var ciudad: String,
    @DrawableRes var photo: Int

)
