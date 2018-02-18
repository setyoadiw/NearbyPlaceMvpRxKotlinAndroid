package com.luminary.setyo.nearbyplacerxkotlinandroid

import android.util.Log
import com.luminary.setyo.nearbyplacerxkotlinandroid.Model.ResponseServer
import com.luminary.setyo.nearbyplacerxkotlinandroid.Model.ResultsItem
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by root on 18/02/18.
 */
class PlacePresenterImp : PlacePresenter {

    var placeView : PlaceView? = null

    var data : ArrayList<ResultsItem>? = null

    constructor(placeView: PlaceView?) {
        this.placeView = placeView
        this.data = data
    }


    override fun getDataRecycler() {


        Network.service.getPlace()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({
                    t: ResponseServer? ->

                    placeView?.berhasil(t?.results as ArrayList<ResultsItem>)

                    Log.d("data server",t?.results.toString())
                },{
                    e ->
                    Log.d("error:",e.localizedMessage)

                    placeView?.gagal(e.localizedMessage.toString())
                })

    }
}