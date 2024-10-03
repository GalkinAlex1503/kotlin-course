package com.galkinalex.kotlincourse.lesson9

fun main() {
    val bBay = "02.10.2024"

    var curDay = "01.10.2024"
    println(calcDay(curDay, bBay))

    curDay = "01.11.2024"
    println(calcDay(curDay, bBay))

    curDay = "01.11.2024"
    println(calcDay(curDay, bBay))
}

fun calcDay(day: String, bDay: String): String {
    if (checkDay(day, bDay)) {
        return "Сегодня тот самый день! С днем рождения!"
    } else {
        val monthToDay = getMonth(day, bDay)
        return  if (monthToDay == 0) {
            " День рождения уже скоро!"
        } else {
            "Сегодня не тот день! Ждите еще $monthToDay месяцев"
        }
    }
}

fun checkDay(day: String, bDay: String): Boolean {
    return day == bDay
}

fun getMonth(day: String, bDay: String): Int {
    var result = 0;

    return result
}
