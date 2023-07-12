package com.example.themoviedb.service

import com.example.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=09468e2f6d61e3c411de0e473c7e2ee2")
    fun getTVList(): Call<TVResponse>
}