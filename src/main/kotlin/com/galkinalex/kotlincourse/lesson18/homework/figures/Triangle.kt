package com.galkinalex.kotlincourse.lesson18.homework.figures

import kotlin.math.*

class Triangle (
    val a: Double,
    val b: Double,
    val angle: Double
) : Shape() {
    override fun area(): Double {
        return 0.5 * a * b * sin(angle)
    }
}