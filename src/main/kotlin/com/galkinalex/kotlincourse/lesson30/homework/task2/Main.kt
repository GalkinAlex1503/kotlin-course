package com.galkinalex.kotlincourse.lesson30.homework.task2

import com.galkinalex.kotlincourse.lesson30.homework.task1.TypeRealEstate

//Создай функцию, которая выводит на печать человекочитаемые названия типов недвижимости
// в порядке возрастания длины названия enum.

fun printSort() {
    TypeRealEstate.entries.sortedBy { it.description.length }.map { println(it.description) }
}

fun main() {
    printSort()
}