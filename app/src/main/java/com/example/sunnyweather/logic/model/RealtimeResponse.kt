package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

// 实况
data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: RealTime)

    // 天气现象，地表2米气温，空气质量
    data class RealTime(
        val skycon: String,
        val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)

    // 环境空气质量指数
    data class AQI(val chn: Float)

}