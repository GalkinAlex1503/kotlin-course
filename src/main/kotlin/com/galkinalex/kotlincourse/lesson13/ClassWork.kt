package com.galkinalex.kotlincourse.lesson13

fun main() {


    val list = listOf(8, 56, 23, 87, 12, 18, 11)


    val filtered2 = list.filter { it in 7..17 }
    println(filtered2)


}