package com.galkinalex.kotlincourse.lesson25.homework

import com.galkinalex.kotlincourse.lesson25.homework.extension.funTask5
import com.galkinalex.kotlincourse.lesson25.homework.extension.funTask6
import java.lang.IllegalStateException

//Задание 6. Создай функцию расширение словаря из строк и чисел, которая принимает число и
// возвращает список ключей,
// длина которых меньше их значений но больше заданного в функции аргумента.
// В случае если список получается пустой нужно выкинуть исключение IllegalState.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

fun main() {

    //Задание 6.

    //test data
    val numArg = 2
    val testMap1 = mapOf("asdas" to 4, "asd" to 10, "sdfsdfsdfsd" to 5, "qqqq" to 15)
    val testMap2 = mapOf("asdassdfsd" to 20, "as" to 10)
    val testMap3 = mapOf("asdassdfsdffdfgd" to 4)

    //anonymous function
    val funTask6AnonymousFun = fun Map<String, Int>.(num: Int): List<String> {
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

    //lambda expression with type specification
    val funTask6LambdaType: Map<String, Int>.(Int) -> List<String> = { num ->
        val result = mutableListOf<String>()
        this.forEach { k, v ->
            if (k.length < v && k.length > num) {
                result.add(k)
            }
        }
        if (result.isEmpty()) {
            throw IllegalStateException("result is empty")
        } else {
            result.toList()
        }
    }
    //lambda expression without specifying a type
    // this is impossible

    //test
    println("Задание 6")
    println("normal function")
    println(
        "$testMap1 -> ${
            try {
                testMap1.funTask6(numArg)
            } catch (e: Exception) {
                "Error: $e"
            }
        }"
    )
    println(
        "$testMap2 -> ${
            try {
                testMap2.funTask6(numArg)
            } catch (e: Exception) {
                "Error: $e"
            }
        }"
    )
    println(
        "$testMap3 -> ${
            try {
                testMap3.funTask6(numArg)
            } catch (e: Exception) {
                "Error: $e"
            }
        }"
    )


    println("anonymous function")
    println(
        "$testMap1 -> ${
            try {
                testMap1.funTask6AnonymousFun(numArg)
            } catch (e: Exception) {
                "Error: $e"
            }
        }"
    )
    println(
        "$testMap2 -> ${
            try {
                testMap2.funTask6AnonymousFun(numArg)
            } catch (e: Exception) {
                "Error: $e"
            }
        }"
    )
    println(
        "$testMap3 -> ${
            try {
                testMap3.funTask6AnonymousFun(numArg)
            } catch (e: Exception) {
                "Error: $e"
            }
        }"
    )

    println("lambda expression with type specification")
    println(
        "$testMap1 -> ${
            try {
                testMap1.funTask6LambdaType(numArg)
            } catch (e: Exception) {
                "Error: $e"
            }
        }"
    )
    println(
        "$testMap2 -> ${
            try {
                testMap2.funTask6LambdaType(numArg)
            } catch (e: Exception) {
                "Error: $e"
            }
        }"
    )
    println(
        "$testMap3 -> ${
            try {
                testMap3.funTask6LambdaType(numArg)
            } catch (e: Exception) {
                "Error: $e"
            }
        }"
    )

}