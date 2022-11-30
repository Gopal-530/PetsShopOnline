package com.petshop.online.ResponseApi

data class StoreGalleriesResponse(
    val `data`: List<Data>,
    val result: String
){

    data class Data(
        val ImagePath: String,
        val companyname: String,
        val id: Int,
        val type: String
    )
}