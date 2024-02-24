package com.can.movieapp.domain.repository

import com.can.movieapp.data.remote.dto.MovieDetailDto
import com.can.movieapp.data.remote.dto.MoviesDto
import com.can.movieapp.domain.model.MovieDetail

interface MovieRepository {

    suspend fun getMovies(search:String):MoviesDto
    suspend fun getMovieDetail(imdbId:String):MovieDetailDto

}