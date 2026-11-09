package org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass

import org.example.org.example.lessons.lesson18.homeworks.interfaces.Programmable

abstract class ProgrammingDevice : PowerOnOffDevice(), Programmable {

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