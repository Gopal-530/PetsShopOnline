package com.petshop.online.ResponseApi

data class HomeResponce(
    val explore: List<Explore>,
    val featuredpetstores: List<Featuredpetstore>,
    val storegallery: List<Storegallery>,
    val topratedseller: List<TopratedsellerX>,
    val banner: List<Banner>,
    val featuredgrooming: List<Featuredgrooming>,
    val featuredpetclinic: List<Featuredpetclinic>,
    val featuredboarding:List<FeaturedBoarding>,
    val bestseller:List<BestSeller>,
    val featuredtraining:List<Featuredtraning>,
    val sponsoredads: List<Sponsoredads>
){
    data class Explore(
        val ImagePath: String,
        val companyname: String,
        val id: Int
    )

    data class Featuredpetstore(
        val ImagePath: String,
        val companyname: String,
        val id: Int
    )
    data class Storegallery(
        val ImagePath: String,
        val companyname: String,
        val id: Int
    )
    data class TopratedsellerX(
        val ImagePath: String,
        val companyname: String,
        val id: Int
    )

    data class Sponsoredads(
        val mediaurl: String,
        val adtitle: String,
        val posteddate: String,
        val id: Int
    )

    data class Banner(
        val linkurl: String,
        val mediaurl: String,
        val position: String,
    )
    data class Featuredgrooming(
        val companyname: String,
        val ImagePath: String,
        val id: String,
    )

    data class Featuredpetclinic(
        val companyname: String,
        val ImagePath: String,
        val id: String,
    )

    data class FeaturedBoarding(
        val companyname: String,
        val ImagePath: String,
        val id: String,
    )
    data class BestSeller(
        val title: String,
        val ImagePath: String,
        val price: String,
        val description: String,
        val sku: String,
        val category: String,
        val soldby: String,
        val deliverdby: String,
        val id: String,
    )

    data class Featuredtraning(
        val companyname: String,
        val ImagePath: String,
        val id: String,
    )


}