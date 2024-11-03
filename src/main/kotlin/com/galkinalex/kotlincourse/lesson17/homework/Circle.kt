package com.galkinalex.kotlincourse.lesson17.homework

class Circle (
    val radius: Double
) : Figure() {
   override fun calcArea ():Double {
        return 3.14* radius * radius
    }
}