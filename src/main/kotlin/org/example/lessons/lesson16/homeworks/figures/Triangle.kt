package org.example.org.example.lessons.lesson16.homeworks.figures

import kotlin.math.sin

class Triangle(
    val a: Double,
    val b: Double,
    val angle: Double
) : Shape() {
    override fun area(): Double {
        return 0.5 * a * b * sin(angle)
    }
}