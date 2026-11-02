package org.example.org.example.lessons.lesson16.homeworks.figures

class Square(
    val a: Double,
    val b: Double
) : Shape() {
    override fun area(): Double {
        return a * b
    }
}