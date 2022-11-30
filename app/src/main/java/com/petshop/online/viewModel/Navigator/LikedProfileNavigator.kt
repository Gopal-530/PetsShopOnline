package com.petshop.online.viewModel.Navigator

import com.petshop.online.ResponseApi.ExploreResponse

interface LikedProfileNavigator {
    fun onError(message: String)
    fun onItemClick(userProfile: ExploreResponse.Data)
}