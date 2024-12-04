package com.galkinalex.kotlincourse.lesson25.homework.extension

import java.lang.IllegalStateException

//Задание 6. Создай функцию расширение словаря из строк и чисел,
// которая принимает число и возвращает список ключей,
// длина которых меньше их значений но больше заданного в функции аргумента.
// В случае если список получается пустой нужно выкинуть исключение IllegalState.

fun Map<String, Int>.funTask6(num: Int): List<String> {
    val result = mutableListOf<String>()
    this.forEach { (k, v) ->
        if (k.length in (num + 1)..<v) {
            result.add(k)
        }
    }
    if (result.isEmpty()) {
        throw IllegalStateException("result is empty")
    } else {
        return result.toList()
    }
}

//Задание 7. Создай функцию расширения словаря из списка и множества,
// которая принимает все известные тебе типы (вспомни все что знаешь и под каждый тип создай аргумент) и
// возвращает строку. Функция должна распечатать все данные, которые тебе в ней доступны и
// вернуть конкатенацию всех данных которые ей доступны (порядок неважен).
// Конкатенация - это присоединение. Код должен быть отформатирован таким образом, чтобы легко читался.

fun Map<List<Any?>,Set<Any?>>.funTask7(arg: Any?) : String {
    println("start")
    println("arg: $arg")
    this.forEach { (k, v) ->
        println("${k.toString()} to ${v.toString()}")
    }
    println("finish")
    return this.map { (k,v) -> k.toString() + v.toString()}.joinToString(" || ")
}