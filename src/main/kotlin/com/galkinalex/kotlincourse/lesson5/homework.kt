package com.galkinalex.kotlincourse.lesson5

fun main() {
    // Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.
    calcSoundLevelDown(100.0, 0.3)
    calcSoundLevelDown(100.0, null)

    //Задача: Рассчитать полную стоимость доставки.
    calcTotalPay(100.0)
    calcTotalPay(null)

    //Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.
    hasPressure(740)
    hasPressure(null)

}

fun calcSoundLevelDown(levelSound: Double, rateLevelDown: Double?) {
    val currentLevel = levelSound * (rateLevelDown ?: 0.5)
    println(currentLevel)
}

fun calcTotalPay (praice: Double?) {
    val totalPraice = (praice ?: 50.0) + ( (praice ?: 50.0)  *  0.5 / 100 )
    println(totalPraice)
}

fun hasPressure (pressure: Int?) {
    pressure ?: throw Exception("отсутствует показатель атмосферного давления")
}