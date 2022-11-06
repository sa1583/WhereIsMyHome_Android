package com.ssafy.whereismyhome_android.vo

import com.google.gson.annotations.SerializedName

data class Notice(
    @SerializedName("num") val num: String,
    @SerializedName("title") val title: String,
    @SerializedName("content") val content: String,
    @SerializedName("wdate") val wdate: String,
    @SerializedName("count") val count: String,
)

data class NoticeList(val noticeList: List<Notice>)