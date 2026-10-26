package org.example.org.example.lessons.lesson15.homeworks.figures

class Circle(
    val radius: Double
) : Figure() {
    override fun calcArea(): Double {
        return 3.14 * radius * radius
    }
}