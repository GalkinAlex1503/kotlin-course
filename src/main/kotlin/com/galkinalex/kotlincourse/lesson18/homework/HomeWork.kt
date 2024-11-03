package com.galkinalex.kotlincourse.lesson18.homework

fun main() {
    val animals = listOf<Animal>(Dog(), Cat(), Bird())
    animals.forEach{ it.makeSound()}
    println()

    val figure = listOf<Shape>(Circle(10.0), Square(3.0, 5.0), Triangle(2.0, 4.0, 30.0))
    figure.forEach{ println(it.area())}
    println()

    LaserPrinter().doPrint("dfgd dfgdf jkljk")
    println()
    InkPrinter().doPrint("sdfs bnmb uiuy fdg")

}