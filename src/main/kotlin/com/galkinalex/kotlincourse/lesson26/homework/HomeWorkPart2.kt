package com.galkinalex.kotlincourse.lesson26.homework

import com.galkinalex.kotlincourse.lesson12.retunrStringNullble
import jdk.internal.org.jline.utils.Colors.s

//Задания на разработку кода

//  Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр, оставляющую только строки,
//  удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение).
//  Функция должна вернуть результат фильтрации исходного списка строк.
fun filterStrings(
    listStr: List<String>,
    filterFun: (String) -> Boolean,
): List<String> {
    return listStr.filter { filterFun(it) }
}

//Создайте функцию applyToNumbers, которая принимает список чисел и функцию,
//  преобразующую каждое число в другое число (те-есть принимающая число и возвращающая число).
//  Функция должна вернуть результат преобразования исходного списка чисел.
fun applyToNumbers(
    numList: List<Number>,
    transformFun: (Number) -> Number
): List<Number> {
    return numList.map { transformFun(it) }
}

//  Реализуйте функцию sumByCondition, которая принимает список чисел и функцию,
//  определяющую условие для включения числа в сумму. Функция должна вернуть сумму чисел, прошедших проверку.
fun sumByCondition(
    numList: List<Number>,
    checkFun: (Number) -> Boolean
): Number {
    return numList.filter { checkFun(it) }.sumOf { it.toDouble() }
}

//  Напишите функцию combineAndTransform,
//  которая принимает две коллекции одного типа и функцию для их объединения и
//  преобразования в одну коллекцию другого типа.
//  Функция должна вернуть результат преобразования (коллекцию второго типа)
fun <T> combineAndTransform(
    col1: List<T>,
    col2: List<T>,
    funUnion: (List<T>, List<T>) -> Set<T>
): Set<T> {
    return funUnion(col1, col2)
}

fun main() {
    //    Для последних четырёх заданий сделать минимум по две разные реализации лямбда функций и
    //    проверить работу на разных наборах данных

    //filterStrings     filterFun: (String) -> Boolean
    val filterLower: (String) -> Boolean = {
        it == it.lowercase() && it.isNotEmpty()
    }
    val filterPerfectSize: (String) -> Boolean = {
        it.length % 2 == 0 && it.isNotEmpty()
    }

    //test data
    val testData11 = listOf("sdfs", "fghfh", "Wdfgd", "WWWW", "")
    val testData12 = listOf("s6d6v6vs", "fgh!sdf7", "dfmgkdWdfsd", "sdfsd", "6576756")

    //tests
    println("filterStrings")
    println("   subfunc -> filterLower")
    println("$testData11 : ${filterStrings(testData11, filterLower)}")
    println("$testData12 : ${filterStrings(testData12, filterLower)}")

    println("   subfunc -> filterPerfectSize")
    println("$testData11 : ${filterStrings(testData11, filterPerfectSize)}")
    println("$testData12 : ${filterStrings(testData12, filterPerfectSize)}")
    println()

    //applyToNumbers  transformFun: (Number) -> Number
    val transformNegative: (Number) -> Number = {
        when (it) {
            is Int -> -1 * it
            is Long -> -1 * it
            is Double -> -1 * it
            is Float -> -1 * it
            is Byte -> -1 * it
            is Short -> -1 * it
            else -> 0
        }
 //       (-1 * it.toDouble())
    }

    val transformIncreaseTenfold: (Number) -> Number = {
        when (it) {
            is Int -> 10 * it
            is Long -> 10 * it
            is Double -> 10 * it
            is Float -> 10 * it
            is Byte -> 10 * it
            is Short -> 10 * it
            else -> 0
        }
    }

    //test data
    val testData21 = listOf( 1, 1.0, -1, 0.1, 0)
    val testData22 = listOf(-5 , -5.0 , 100L, 0)

    //tests
    println("applyToNumbers")
    println("   subfunc -> transformNegative")
    println("$testData21 : ${applyToNumbers(testData21, transformNegative)}")
    println("$testData22 : ${applyToNumbers(testData22, transformNegative)}")

    println("   subfunc -> transformIncreaseTenfold")
    println("$testData21 : ${applyToNumbers(testData21, transformIncreaseTenfold)}")
    println("$testData22 : ${applyToNumbers(testData22, transformIncreaseTenfold)}")
    println()

    //sumByCondition
}