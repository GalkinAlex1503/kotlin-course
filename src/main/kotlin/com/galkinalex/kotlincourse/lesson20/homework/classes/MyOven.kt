package com.galkinalex.kotlincourse.lesson20.homework.classes

import com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass.SetTemperatureDevice
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Cleanable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Openable

class MyOven (
    private val model: String
): SetTemperatureDevice(), Cleanable {
    override val maxTemperature = 250

    fun getModel ():  String {
        return model
    }
    override fun clean() {
        println("Clean!")
    }
}