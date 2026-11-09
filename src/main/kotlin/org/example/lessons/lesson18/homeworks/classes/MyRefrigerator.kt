package org.example.org.example.lessons.lesson18.homeworks.classes

import org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass.SetTemperatureDevice

class MyRefrigerator(
    private val model: String
) : SetTemperatureDevice() {
    fun getModel(): String {
        return model
    }
}