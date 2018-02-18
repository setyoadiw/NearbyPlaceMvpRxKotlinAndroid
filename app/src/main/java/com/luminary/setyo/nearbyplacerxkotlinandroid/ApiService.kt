package com.luminary.setyo.nearbyplacerxkotlinandroid

import com.luminary.setyo.nearbyplacerxkotlinandroid.Model.ResponseServer
import com.luminary.setyo.nearbyplacerxkotlinandroid.Model.ResultsItem
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by root on 18/02/18.
 */
interface ApiService {

    @GET("json?location=-6.9923015,110.4272074&radius=500&type=restaurant&key=AIzaSyCloTHDoQJTzxQuaj17qUIiuhML5nrPYqg")
    fun getPlace():Observable<ResponseServer>
}