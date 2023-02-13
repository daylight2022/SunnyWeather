package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*


data class DailyResponse(val status: String, val result: Result) {
    data class Result(val daily: Daily)

    data class Daily(val temperature: List<Temperature>, val skycon: List<Skycon>, @SerializedName("life_index") val lifeIndex: LifeIndex)

    data class Temperature(val max: Float, val min: Float)
    // 天气现象
    data class Skycon(val date: Date, val value: String)

    data class LifeIndex(
        val ultraviolet: List<LifeDescription>,  // 紫外线指数
        val carWashing: List<LifeDescription>,  // 洗车指数
        val dressing: List<LifeDescription>,  // 穿衣指数
        val comfort: List<LifeDescription>,  // 舒适度指数
        val coldRisk: List<LifeDescription>  // 感冒指数
    )

    data class LifeDescription(val desc: String)
}