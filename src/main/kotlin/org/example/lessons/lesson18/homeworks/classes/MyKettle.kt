package org.example.org.example.lessons.lesson18.homeworks.classes

import org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass.SetTemperatureDevice
import org.example.org.example.lessons.lesson18.homeworks.interfaces.WaterContainer

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