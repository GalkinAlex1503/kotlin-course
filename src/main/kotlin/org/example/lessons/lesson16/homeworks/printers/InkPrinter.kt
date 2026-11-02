package org.example.org.example.lessons.lesson16.homeworks.printers

class InkPrinter() : Printer() {
    override fun doPrint(str: String) {
        val phrase = transformPhrase(str)
        var cnt = 1
        var color = Colors.RESET
        var background = Background.RESET
        phrase.forEach {
            if (cnt == 9) {
                cnt = 1
            }
            color = ColorPair.colorPair.getValue(cnt).first().toString()
            background = ColorPair.colorPair.getValue(cnt).last().toString()
            printWord(it, color, background)
            cnt++
        }
    }
}