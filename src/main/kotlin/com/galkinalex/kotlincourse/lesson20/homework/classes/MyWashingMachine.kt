package com.galkinalex.kotlincourse.lesson20.homework.classes

import com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass.SetTemperatureDevice
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Drainable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.WaterConnection
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.WaterContainer

class MyWashingMachine(
    private val model: String,

    ) : SetTemperatureDevice(), WaterConnection, WaterContainer, Drainable {
    override val maxTemperature = 60
    override val capacity = 40
    private var currentCapacity = 0
    private var isConnectWater = false
    private var isConnectDrain = false

    fun getModel(): String {
        return model
    }

    fun getCurrentCapacity(): Int {
        return currentCapacity
    }

    override fun connectToWaterSupply() {
        isConnectWater = true
        println("Plug to water")
    }

    override fun getWater(amount: Int) {
        TODO("Not yet implemented")
    }


    override fun fillWater(amount: Int) {
        currentCapacity = amount
        println("fill water")
    }


    override fun connectToDrain() {
        isConnectDrain = true
        println("Plug to drain")
    }

    override fun drain() {
        currentCapacity = 0
        println(" water pour out")
    }
}