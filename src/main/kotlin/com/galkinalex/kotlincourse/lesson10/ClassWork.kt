package com.galkinalex.kotlincourse.lesson10

fun main() {
    val number: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val doubleArr = doubleArrayOf(1.2, 2.2)

    val emptyArray = Array(5) { "" }
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)

    val readOnlyList: List<String> = listOf("a", "b", "c") // not mutable

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c") //mutable

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)
    //////////////////////////
    val num1 = Array(10) { 0 }
    val emptyList = listOf<Int>()
    val strList = listOf("dsf", "sdf", "sdf")
    val stringMutList = mutableListOf<String>("sdfs", "sdfsd")

    stringMutList[1]

    stringMutList.add("sdfsd")
    stringMutList.add("ssdfs")
    stringMutList.remove("sdfsd")
    stringMutList.removeAt(0)

    val empltySet = setOf<Int>()
    val setNum = setOf(1, 2, 3, 4, 5)
    val setNum2 = mutableSetOf(1,2,3)
    setNum2.add(6)
    setNum2.remove(2)
    println(setNum2)

    for (elem in setNum2) {
        println(elem*elem)
    }

    val set1 = setOf(1,2,3)
    val set2 = setOf(3,5,6,7)
    var emptySet = mutableSetOf<Int>()

    for (elem in set1) {
        emptySet.add(elem)
    }

    println(emptySet)

    for (elem in set2) {
        emptySet.add(elem)
    }

    println(emptySet)
    emptySet = mutableSetOf(1)
    println(emptySet)


}

fun findNumber (setNum: Set<Int> , num: Int): Boolean {
    for (elem in setNum) {
        if (elem == num) {
            return true
        }
    }
    return false
}