package com.galkinalex.kotlincourse.lesson25.homework

import com.galkinalex.kotlincourse.lesson18.homework.printers.Printer

//Задание 4. Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
//Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()


fun main() {

    //Задание 4.

    //test data
    val testLong1 = 123L
    val testLong2 = 3423425345645641L
    val testLong3 = null

    //anonymous function
    val funTask4AnonymousFun = fun(num: Long?): Int {
        require(num != null)
        return num.toString().trim().split("").filter { it.isNotBlank() }.sumOf { it.toInt() }
    }

    //lambda expression with type specification
    val funTask4LambdaType: (Long?) -> Int = { num ->
        require(num != null)
        num.toString().trim().split("").filter { it.isNotBlank() }.sumOf { it.toInt() }
    }
    //lambda expression without specifying a type
    val funTask4LambdaShort = { num: Long? ->
        require(num != null)
        num.toString().trim().split("").filter { it.isNotBlank() }.sumOf { it.toInt() }
    }

    //test
    println("Задание 4")
    println("normal function")
    println("$testLong1 -> ${funTask4(testLong1)}")
    println("$testLong2 -> ${funTask4(testLong2)}")
    println(
        "$testLong3 -> ${
            try {
                funTask4(testLong3)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

    println("anonymous function")
    println("$testLong1 -> ${funTask4AnonymousFun(testLong1)}")
    println("$testLong2 -> ${funTask4AnonymousFun(testLong2)}")
    println(
        "$testLong3 -> ${
            try {
                funTask4AnonymousFun(testLong3)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

    println("lambda expression with type specification")
    println("$testLong1 -> ${funTask4LambdaType(testLong1)}")
    println("$testLong2 -> ${funTask4LambdaType(testLong2)}")
    println(
        "$testLong3 -> ${
            try {
                funTask4LambdaType(testLong3)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

    println("lambda expression without specifying a type")
    println("$testLong1 -> ${funTask4LambdaShort(testLong1)}")
    println("$testLong2 -> ${funTask4LambdaShort(testLong2)}")
    println(
        "$testLong3 -> ${
            try {
                funTask4LambdaShort(testLong3)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

}

//normal function
fun funTask4(num: Long?): Int {
    require(num != null)
    return num.toString().trim().split("").filter { it.isNotBlank() }.sumOf { it.toInt() }
}