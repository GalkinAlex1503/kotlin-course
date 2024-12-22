package com.galkinalex.kotlincourse.lesson20.homework.classes

import com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass.SetTemperatureDevice

class MyRefrigerator(
    private val model: String
) : SetTemperatureDevice() {
    fun getModel(): String {
        return model
    }
}