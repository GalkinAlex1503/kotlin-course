package com.galkinalex.kotlincourse.lesson11

fun main() {
    val pair: Pair<Int, String> = 1 to "a"
    val pair2 = Pair(2,"a")
    println(pair.first)
    println(pair.second)

    val emptyMap: Map<String, String> = mapOf<String,String>()

    val a1 = "sdfad" to "sdsf"
    val a2 = "sdfsd" to "sdsfd"
    val capitals =  mapOf(a1,a2)

    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")

    val capitalOfRussia = capitals["Россия"]

    mutableCapitals["Германия"] = "Берлин"
    mutableCapitals.remove("Франция")

    for (entries in mutableCapitals) {
        println("${entries.key} : ${entries.value}")
    }



}