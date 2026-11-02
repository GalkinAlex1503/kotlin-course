package org.example.org.example.lessons.lesson16.homeworks

import org.example.org.example.lessons.lesson16.homeworks.printers.Colors
import org.example.org.example.lessons.lesson16.homeworks.printers.printColored


object LevelDebug {
    const val INFO = "INFO"
    const val WARNING = "WARNING"
    const val ERROR = "ERROR"
    const val DEBUG = "DEBUG"
}

open class Logger() {
    open fun log(msg: String) {
        printColored("INFO: $msg", Colors.WHITE)
    }

    open fun log(msg: String, level: String, color: String) {
        printColored("${level}: $msg", color)
    }
}