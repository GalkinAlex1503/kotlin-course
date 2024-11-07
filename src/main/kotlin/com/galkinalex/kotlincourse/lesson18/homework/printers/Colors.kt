package com.galkinalex.kotlincourse.lesson18.homework.printers


object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}

object ColorPair {
    val colorPair = mapOf(
        1 to listOf(Colors.WHITE, Background.BLACK),
        2 to listOf(Colors.RED, Background.CYAN),
        3 to listOf(Colors.GREEN, Background.PURPLE),
        4 to listOf(Colors.YELLOW, Background.BLUE),
        5 to listOf(Colors.BLUE, Background.YELLOW),
        6 to listOf(Colors.PURPLE, Background.GREEN),
        7 to listOf(Colors.CYAN, Background.RED),
        8 to listOf(Colors.WHITE, Background.BLACK)
    )
}

fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}