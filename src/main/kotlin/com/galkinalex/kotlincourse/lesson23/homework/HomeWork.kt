package com.galkinalex.kotlincourse.lesson23.homework

import com.galkinalex.kotlincourse.lesson3.contactInfo
import kotlin.math.pow

//Задача 1
//Напишите функцию analyzeDataType, принимающую параметр типа Any. Функция должна определить тип аргумента и вывести соответствующее сообщение:
//  Для строки: "Это строка: [значение]".
//  Для целого числа: "Это целое число: [значение]".
//  Для списка: "Это список, количество элементов: [количество]".
//  Для карты: "Это карта, количество пар: [количество]".
//  Для остальных типов: "Неизвестный тип данных".
//Используйте оператор is для проверки типов.

fun analyzeDataType(param: Any) {
    when (param) {
        is String -> println("Это строка: [$param]")
        is Int -> println("Это целое число: [$param]")
        is List<*> -> println("Это список, количество элементов: [${param.size}]")
        is Map<*, *> -> println("Это список, количество элементов: [${param.size}]")
        else -> println("Неизвестный тип данных")
    }
}

//Задача 2
//Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую размер списка,
// если аргумент можно безопасно привести к типу List.
// В случае неудачного приведения функция должна возвращать -1.
//Используйте as? для безопасного приведения типа.

fun safeCastToList(param: Any): Int {
    return (param as? List<*>)?.size ?: -1
}

//Задача 3
//Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any? и возвращает длину строки,
// если аргумент можно привести к типу String.
// В случае, если аргумент равен null или не является строкой, функция должна возвращать 0.
// ---- ?   а если тип стринг но значение переменной нал? как раскастуется тип?

fun getStringLengthOrZero(param: Any?): Int {
    return (param as? String)?.length ?: 0
}

//Задача 4
//Создайте функцию, которая принимает параметр типа Any.
//Функция гарантированно ожидает число (в виде числа или строки, например 4 или 4.2 или “4.2”)
// и должна вернуть квадрат этого числа. Если придёт число, его нужно возвести в квадрат, если придёт строка,
// то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.

fun calcSquare(num: Any): Double {
    return if (num is Double) {
        num * num
    } else {
        (num as String).toDouble() * (num as String).toDouble()
    }
}

//Задача 5
//Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any 
// и возвращает сумму всех целочисленных (Int) и вещественных (Double) значений в списке. 
// Все остальные типы должны быть проигнорированы.

fun sumIntOrDoubleValues(listElem: List<Any>): Double {
    var result = 0.0
    listElem.forEach {
        when (it) {
            is Int -> result += it.toDouble()
            is Double -> result += it
            else -> result = result // return@forEach
        }
    }
    return result
}

//Задача 6
//Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и пытается привести его к типу List<*>.
// Если приведение успешно, функция должна напечатать все строки из списка,
// если элемент не является строкой то вывести предупреждение об этом.
// Если приведение неудачно, должно быть выведено сообщение об ошибке, не прерывая выполнение программы.

fun tryCastToListAndPrint(param: Any) {
    (param as List<*>).forEach {
        val elem = it as? String
        println(elem ?: "$it not a String")
    }
}

fun main() {
    println("Task 1")
    analyzeDataType("sdfsd")
    analyzeDataType(13)
    analyzeDataType(listOf("sdfs", "fghfg"))
    analyzeDataType(mapOf("k1" to "v1", "k2" to "v2"))
    analyzeDataType(0.0)
    println()

    println("Task 2")
    println("list ->  ${safeCastToList(listOf("sdfs", "sdfdf"))}")
    println("Int ->  ${safeCastToList(13)}")
    println()

    println("Task 3")
    println("String -> ${getStringLengthOrZero("sdfsdf")}")
    println("null -> ${getStringLengthOrZero(null)}")
    println("Int -> ${getStringLengthOrZero(13)}")
    println()

    println("Task 4")
    println("2.5 -> ${calcSquare(2.5)}")
    println("\"2.5\" -> ${calcSquare("2.5")}")
    println()

    println("Task 5")
    val listOne = listOf("asda", 1, 2.0)
    println("$listOne -> ${sumIntOrDoubleValues(listOne)}")
    println()

    println("Task 6")
    tryCastToListAndPrint(listOf("sdfs","fghfg", 13))

}