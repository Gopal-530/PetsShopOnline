package com.rehablab.api


class APIUtils {

    companion object {



        private val BASE_URL = "https://petshoponline.ae/demo/mobileapi.asmx/"

        fun getServiceAPI(): APIConfiguration? {
            return APIClient.getApiClient(BASE_URL)!!.create(APIConfiguration::class.java)

        }
    }
}