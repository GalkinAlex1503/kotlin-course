package com.galkinalex.kotlincourse.lesson25.homework

//Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее арифметическое этого списка.
// С помощью require проверь, что список не пустой.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).


fun main() {

    //Задание 2.

    //test data
    val testList1 = listOf(1, 2, 3)
    val testList2 = listOf(1, 2, 3, 4)
    val testList3 = listOf<Int>()

    //anonymous function
    val funTask2AnonymousFun = fun(list: List<Int>): Double {
        require(list.isNotEmpty())
        return list.sum().toDouble() / list.size
    }

    //lambda expression with type specification
    val funTask2LambdaType: (List<Int>) -> Double = { list ->
        require(list.isNotEmpty())
        list.sum().toDouble() / list.size
    }
    //lambda expression without specifying a type
    val funTask2LambdaShort = { list: List<Int> ->
        require(list.isNotEmpty())
        list.sum().toDouble() / list.size
    }

    //test
    println("Задание 2")
    println("normal function")
    println("$testList1 -> ${funTask2(testList1)}")
    println("$testList2 -> ${funTask2(testList2)}")
    println(
        "$testList3 -> ${
            try {
                funTask2(testList3)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

    println("anonymous function")
    println("$testList1 -> ${funTask2AnonymousFun(testList1)}")
    println("$testList2 -> ${funTask2AnonymousFun(testList2)}")
    println(
        "$testList3 -> ${
            try {
                funTask2AnonymousFun(testList3)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

    println("lambda expression with type specification")
    println("$testList1 -> ${funTask2LambdaType(testList1)}")
    println("$testList2 -> ${funTask2LambdaType(testList2)}")
    println(
        "$testList3 -> ${
            try {
                funTask2LambdaType(testList3)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

    println("lambda expression without specifying a type")
    println("$testList1 -> ${funTask2LambdaShort(testList1)}")
    println("$testList2 -> ${funTask2LambdaShort(testList2)}")
    println(
        "$testList3 -> ${
            try {
                funTask2LambdaShort(testList3)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

}

//normal function
fun funTask2(list: List<Int>): Double {
    require(list.isNotEmpty())
    return list.sum().toDouble() / list.size
}