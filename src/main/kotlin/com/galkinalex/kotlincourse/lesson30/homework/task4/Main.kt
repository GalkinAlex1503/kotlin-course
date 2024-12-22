package com.galkinalex.kotlincourse.lesson30.homework.task4

import com.galkinalex.kotlincourse.lesson30.homework.task1.Planets

//Создай функцию, которая принимает лямбду и возвращает enum планеты.
// Лямбда должна принимать планету и возвращать булево значение.
// Лямбда здесь выступает в качестве фильтра,
// который должен отфильтровать список всех планет
// по какому-либо признаку (расстояние или вес).
// Вернуть нужно первый элемент из отфильтрованного списка
// или выкинуть исключение если список пустой.

fun superFilter(subFun: (Planets) -> Boolean): Planets {
    return Planets.entries.firstOrNull(subFun) ?: throw Exception("список пустой")
}

fun main() {
    val positiveFileter: (Planets) -> Boolean = {
        it.distance <= 1.0 && it.ordinal > 1
    }
    println(superFilter(positiveFileter))
    val negativeFilter: (Planets) -> Boolean = {
        it.name.startsWith("M")
    }
    println(superFilter(negativeFilter))
}