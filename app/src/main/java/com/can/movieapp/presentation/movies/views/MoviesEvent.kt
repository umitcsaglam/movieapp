package com.can.movieapp.presentation.movies.views

sealed class MoviesEvent {
    data class Search(val searchString: String):MoviesEvent()
}