package com.galkinalex.kotlincourse.lesson18.homework

class Circle (
    val radius: Double
) : Shape () {
    override fun area(): Double {
        return 3.14 * radius *  radius
    }
}