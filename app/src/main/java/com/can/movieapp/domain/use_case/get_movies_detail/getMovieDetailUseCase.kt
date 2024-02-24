package com.can.movieapp.domain.use_case.get_movies_detail

import com.can.movieapp.data.remote.dto.toMovieDetail
import com.can.movieapp.data.remote.dto.toMovieList
import com.can.movieapp.domain.model.Movie
import com.can.movieapp.domain.model.MovieDetail
import com.can.movieapp.domain.repository.MovieRepository
import com.can.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError
import javax.inject.Inject

class getMovieDetailUseCase @Inject constructor(private val repository: MovieRepository) {

    fun executeGetMoviesDetail(imdbId:String): Flow<Resource<MovieDetail>> = flow{
        try {
            emit(Resource.Loading())
            val movieDetail=repository.getMovieDetail(imdbId)
            emit(Resource.Success(movieDetail.toMovieDetail()))
        }catch (e: IOError){
            emit(Resource.Error("No internet connection"))
        }
    }
}