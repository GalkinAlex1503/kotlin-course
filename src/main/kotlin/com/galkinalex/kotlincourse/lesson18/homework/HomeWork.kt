package com.galkinalex.kotlincourse.lesson18.homework

import com.galkinalex.kotlincourse.lesson18.homework.animals.Animal
import com.galkinalex.kotlincourse.lesson18.homework.animals.Bird
import com.galkinalex.kotlincourse.lesson18.homework.animals.Cat
import com.galkinalex.kotlincourse.lesson18.homework.animals.Dog
import com.galkinalex.kotlincourse.lesson18.homework.carts.ShoppingCart
import com.galkinalex.kotlincourse.lesson18.homework.figures.Circle
import com.galkinalex.kotlincourse.lesson18.homework.figures.Shape
import com.galkinalex.kotlincourse.lesson18.homework.figures.Square
import com.galkinalex.kotlincourse.lesson18.homework.figures.Triangle
import com.galkinalex.kotlincourse.lesson18.homework.printers.InkPrinter
import com.galkinalex.kotlincourse.lesson18.homework.printers.LaserPrinter

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

    println("Корзина товаров")
    val carts = ShoppingCart(mutableMapOf(1 to 0, 2 to 0))
    println(carts.toString())
    carts.addToCart(2)
    println(carts.toString())
    carts.addToCart(1, 2)
    println(carts.toString())
    carts.addToCart(listOf(1,2,3))
    println(carts.toString())
}