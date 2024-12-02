package com.galkinalex.kotlincourse.lesson25.homework

import com.galkinalex.kotlincourse.lesson25.homework.extension.funTask7

//Задание 7. Создай функцию расширения словаря из списка и множества,
// которая принимает все известные тебе типы (вспомни все что знаешь и под каждый тип создай аргумент)
// и возвращает строку. Функция должна распечатать все данные, которые тебе в ней доступны
// и вернуть конкатенацию всех данных которые ей доступны (порядок неважен).
// Конкатенация - это присоединение. Код должен быть отформатирован таким образом, чтобы легко читался.
//По аналогии с предыдущим заданием выполни трансформации.

fun main() {

    //Задание 7.

    //test data
    val testMap1: Map<List<Any?>, Set<Any?>> = mapOf(
        listOf(1, "asd", null, listOf(0.0, 1.0, 2.0)) to setOf(1, 2, 3)
    )
    val testMap2: Map<List<Any?>, Set<Any?>> = mapOf(
        listOf(1, 2, 3, 4) to setOf(1, 2, 3),
        listOf("d", "df", "gfh", " ") to setOf(5, 6, 7)
    )
    val testMap3: Map<List<Any?>, Set<Any?>> = mapOf(
        listOf(null) to setOf(null)
    )

    //anonymous function
    val funTask7AnonymousFun = fun Map<List<Any?>, Set<Any?>>.(arg: Any?): String {
        println("start")
        println("arg: $arg")
        this.forEach { (k, v) ->
            println("${k.toString()} to ${v.toString()}")
        }
        println("finish")
        return this.map { (k, v) -> k.toString() + v.toString() }.joinToString(" || ")
    }

    //lambda expression with type specification
    val funTask7LambdaType: Map<List<Any?>, Set<Any?>>.(Any?) -> String = { arg ->
        println("start")
        println("arg: $arg")
        this.forEach { (k, v) ->
            println("${k.toString()} to ${v.toString()}")
        }
        println("finish")
        this.map { (k, v) -> k.toString() + v.toString() }.joinToString(" || ")
    }

    //lambda expression without specifying a type
    // this is impossible

    //test
    println("Задание 7")
    println("normal function")
    println("$testMap1 -> ${testMap1.funTask7(null)}")
    println("$testMap2 -> ${testMap2.funTask7(1)}")
    println("$testMap3 -> ${testMap3.funTask7("sdf")}")


    println("anonymous function")
    println("$testMap1 -> ${testMap1.funTask7AnonymousFun(null)}")
    println("$testMap2 -> ${testMap2.funTask7AnonymousFun(1)}")
    println("$testMap3 -> ${testMap3.funTask7AnonymousFun("sdf")}")

    println("lambda expression with type specification")
    println("$testMap1 -> ${testMap1.funTask7LambdaType(null)}")
    println("$testMap2 -> ${testMap2.funTask7LambdaType(1)}")
    println("$testMap3 -> ${testMap3.funTask7LambdaType("sdf")}")
}