package com.can.movieapp.domain.use_case.get_movie

import com.can.movieapp.data.remote.dto.toMovieList
import com.can.movieapp.domain.model.Movie
import com.can.movieapp.domain.repository.MovieRepository
import com.can.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError
import javax.inject.Inject

class getMovieUseCase @Inject constructor(private val repository: MovieRepository) {

    fun executeGetMovies(search:String):Flow<Resource<List<Movie>>> = flow{
        try {
            emit(Resource.Loading())
            val movieList=repository.getMovies(search)

            if (movieList.response.equals("True")){

                emit(Resource.Success(movieList.toMovieList()))

            }else{

                emit(Resource.Error(message = "No movie found"))

            }
        }catch (e:IOError){
            emit(Resource.Error("No internet connection"))
        }
    }

}