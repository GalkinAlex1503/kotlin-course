package org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass

import org.example.org.example.lessons.lesson18.homeworks.interfaces.Openable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.TemperatureRegulatable

abstract class SetTemperatureDevice : ProgrammingDevice(), Openable, TemperatureRegulatable {
    override val maxTemperature: Int = 100
    private val minTemperature: Int = -25
    private var curTemperature: Int = 0
    private var isOpen = false

    override fun setTemperature(temp: Int) {
        if (temp in minTemperature..maxTemperature) {
            curTemperature = temp
            println("Temperature set on $curTemperature")
        } else {
            println("You try set overrange temperature.  max: $maxTemperature , min $minTemperature")
        }
    }

    override fun open() {
        isOpen = true
        println("Open")
    }

    override fun close() {
        isOpen = false
        println("Close")
    }

}