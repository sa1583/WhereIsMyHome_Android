package com.ssafy.whereismyhome_android.model

import com.ssafy.whereismyhome_android.vo.Notice
import com.ssafy.whereismyhome_android.vo.NoticeList
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET

interface NoticeDao {
    @GET("notice/search")
    fun getNoticeList(): Call<List<Notice>>
}