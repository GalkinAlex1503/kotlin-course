package com.galkinalex.kotlincourse.lesson24.homework

fun main() {
    val arr = listOf(1,2,3)
    try {
        arr[4]
    } catch (e: ArrayIndexOutOfBoundsException) {
        throw MyArrayIndexOutOfBoundsException(e)
    }
}