package com.rehablab.api

import com.petshop.online.ResponseApi.ExploreResponse
import com.petshop.online.ResponseApi.FeaturesResponse
import com.petshop.online.ResponseApi.StoreGalleriesResponse
import com.petshop.online.ResponseApi.TopratedSeller

import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.POST

interface APIConfiguration {




    @POST("explore")
    fun callExplore():Call<ExploreResponse>

    @POST("storegalleries")
    fun callStore():Call<StoreGalleriesResponse>


    @POST("topratedseller")
    fun topratedSeller():Call<TopratedSeller>

    @POST("featuredpetstores")
    fun featuresStore():Call<FeaturesResponse>

}

