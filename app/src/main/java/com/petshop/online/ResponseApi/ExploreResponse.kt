package com.petshop.online.ResponseApi

data class ExploreResponse(
    val `data`: List<Data>,
    val result: String
){

    data class Data(
        val ImagePath: String,
        val categoryid: Int,
        val id: Int,
        val title: String
    )
}