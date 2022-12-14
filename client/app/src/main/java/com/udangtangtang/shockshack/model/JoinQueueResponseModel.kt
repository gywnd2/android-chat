package com.udangtangtang.shockshack.model

import com.google.gson.annotations.SerializedName

data class JoinQueueResponseModel (
    @SerializedName("responseResult")
    val res:String,

    @SerializedName("chatRoomId")
    val roomId:String,

    @SerializedName("sessionId")
    val sessionId:String
)