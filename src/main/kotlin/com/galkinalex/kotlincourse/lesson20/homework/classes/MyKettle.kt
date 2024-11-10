package com.galkinalex.kotlincourse.lesson20.homework.classes

import com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass.SetTemperatureDevice
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.WaterContainer

class MyKettle(
    private val model: String
) : SetTemperatureDevice(), WaterContainer {
    override val maxTemperature = 100
    override val capacity = 3
    override fun fillWater(amount: Int) {
        if (amount > capacity) {
            currentCapacity = capacity
        } else {
            currentCapacity = amount
        }
        print("fill water")
    }

    override fun getWater(amount: Int) {
        if (currentCapacity >= amount) {
            currentCapacity -= amount
            println("getWater")
        } else {
            currentCapacity = 0
            println("pour all water")
        }
    }

    private var currentCapacity = 0

    fun getModel(): String {
        return model
    }
}