package com.galkinalex.kotlincourse.lesson25.homework

//Задание 1. Создай константу в файле с текстом. Создай функцию, которая ничего не принимает и
// не возвращает и печатает в консоль текст константы.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь как функция работает


fun main() {

    //Задание 1.

    //anonymous function
    val funTask1AnonymousFun = fun() {
        println(ConstHomeWork.TXT)
    }

    //lambda expression with type specification
    val funTask1LambdaType: () -> Unit = {
        println(ConstHomeWork.TXT)
    }

    //lambda expression without specifying a type
    val funTask1LambdaShort = {
        println(ConstHomeWork.TXT)
    }

    //tests
    println("Задание 1")
    funTask1AnonymousFun()
    funTask1LambdaType()
    funTask1LambdaShort()

}

//normal function
fun funTask1() {
    println(ConstHomeWork.TXT)
}