package com.galkinalex.kotlincourse.lesson10

@Suppress("NAME_SHADOWING")
fun main() {
    val arrTask1 = arrayOf(1, 2, 3, 4, 5)
    println(" arrTask1 ${arrTask1.toList()}")

    val arrTask2 = Array(10) { "" }
    println(" arrTask2 ${arrTask2.toList()}")

    val arrTask3 = Array(5) { 0.0 }
    for (i in arrTask3.indices) {
        arrTask3[i] = i * 2.0
    }
    println(" arrTask3 ${arrTask3.toList()}")

    val arrTask4 = Array(5) { 0 }
    for (i in arrTask4.indices) {
        arrTask4[i] = i * 3
    }
    println(" arrTask4 ${arrTask4.toList()}")

    val arrTask5: Array<String?> = arrayOfNulls(3)
    arrTask5[0] = "sdfsd"
    arrTask5[1] = "dgfgdf"
    arrTask5[2] = null
    println(" arrTask5 ${arrTask5.toList()}")

    val arrTask6 = arrayOf(1, 2, 3, 4, 5, 6)
    val arrTask6Result = Array(6) { 0 }
    for (i in arrTask6.indices) {
        arrTask6Result[i] = arrTask6[i]
    }
    println(" arrTask6 ${arrTask6.toList()}  arrTask6Result ${arrTask6.toList()}")

    val arrTask7First = arrayOf(6, 7, 8, 9, 10)
    val arrTask7Second = arrayOf(1, 2, 3, 4, 5)
    val arrTask7Result = Array(5) { 0 }
    for (i in arrTask7First.indices) {
        arrTask7Result[i] = arrTask7First[i] - arrTask7Second[i]
    }
    println(" arrTask7First ${arrTask7First.toList()}  arrTask7Second ${arrTask7Second.toList()} arrTask7Result ${arrTask7Result.toList()}")

    val arrTask8 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    var elem = 0
    var result = -1
    while (elem < arrTask8.size) {
        if (arrTask8[elem] == 5) result = elem
        elem++
    }
    println(result)

    val arrTask9 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (elem in arrTask9) {
        if (elem % 2 == 0) println("$elem - четный")
        else println("$elem - нечетный")
    }

    val arrTask10 = arrayOf("sdfsdfs", "gfghfghf", "tyrtyrty")
    println("arrTask10 ${arrTask10.toList()}")
    println(findSubStr(arrTask10, "tyr"))
    println(findSubStr(arrTask10, "plpl"))
}

fun findSubStr(arr: Array<String>, str: String): String {
    for (elem in arr) {
        if (elem.contains(str)) return elem
    }
    return "подстрока $str не найдена"
}
