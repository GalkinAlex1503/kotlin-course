package com.galkinalex.kotlincourse.lesson18.homework

abstract class Printer() {
    open fun doPrint(str: String) {
        str.split(" ").forEach{ println(it)}
    }
}