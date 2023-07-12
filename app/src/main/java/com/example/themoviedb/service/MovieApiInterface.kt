package com.example.themoviedb.service

import com.example.themoviedb.model.MovieResponse
import retrofit2.Call

import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=09468e2f6d61e3c411de0e473c7e2ee2")
    fun getMovieList(): Call<MovieResponse>
}