package org.example.org.example.lessons.lesson16.homeworks.printers

abstract class Printer() {
    abstract fun doPrint(str: String)

    protected fun transformPhrase(str: String): List<String> {
        return str.split(" ")
    }

    protected fun printWord(
        word: String,
        color: String,
        backgroundColor: String = ""
    ) {
        printColored(word, color, backgroundColor)
    }
}