package com.galkinalex.kotlincourse.lesson30.homework.task1ext

//Создай enum с перечислением для светофора. Enum должен включать цвет из класса Colors, длительность сигнала duration и количество миганий blinkTimes (может быть null). Мигание нужно установить только для зелёного сигнала.
//Реализовать функцию с бесконечным циклом, которая будет выводить сигналы светофора в порядке: красный (4 сек), жёлтый (2 сек), зелёный (4 сек), зелёный мигающий (4 раза).
//Отображение сигнала выполняется через showSignal()
//Задержку между сигналами можно выполнить через Thread.sleep() в который передаётся задержка в миллисекундах. Мигание выполняется через попеременный вызов clear() и showSignal() с задержками между ними в 300мс

const val LIGHT_SYMBOL = "\u25CF"
// Функция для отображения сигнала
fun showSignal(signal: TrafficLightSignal) {
    print("\r" + signal.color.value + LIGHT_SYMBOL + Colors.RESET_COLOR.value) // Выводим сигнал с возвратом каретки
}
fun clear() {
    print("\r    ")
}

fun blink(signal: TrafficLightSignal) {
    showSignal(signal)
    Thread.sleep(300)
    clear()
    Thread.sleep(300)
}

fun runLights() {
    while (true) {
            for (n in TrafficLightSignal.entries) {
                if (n.blinkTimes != null) {
                    showSignal(n)
                    Thread.sleep(n.duration * 1000)
                    for (i in 1..n.blinkTimes ){
                        blink(n)
                    }
                } else {
                    showSignal(n)
                    Thread.sleep(n.duration * 1000)
                }
            }
    }
}


fun main() {
    runLights()
}