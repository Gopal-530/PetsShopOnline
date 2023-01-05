package com.petshop.online.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.petshop.online.ResponseApi.*
import com.petshop.online.viewModel.Navigator.LikedProfileNavigator
import com.petshop.online.base.BaseViewModel
import com.petshop.online.api.APIUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException


class ExploreViewModel : BaseViewModel<LikedProfileNavigator>() {
    private val TAG = "LikedProfileViewModel"
    private var mLikedProfileMutable: MutableLiveData<ExploreResponse>? = null
    private var mStoreGalleryMutable: MutableLiveData<StoreGalleriesResponse>? = null
    private var mTopRatedSellerMutable: MutableLiveData<TopratedSeller>? = null
    private var mFeaturedPetStoreMutable: MutableLiveData<FeaturesResponse>? = null
    private var mLikedHome: MutableLiveData<HomeResponce>? = null

    //-------------For explore------------//
    fun getExploremodel(): LiveData<ExploreResponse> {
        mLikedProfileMutable = MutableLiveData()
        getExplore()
        return mLikedProfileMutable!!
    }

    //-----for store gallery-----//

    fun getStoreGAllerymodel(): LiveData<StoreGalleriesResponse> {
        mStoreGalleryMutable = MutableLiveData()
        getStaoreGallery()
        return mStoreGalleryMutable!!
    }

    //---TopratedSeller---//

    fun getTopratedSeleermodel(): LiveData<TopratedSeller> {
        mTopRatedSellerMutable = MutableLiveData()
        getTopratedSellert()
        return mTopRatedSellerMutable!!
    }

    //---FeaturedPetstore---//

    fun getFeaturePetstoremodel(): LiveData<FeaturesResponse> {
        mFeaturedPetStoreMutable = MutableLiveData()
        getFeaturepet()
        return mFeaturedPetStoreMutable!!
    }

    fun getHomemodel(): LiveData<HomeResponce> {
        mLikedHome = MutableLiveData()
        getHomeapi()
        return mLikedHome!!
    }


