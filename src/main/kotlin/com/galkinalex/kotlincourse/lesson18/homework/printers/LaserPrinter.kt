package com.galkinalex.kotlincourse.lesson18.homework.printers

class LaserPrinter() : Printer() {
    override fun doPrint(str: String) {
        val phrase = transformPhrase(str)
        phrase.forEach { printWord(it, Colors.BLACK, Background.WHITE) }
    }
}