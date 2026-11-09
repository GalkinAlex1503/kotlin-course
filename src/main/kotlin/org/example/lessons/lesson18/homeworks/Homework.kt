package org.example.org.example.lessons.lesson18.homeworks

import org.example.org.example.lessons.lesson18.homeworks.classes.MyKettle
import org.example.org.example.lessons.lesson18.homeworks.classes.MyOven
import org.example.org.example.lessons.lesson18.homeworks.classes.MyRefrigerator
import org.example.org.example.lessons.lesson18.homeworks.classes.MyWashingMachine

fun main() {
    //холодильник
    val myRefrigerator = MyRefrigerator("Samsung")
    println(myRefrigerator.getModel())
    myRefrigerator.setTemperature(-10)
    myRefrigerator.open()
    myRefrigerator.powerOn()
    println()

    //стиральная машина
    val myWashingMachine = MyWashingMachine("bosh")
    println(myWashingMachine.getModel())
    myWashingMachine.connectToWaterSupply()
    myWashingMachine.connectToDrain()
    myWashingMachine.fillWater(30)
    println(myWashingMachine.getCurrentCapacity())
    myWashingMachine.powerOn()
    myWashingMachine.drain()
    println(myWashingMachine.getCurrentCapacity())
    println()

    //чайник
    val myKettle = MyKettle("Bork")
    println(myKettle.getModel())
    myKettle.fillWater(2)
    myKettle.powerOn()

    //духовка
    val myOven = MyOven("Gorenjie")
    println(myOven.getModel())
    myOven.setTemperature(200)
    myOven.open()
    myOven.close()
    myOven.powerOn()
    myOven.powerOff()
    myOven.clean()

}