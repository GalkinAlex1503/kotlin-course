package org.example.org.example.lessons.lesson16.homeworks.printers

class LaserPrinter() : Printer() {
    override fun doPrint(str: String) {
        val phrase = transformPhrase(str)
        phrase.forEach { printWord(it, Colors.BLACK, Background.WHITE) }
    }
}