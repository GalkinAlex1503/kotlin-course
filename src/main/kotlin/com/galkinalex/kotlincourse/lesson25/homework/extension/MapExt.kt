package com.galkinalex.kotlincourse.lesson25.homework.extension

import java.lang.IllegalStateException

//Задание 6. Создай функцию расширение словаря из строк и чисел,
// которая принимает число и возвращает список ключей,
// длина которых меньше их значений но больше заданного в функции аргумента.
// В случае если список получается пустой нужно выкинуть исключение IllegalState.

fun Map<String, Int>.funTask6(num: Int): List<String> {
    val result = mutableListOf<String>()
    this.forEach { k, v ->
        if (k.length < v && k.length > num) {
            result.add(k)
        }
    }
    if (result.isEmpty()) {
        throw IllegalStateException("result is empty")
    } else {
        return result.toList()
    }
}