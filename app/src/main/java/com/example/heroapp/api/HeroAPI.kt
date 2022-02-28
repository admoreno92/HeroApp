package com.example.heroapp.api

import com.example.heroapp.models.HeroResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface HeroAPI {

    @GET("/search/{name}")
    suspend fun getHeroByName(
        @Path("name") heroName : String
    ) : Response<HeroResponse>

    @GET("/{characterid}")
    suspend fun getHeroById (
        @Path("characterid") heroId: String
    ) : Response<HeroResponse>

}