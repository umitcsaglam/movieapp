package com.can.movieapp.presentation.movies.views

import com.can.movieapp.domain.model.Movie

data class MoviesState(
    val isLoading:Boolean=false,
    val movies:List<Movie> = emptyList(),
    val error:String="",
    val search:String="batman"
)