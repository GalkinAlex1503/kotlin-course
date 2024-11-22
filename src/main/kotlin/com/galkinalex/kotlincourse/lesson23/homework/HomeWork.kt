package com.galkinalex.kotlincourse.lesson23.homework

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

    println("Task 3")


}