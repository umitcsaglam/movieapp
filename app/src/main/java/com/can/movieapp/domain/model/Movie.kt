package com.can.movieapp.domain.model

import com.google.gson.annotations.SerializedName

data class Movie (
    val imdbID: String,
    val imageUrl: String,
    val title: String,
    val year: String
)
