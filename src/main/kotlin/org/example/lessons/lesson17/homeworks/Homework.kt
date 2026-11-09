package org.example.org.example.lessons.lesson17.homeworks

import org.example.org.example.lessons.lesson17.homeworks.slotmachine.ChildrenClass


fun main() {
    val child = ChildrenClass("private value", "protest value", "public value")
    child.publicField = "Антонио Бандераса"
    println(child.getAll())
    println("->")
    child.printText()
    child.setPrivateField("set private field")
    println("->")
    child.setProtField("protected field set")
    println(child.getAll())


}