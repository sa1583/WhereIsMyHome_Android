package com.ssafy.whereismyhome_android.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://10.0.2.2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val _api = retrofit.create(NoticeDao::class.java)
    val api get() = _api
}