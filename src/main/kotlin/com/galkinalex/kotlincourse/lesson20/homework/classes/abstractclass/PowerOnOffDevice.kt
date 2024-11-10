package com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass

import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Powerable

abstract class PowerOnOffDevice : Powerable {
    private var isOn = false
    override fun powerOff() {
        isOn = false
        println("Power off")
    }

    override fun powerOn() {
        isOn = true
        println("Power on")
    }
}