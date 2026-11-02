package org.example.org.example.lessons.lesson16.homeworks.figures

class Circle(
    val radius: Double
) : Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
}