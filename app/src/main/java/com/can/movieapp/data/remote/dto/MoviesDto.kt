package com.can.movieapp.data.remote.dto


import com.can.movieapp.domain.model.Movie
import com.google.gson.annotations.SerializedName

data class MoviesDto(
    @SerializedName("Response")
    val response: String,
    @SerializedName("Search")
    val search: List<Search>,
    val totalResults: String
)

fun MoviesDto.toMovieList():List<Movie> {
    return search.map {search -> Movie(
        search.imdbID,
        search.poster,
        search.title,
        search.year
    )}
}