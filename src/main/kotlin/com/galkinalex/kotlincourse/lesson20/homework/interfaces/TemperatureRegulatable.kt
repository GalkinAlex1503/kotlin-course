package com.galkinalex.kotlincourse.lesson20.homework.interfaces

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}