package com.galkinalex.kotlincourse.lesson20.homework.interfaces

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}