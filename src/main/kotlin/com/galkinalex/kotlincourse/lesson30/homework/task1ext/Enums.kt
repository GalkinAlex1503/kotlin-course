package com.galkinalex.kotlincourse.lesson30.homework.task1ext

enum class Colors(
    val value: String
) {
    RED_COLOR("\u001B[31m"),
    YELLOW_COLOR("\u001B[33m"),
    GREEN_COLOR("\u001B[32m"),
    RESET_COLOR("\u001B[0m"),
    ;
}

enum class TrafficLightSignal(
    val color: Colors,
    val duration: Long,
    val blinkTimes: Int?
) {
    RED(Colors.RED_COLOR, 4, null),
    YELLOW(Colors.YELLOW_COLOR, 2, null),
    GREEn(Colors.GREEN_COLOR, 4, 4),
    ;
}