    private fun getFeaturepet() {

        val call: Call<FeaturesResponse> = APIUtils.getServiceAPI()!!.featuresStore()
        try {
            call.enqueue(object : Callback<FeaturesResponse> {
                override fun onResponse(
                    call: Call<FeaturesResponse>,
                    response: Response<FeaturesResponse>
                ) {

                    try {
                        if (response.isSuccessful && response.body() != null) {
                            mFeaturedPetStoreMutable?.value = response.body()
                        } else {
                            if (response.body() != null) {
                                getNavigator()?.onError(response.body()?.result!!)
                            } else if (response.errorBody() != null) {
                                try {
                                    val str = response.errorBody()!!.string()
                                    Log.d(
                                        TAG,
                                        "onError: $str"
                                    )
                                    getNavigator()?.onError(str)
                                } catch (e: IOException) {
                                    e.printStackTrace()
                                }
                            } else {
                                getNavigator()?.onError("Something went wrong!")
                            }
                        }
                    } catch (e: Exception) {

                    }


                }

                override fun onFailure(call: Call<FeaturesResponse>, t: Throwable) {
                    getNavigator()?.onError(t.localizedMessage)
                    Log.d(TAG, "onFailure: ${t.localizedMessage}")
                }

            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

    }


    private fun getTopratedSellert() {

        val call: Call<TopratedSeller> = APIUtils.getServiceAPI()!!.topratedSeller()
        try {
            call.enqueue(object : Callback<TopratedSeller> {
                override fun onResponse(
                    call: Call<TopratedSeller>,
                    response: Response<TopratedSeller>
                ) {

                    try {
                        if (response.isSuccessful && response.body() != null) {
                            mTopRatedSellerMutable?.value = response.body()
                        } else {
                            if (response.body() != null) {
                                getNavigator()?.onError(response.body()?.result!!)
                            } else if (response.errorBody() != null) {
                                try {
                                    val str = response.errorBody()!!.string()
                                    Log.d(
                                        TAG,
                                        "onError: $str"
                                    )
                                    getNavigator()?.onError(str)
                                } catch (e: IOException) {
                                    e.printStackTrace()
                                }
                            } else {
                                getNavigator()?.onError("Something went wrong!")
                            }
                        }
                    } catch (e: Exception) {

                    }


                }

                override fun onFailure(call: Call<TopratedSeller>, t: Throwable) {
                    getNavigator()?.onError(t.localizedMessage)
                    Log.d(TAG, "onFailure: ${t.localizedMessage}")
                }

            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

    }


    private fun getStaoreGallery() {

        val call: Call<StoreGalleriesResponse> = APIUtils.getServiceAPI()!!.callStore()
        try {
            call.enqueue(object : Callback<StoreGalleriesResponse> {
                override fun onResponse(
                    call: Call<StoreGalleriesResponse>,
                    response: Response<StoreGalleriesResponse>
                ) {

                    try {
                        if (response.isSuccessful && response.body() != null) {
                            mStoreGalleryMutable?.value = response.body()
                        } else {
                            if (response.body() != null) {
                                getNavigator()?.onError(response.body()?.result!!)
                            } else if (response.errorBody() != null) {
                                try {
                                    val str = response.errorBody()!!.string()
                                    Log.d(
                                        TAG,
                                        "onError: $str"
                                    )
                                    getNavigator()?.onError(str)
                                } catch (e: IOException) {
                                    e.printStackTrace()
                                }
                            } else {
                                getNavigator()?.onError("Something went wrong!")
                            }
                        }
                    } catch (e: Exception) {

                    }


                }

                override fun onFailure(call: Call<StoreGalleriesResponse>, t: Throwable) {
                    getNavigator()?.onError(t.localizedMessage)
                    Log.d(TAG, "onFailure: ${t.localizedMessage}")
                }

            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

    }


    private fun getExplore() {

        val call: Call<ExploreResponse> = APIUtils.getServiceAPI()!!.callExplore()
        try {
            call.enqueue(object : Callback<ExploreResponse> {
                override fun onResponse(
                    call: Call<ExploreResponse>,
                    response: Response<ExploreResponse>
                ) {

                    try {
                        if (response.isSuccessful && response.body() != null) {
                            mLikedProfileMutable?.value = response.body()
                        } else {
                            if (response.body() != null) {
                                getNavigator()?.onError(response.body()?.result!!)
                            } else if (response.errorBody() != null) {
                                try {
                                    val str = response.errorBody()!!.string()
                                    Log.d(
                                        TAG,
                                        "onError: $str"
                                    )
                                    getNavigator()?.onError(str)
                                } catch (e: IOException) {
                                    e.printStackTrace()
                                }
                            } else {
                                getNavigator()?.onError("Something went wrong!")
                            }
                        }
                    } catch (e: Exception) {

                    }


                }

                override fun onFailure(call: Call<ExploreResponse>, t: Throwable) {
                    getNavigator()?.onError(t.localizedMessage)
                    Log.d(TAG, "onFailure: ${t.localizedMessage}")
                }

            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

    }


    private fun getHomeapi() {

        val call: Call<HomeResponce> = APIUtils.getServiceAPI()!!.callHomeapi()
        try {
            call.enqueue(object : Callback<HomeResponce> {
                override fun onResponse(
                    call: Call<HomeResponce>,
                    response: Response<HomeResponce>
                ) {

                    try {
                        if (response.isSuccessful && response.body() != null) {
                            mLikedHome?.value = response.body()
                        } else {
                            if (response.body() != null) {
                               // getNavigator()?.onError(response.body()?.result!!)
                            } else if (response.errorBody() != null) {
                                try {
                                    val str = response.errorBody()!!.string()
                                    Log.d(
                                        TAG,
                                        "onError: $str"
                                    )
                                    getNavigator()?.onError(str)
                                } catch (e: IOException) {
                                    e.printStackTrace()
                                }
                            } else {
                                getNavigator()?.onError("Something went wrong!")
                            }
                        }
                    } catch (e: Exception) {

                    }


                }

                override fun onFailure(call: Call<HomeResponce>, t: Throwable) {
                    getNavigator()?.onError(t.localizedMessage)
                    Log.d(TAG, "onFailure: ${t.localizedMessage}")
                }

            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

    }


    /* fun getFilteredProfile(postData: HashMap<String,String>): LiveData<LikedProfileResponse> {
         mFilterMutableData = MutableLiveData()
         getFilteredData(postData)
         return mFilterMutableData!!
     }

     private fun getFilteredData(postData: HashMap<String, String>) {
         val call: Call<LikedProfileResponse> = APIUtils.getServiceAPI()!!.filterUser(postData)
         try {
             call.enqueue(object : Callback<LikedProfileResponse> {
                 override fun onResponse(
                     call: Call<LikedProfileResponse>,
                     response: Response<LikedProfileResponse>
                 ) {

                     try {
                         if (response.isSuccessful) {
                             mFilterMutableData?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError filter: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:Exception){

                     }

                 }

                 override fun onFailure(call: Call<LikedProfileResponse>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure filter: ${t.localizedMessage}")
                 }

             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }

     private var memberShipMutable : MutableLiveData<SubscriptionPlanResp>?= null
     fun getMemberShip(): LiveData<SubscriptionPlanResp> {
         memberShipMutable = MutableLiveData()
         getMemberShipPlanList()
         return memberShipMutable!!
     }

     private fun getMemberShipPlanList() {
         val call: Call<SubscriptionPlanResp> = APIUtils.getServiceAPI()!!.getMemberShipList()
         try {
             call.enqueue(object : Callback<SubscriptionPlanResp> {
                 override fun onResponse(
                     call: Call<SubscriptionPlanResp>,
                     response: Response<SubscriptionPlanResp>
                 ) {

                     try {
                         if (response.isSuccessful) {
                             memberShipMutable?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:java.lang.Exception){

                     }

                 }

                 override fun onFailure(call: Call<SubscriptionPlanResp>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure: ${t.localizedMessage}")
                 }

             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }

     private var mPayPalResponse : MutableLiveData<PayPalResponse>?=null
     fun payForPlan(postData: HashMap<String,String>): LiveData<PayPalResponse> {
         mPayPalResponse = MutableLiveData()
         getPaid(postData)
         return mPayPalResponse!!

     }

     private fun getPaid(postData: HashMap<String,String>) {
         val call: Call<PayPalResponse> = APIUtils.getServiceAPI()!!.paySubscriptionPlan(postData)
         try {
             call.enqueue(object : Callback<PayPalResponse> {
                 override fun onResponse(
                     call: Call<PayPalResponse>,
                     response: Response<PayPalResponse>
                 ) {

                     try {
                         if (response.isSuccessful) {
                             mPayPalResponse?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:Exception){

                     }

                 }
                 override fun onFailure(call: Call<PayPalResponse>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure: ${t.localizedMessage}")
                 }
             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }

     private var likeMutable : MutableLiveData<LikeResponse>?= null
     fun likeProfile(postData: HashMap<String, String>): LiveData<LikeResponse> {
         likeMutable = MutableLiveData()
         likeApi(postData)
         return likeMutable!!
     }

     private fun likeApi(postData: HashMap<String, String>) {
         val call: Call<LikeResponse> = APIUtils.getServiceAPI()!!.likeActiveProfile(postData)
         try {
             call.enqueue(object: Callback<LikeResponse> {
                 override fun onResponse(call: Call<LikeResponse>, response: Response<LikeResponse>) {

                     try {
                         if (response.isSuccessful) {
                             likeMutable?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:Exception){

                     }

                 }

                 override fun onFailure(call: Call<LikeResponse>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure: ${t.localizedMessage}")
                 }
             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }

     private var mAcceptMutable : MutableLiveData<FriendRequestModal>?=null
     fun  accept(postData : HashMap<String,String>): LiveData<FriendRequestModal> {
         mAcceptMutable = MutableLiveData()
         sendAccept(postData)
         return  mAcceptMutable!!
     }
     private fun sendAccept(postData: HashMap<String, String>) {
         val  call : Call<FriendRequestModal> = APIUtils.getServiceAPI()!!.friendREQUST(postData)

         call.enqueue(object : Callback<FriendRequestModal> {
             override fun onResponse(
                 call: Call<FriendRequestModal>,
                 response: Response<FriendRequestModal>
             ) {

                 try {
                     if (response.isSuccessful) {
                         mAcceptMutable?.value = response.body()
                     } else {
                         if (response.body() != null) {
                             getNavigator()?.onError(response.body()?.msg!!)
                         } else if (response.errorBody() != null) {
                             try {
                                 val str = response.errorBody()!!.string()
                                 Log.d(
                                     TAG,
                                     "onError: $str"
                                 )
                                 getNavigator()?.onError(str)
                             } catch (e: IOException) {
                                 e.printStackTrace()
                             }
                         } else {
                             getNavigator()?.onError("Something went wrong!")
                         }
                     }
                 }catch (e:Exception){

                 }

             }

             override fun onFailure(call: Call<FriendRequestModal>, t: Throwable) {
                 getNavigator()?.onError(t.localizedMessage)
                 Log.d(TAG, "onFailure: ${t.localizedMessage}")
             }

         })
     }

     private var likeCountMutable : MutableLiveData<LikeCountResponse>?= null

     fun getLikeCount(postData: HashMap<String, String>): LiveData<LikeCountResponse> {
         likeCountMutable = MutableLiveData()
         likeCount(postData)
         return likeCountMutable!!
     }

     private fun likeCount(postData: HashMap<String, String>) {
         val call: Call<LikeCountResponse> = APIUtils.getServiceAPI()!!.getLikeCount(postData)
         try {
             call.enqueue(object: Callback<LikeCountResponse> {
                 override fun onResponse(call: Call<LikeCountResponse>, response: Response<LikeCountResponse>) {

                     try {
                         if (response.isSuccessful) {
                             likeCountMutable?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:Exception){

                     }

                 }

                 override fun onFailure(call: Call<LikeCountResponse>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure: ${t.localizedMessage}")
                 }
             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }

     private var saveCommentMutable : MutableLiveData<SaveCommentResponse>?= null
     fun saveComment(postData: HashMap<String, String>): LiveData<SaveCommentResponse> {
         saveCommentMutable = MutableLiveData()
         commentSave(postData)
         return saveCommentMutable!!
     }

     private fun commentSave(postData: HashMap<String, String>) {
         val call: Call<SaveCommentResponse> = APIUtils.getServiceAPI()!!.saveComment(postData)
         try {
             call.enqueue(object: Callback<SaveCommentResponse> {
                 override fun onResponse(call: Call<SaveCommentResponse>, response: Response<SaveCommentResponse>) {

                     try {
                         if (response.isSuccessful) {
                             saveCommentMutable?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:Exception){

                     }

                 }

                 override fun onFailure(call: Call<SaveCommentResponse>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure: ${t.localizedMessage}")
                 }
             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }





     private var commentListMutable : MutableLiveData<CommentResponse>?= null
     fun getComments(postData: HashMap<String, String>): LiveData<CommentResponse> {
         commentListMutable = MutableLiveData()
         getComment(postData)
         return commentListMutable!!
     }

     private fun getComment(postData: HashMap<String, String>) {
         val call: Call<CommentResponse> = APIUtils.getServiceAPI()!!.getCommentList(postData)
         try {
             call.enqueue(object: Callback<CommentResponse> {
                 override fun onResponse(call: Call<CommentResponse>, response: Response<CommentResponse>) {

                     try {
                         if (response.isSuccessful) {
                             commentListMutable?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:Exception){

                     }

                 }

                 override fun onFailure(call: Call<CommentResponse>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure: ${t.localizedMessage}")
                 }
             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }

     private var getLimitModal : MutableLiveData<GetLimitModal>?=null
     fun updatelimit(postData: HashMap<String, String>): LiveData<GetLimitModal> {
         getLimitModal= MutableLiveData()
         getlimit(postData)
         return getLimitModal as MutableLiveData<GetLimitModal>
     }

     private fun getlimit(postData: HashMap<String, String>) {
         val call: Call<GetLimitModal> = APIUtils.getServiceAPI()!!.getlimit(postData)
         try {
             call.enqueue(object : Callback<GetLimitModal> {
                 override fun onResponse(call: Call<GetLimitModal>, response: Response<GetLimitModal>) {

                     try {
                         if (response.isSuccessful) {
                             getLimitModal?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError  rej: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:Exception){

                     }

                 }

                 override fun onFailure(call: Call<GetLimitModal>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure rej: ${t.localizedMessage}")
                 }

             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }

     private var onlineStatusMutable: MutableLiveData<OnlineStatusResponse>?=null
     fun updateStatus(postData: HashMap<String, String>): LiveData<OnlineStatusResponse> {
         onlineStatusMutable= MutableLiveData()
         statusUpdate(postData)
         return onlineStatusMutable!!
     }

     private fun statusUpdate(postData: HashMap<String, String>) {
         val call: Call<OnlineStatusResponse> = APIUtils.getServiceAPI()!!.updateOnlineStatus(postData)
         try {
             call.enqueue(object : Callback<OnlineStatusResponse> {
                 override fun onResponse(call: Call<OnlineStatusResponse>, response: Response<OnlineStatusResponse>) {

                     try {
                         if (response.isSuccessful) {
                             onlineStatusMutable?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError  rej: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:Exception){

                     }

                 }

                 override fun onFailure(call: Call<OnlineStatusResponse>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure rej: ${t.localizedMessage}")
                 }

             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }


     private var deleteCommentMutable : MutableLiveData<DeleteCommentResponse>?= null
     fun deleteComment(postData: HashMap<String, String>): LiveData<DeleteCommentResponse> {
         deleteCommentMutable = MutableLiveData()
         deleteuserComment(postData)
         return deleteCommentMutable!!
     }

     private fun deleteuserComment(postData: HashMap<String, String>) {
         val call: Call<DeleteCommentResponse> = APIUtils.getServiceAPI()!!.deleteComment(postData)
         try {
             call.enqueue(object: Callback<DeleteCommentResponse> {
                 override fun onResponse(call: Call<DeleteCommentResponse>, response: Response<DeleteCommentResponse>) {

                     try {
                         if (response.isSuccessful) {
                             deleteCommentMutable?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:Exception){

                     }

                 }

                 override fun onFailure(call: Call<DeleteCommentResponse>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure: ${t.localizedMessage}")
                 }
             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }
     private var unreadNotiMutable : MutableLiveData<UnreadNotiResponse>?= null
     fun  getUnReadNotiCount(post:HashMap<String,String>): LiveData<UnreadNotiResponse> {
         unreadNotiMutable = MutableLiveData()
         getUnReadNotiCount1(post)
         return unreadNotiMutable!!
     }

     private fun getUnReadNotiCount1(post: HashMap<String, String>) {
         val  call : Call<UnreadNotiResponse> = APIClient!!.getServiceAPI()!!.getUnReadNotiCount(post)
         try {
             call.enqueue(object : Callback<UnreadNotiResponse> {
                 override fun onResponse(
                     call: Call<UnreadNotiResponse>,
                     response: Response<UnreadNotiResponse>
                 ) {
                     try {
                         if (response.isSuccessful) {
                             unreadNotiMutable?.value = response.body()
                         } else {
                             if (response.body() != null) {
                                 getNavigator()?.onError(response.body()?.msg!!)
                             } else if (response.errorBody() != null) {
                                 try {
                                     val str = response.errorBody()!!.string()
                                     Log.d(
                                         TAG,
                                         "onError: $str"
                                     )
                                     getNavigator()?.onError(str)
                                 } catch (e: IOException) {
                                     e.printStackTrace()
                                 }
                             } else {
                                 getNavigator()?.onError("Something went wrong!")
                             }
                         }
                     }catch (e:Exception){

                     }

                 }

                 override fun onFailure(call: Call<UnreadNotiResponse>, t: Throwable) {
                     getNavigator()?.onError(t.localizedMessage)
                     Log.d(TAG, "onFailure: ${t.localizedMessage}")
                 }

             })
         }catch (ex:Exception){
             ex.printStackTrace()
         }

     }*/
}