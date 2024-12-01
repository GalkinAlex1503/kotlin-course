package com.galkinalex.kotlincourse.lesson25.homework

import com.galkinalex.kotlincourse.lesson25.homework.extension.funTask5

//Задание 5. Создай функцию расширение списка чисел, которая будет возвращать список уникальных чисел (без дубликатов).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

fun main() {

    //Задание 5.

    //test data
    val testList1 = listOf(1,2,3,4,5,6)
    val testList2 = listOf(1,1,2,2,3,3)
    val testList3 = listOf(1,2,3,4,5,6,3,7,9,2)

    //anonymous function
    val funTask5AnonymousFun = fun List<Int>.(): List<Int> {
        return distinct()
    }

    //lambda expression with type specification
    val funTask5LambdaType: List<Int>.() -> List<Int> = {
        distinct()
    }
    //lambda expression without specifying a type
    // this is impossible

    //test
    println("Задание 5")
    println("normal function")
    println("$testList1 -> ${testList1.funTask5()}")
    println("$testList2 -> ${testList2.funTask5()}")
    println("$testList3 -> ${testList3.funTask5()}")


    println("anonymous function")
    println("$testList1 -> ${testList1.funTask5AnonymousFun()}")
    println("$testList2 -> ${testList2.funTask5AnonymousFun()}")
    println("$testList3 -> ${testList3.funTask5AnonymousFun()}")

    println("lambda expression with type specification")
    println("$testList1 -> ${testList1.funTask5LambdaType()}")
    println("$testList2 -> ${testList2.funTask5LambdaType()}")
    println("$testList3 -> ${testList3.funTask5LambdaType()}")

}
