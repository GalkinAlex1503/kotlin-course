package org.example.org.example.lessons.lesson18.homeworks.classes

import org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass.SetTemperatureDevice
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Cleanable

class MyOven(
    private val model: String
) : SetTemperatureDevice(), Cleanable {
    override val maxTemperature = 250

    fun getModel(): String {
        return model
    }

    override fun clean() {
        println("Clean!")
    }
}