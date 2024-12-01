package com.galkinalex.kotlincourse.lesson25.homework.extension

//Задание 5. Создай функцию расширение списка чисел,
// которая будет возвращать список уникальных чисел (без дубликатов).

fun List<Int>.funTask5() : List<Int> {
    return distinct()
}

