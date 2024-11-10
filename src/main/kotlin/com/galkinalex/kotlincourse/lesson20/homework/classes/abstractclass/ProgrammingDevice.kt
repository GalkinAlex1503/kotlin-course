package com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass

import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Programmable

abstract class ProgrammingDevice : PowerOnOffDevice(),  Programmable {

    private val programme = mutableListOf<String>()

    override fun programAction(action: String) {
        programme.add(action)
    }

    override fun execute() {
        if (programme.isNotEmpty()) {
            programme.forEach { println(" do action $it") }
        }
    }

}