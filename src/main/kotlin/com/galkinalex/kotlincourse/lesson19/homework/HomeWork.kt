package com.galkinalex.kotlincourse.lesson19.homework

import com.galkinalex.kotlincourse.lesson19.homework.qa.ChildrenClass

fun main() {
    val child = ChildrenClass("private value", "protest value", "public value")
    child.publicField = "Антонио Бандераса"
    println(child.getAll())
    println("->")
    child.printText()
    child.setPrivateField("set private field")
    println("->")
    println(child.getAll())
}