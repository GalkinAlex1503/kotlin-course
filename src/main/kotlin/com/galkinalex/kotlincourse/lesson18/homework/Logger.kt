package com.galkinalex.kotlincourse.lesson18.homework

import com.galkinalex.kotlincourse.lesson18.homework.printers.Background
import com.galkinalex.kotlincourse.lesson18.homework.printers.Colors
import com.galkinalex.kotlincourse.lesson18.homework.printers.printColored

object LevelDebug {
    const val INFO = "INFO"
    const val WARNING = "WARNING"
    const val ERROR = "ERROR"
    const val DEBUG = "DEBUG"
}

open class  Logger() {
    open   fun  log(msg: String) {
        printColored("INFO: $msg", Colors.WHITE)
    }

    open   fun  log(msg: String, level: String, color : String) {
        printColored("${level}: $msg", color)
    }
}

