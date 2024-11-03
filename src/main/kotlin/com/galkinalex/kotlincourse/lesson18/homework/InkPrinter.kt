package com.galkinalex.kotlincourse.lesson18.homework

class InkPrinter () : Printer () {
    override fun doPrint(str: String) {
        str.split(" ").forEach{ println(it)}
    }
}