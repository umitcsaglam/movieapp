package com.can.movieapp.data.remote

import com.can.movieapp.data.remote.dto.MovieDetailDto
import com.can.movieapp.data.remote.dto.MoviesDto
import com.can.movieapp.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    //https://www.omdbapi.com/?apikey=6b65b1&s=batman
    //https://www.omdbapi.com/?apikey=6b65b1&i=tt0372784

    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString: String,
        @Query("apikey") apiKey:String= API_KEY
    ):MoviesDto

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") searchString: String,
        @Query("apikey") apiKey:String= API_KEY
    ):MovieDetailDto


}