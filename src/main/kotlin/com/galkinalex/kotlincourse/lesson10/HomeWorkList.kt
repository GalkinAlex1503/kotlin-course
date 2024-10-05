package com.galkinalex.kotlincourse.lesson10

fun main() {

    val listTask1 = listOf<Int>()
    println("listTask1 $listTask1")

    val listTask2 = listOf("Hello", "World", "Kotlin")
    println("listTask2 $listTask2")

    val listTask3 = mutableListOf(1, 2, 3, 4, 5)
    println("listTask3 $listTask3")

    val listTask4 = mutableListOf(1, 2, 3, 4, 5)
    listTask4.add(6)
    listTask4.add(7)
    listTask4.add(8)
    println("listTask4 $listTask4")

    val listTask5 = mutableListOf("Hello", "World", "Kotlin")
    listTask5.remove("World")
    println("listTask5 $listTask5")

    val listTask6 = mutableListOf(1, 2, 3, 4, 5)
    println("listTask6 $listTask6")
    for (elem in listTask6) {
        println(elem)
    }

    val listTask7 = mutableListOf("Hello", "World", "Kotlin")
    println("listTask7 $listTask7")
    println("elem 2 ${listTask7[1]}")

    val listTask8 = mutableListOf(1, 2, 3, 4, 5)
    println("listTask8 $listTask8")
    listTask8[2] = 100
    println("new listTask8 $listTask8")

    val listTask9First = mutableListOf("Hello", "World", "Kotlin")
    val listTask9Second = mutableListOf("dfgdf", "dgf", "dgf")
    val listTask9Result = mutableListOf<String>()
    for (elem in listTask9First) {
        listTask9Result.add(elem)
    }
    for (elem in listTask9Second) {
        listTask9Result.add(elem)
    }
    println("listTask9First $listTask9First listTask9Second $listTask9Second listTask9Result $listTask9Result")

    val listTask10 = mutableListOf(2, 1, 2, 3, 4, 5, 3)
    var min = listTask10[0]
    var max = listTask10[0]
    for (elem in listTask10) {
        if (min > elem) min = elem
        if (max < elem) max = elem
    }
    println("listTask10 $listTask10  -- min $min  max $max")

    val listTask11 = mutableListOf(2, 1, 2, 3, 4, 5, 3)
    val listTask11result = mutableListOf<Int>()
    for (elem in listTask11) {
        if (elem % 2 == 0) listTask11result.add(elem)
    }
    println("listTask11 $listTask11 -> listTask11result $listTask11result")

}