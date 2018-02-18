package com.luminary.setyo.nearbyplacerxkotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.luminary.setyo.nearbyplacerxkotlinandroid.Model.ResultsItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PlaceView {

    lateinit var presenter : PlacePresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()

    }

    private fun initView() {
        presenter.getDataRecycler()
    }

    private fun initPresenter() {
        presenter = PlacePresenterImp(this)

    }


    override fun berhasil(data: ArrayList<ResultsItem>) {
        //Log.d("cek","lalalala")
    //masukkan ke adapter
    var iniadapter = RecyclerAdapter(data)
    //adapter masukkan ke recyclerview
    recyclerview.adapter = iniadapter
    recyclerview.layoutManager = LinearLayoutManager(this)

    }

    override fun gagal(pesan: String) {

    }


}



