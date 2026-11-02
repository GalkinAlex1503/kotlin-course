package org.example.org.example.lessons.lesson16.homeworks

import org.example.org.example.lessons.lesson16.homeworks.animals.Animal
import org.example.org.example.lessons.lesson16.homeworks.animals.Bird
import org.example.org.example.lessons.lesson16.homeworks.animals.Cat
import org.example.org.example.lessons.lesson16.homeworks.animals.Dog
import org.example.org.example.lessons.lesson16.homeworks.carts.ShoppingCart
import org.example.org.example.lessons.lesson16.homeworks.figures.Circle
import org.example.org.example.lessons.lesson16.homeworks.figures.Shape
import org.example.org.example.lessons.lesson16.homeworks.figures.Square
import org.example.org.example.lessons.lesson16.homeworks.figures.Triangle
import org.example.org.example.lessons.lesson16.homeworks.printers.Colors
import org.example.org.example.lessons.lesson16.homeworks.printers.InkPrinter
import org.example.org.example.lessons.lesson16.homeworks.printers.LaserPrinter


fun main() {
    val animals = listOf<Animal>(Dog(), Cat(), Bird())
    animals.forEach { it.makeSound() }
    println()

    val figure = listOf<Shape>(Circle(10.0), Square(3.0, 5.0), Triangle(2.0, 4.0, 30.0))
    figure.forEach { println(it.area()) }
    println()

    LaserPrinter().doPrint("dfgd dfgdf jkljk")
    println()
    InkPrinter().doPrint("sdfs bnmb uiuy fdg")

    println("Корзина товаров")
    val carts = ShoppingCart(mutableMapOf(1 to 0, 2 to 0))
    println(carts.toString())
    carts.addToCart(2)
    println(carts.toString())
    carts.addToCart(1, 2)
    println(carts.toString())
    carts.addToCart(listOf(1, 2, 3))
    println(carts.toString())
    println()

    println("Логгер")
    val msg = "dsdfsdfsdfsdf"
    val log = Logger();
    log.log(msg)
    log.log(msg, LevelDebug.INFO, Colors.RED)

}