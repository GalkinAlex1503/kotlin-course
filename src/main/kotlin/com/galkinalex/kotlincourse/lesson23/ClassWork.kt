package com.galkinalex.kotlincourse.lesson23

fun main() {
    val obj: Any = "Hello, World!"

    if (obj is String) {
        println("Объект является строкой")
    }

    if (obj !is Int) {
        println("Объект не является целым числом")
    }

    if (obj is String) {
        // obj автоматически приведён к String
        println(obj.toUpperCase()) // Метод toUpperCase() доступен, т.к. obj теперь String
    }

//    val num: Any = 123
//    val str: String = num as String
//    val safeStr: String? = num as? String


    val nullableStr: String? = "Kotlin"
    val nonNullableStr: String = nullableStr as String
    println(nonNullableStr)

    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)
    for (item in mixedList) {
        when (item) {
            is String -> println("$item - строка длиной ${item.length}")
            is Int -> println("$item - целое число")
            is Double -> println("$item - вещественное число")
            else -> println("Неизвестный тип")
        }
    }

    val i: Any = "sdf"
    println(i as String)
    //println(i as Int)

}