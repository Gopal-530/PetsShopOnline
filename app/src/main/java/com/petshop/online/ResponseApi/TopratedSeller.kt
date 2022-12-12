package com.petshop.online.ResponseApi

data class TopratedSeller(
    val `data`: List<Data>,
    val result: String
){

    data class Data(
        val ImagePath: String,
        val companyname: String,
        val id: Int
    )
}