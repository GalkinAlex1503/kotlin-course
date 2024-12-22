package com.galkinalex.kotlincourse.lesson17.homework.figures

class Triangle(
    a: Double,
    b: Double,
    c: Double
) : Polygon(listOf(a, b, c)) {
    override fun calcArea(): Double {
        //calculate area
        return 0.0
    }
}