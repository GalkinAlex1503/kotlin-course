package org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass

import org.example.org.example.lessons.lesson18.homeworks.interfaces.Powerable

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