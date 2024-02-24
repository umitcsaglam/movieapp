package com.can.movieapp.domain.model

import com.can.movieapp.data.remote.dto.Rating
import com.google.gson.annotations.SerializedName

data class MovieDetail(
    val actors: String,
    val director: String,
    val genre: String,
    val imdbID: String,
    val imdbRating: String,
    val language: String,
    val poster: String,
    val rated: String,
    val released: String,
    val title: String,
    val type: String,
    val year: String
)