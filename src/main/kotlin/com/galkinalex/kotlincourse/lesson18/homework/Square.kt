package com.galkinalex.kotlincourse.lesson18.homework

class Square (
    val a: Double,
    val b: Double
) : Shape () {
    override fun area(): Double {
        return a * b
    }
}