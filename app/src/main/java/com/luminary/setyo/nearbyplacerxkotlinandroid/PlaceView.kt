package com.luminary.setyo.nearbyplacerxkotlinandroid

import com.luminary.setyo.nearbyplacerxkotlinandroid.Model.ResultsItem

/**
 * Created by root on 18/02/18.
 */
interface PlaceView {

    fun berhasil(data: ArrayList<ResultsItem>)
    fun gagal(pesan : String)

}