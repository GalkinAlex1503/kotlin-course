package com.galkinalex.kotlincourse.lesson12

//Напиши валидную сигнатура метода
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun doNothing() {}

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun sumInt(a: Int, b: Int) = a + b

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun getString(str: String) {}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun equalArr(arrNumber: List<Int>): Double {
    var result: Double = 0.0
    for (elem in arrNumber) {
        result += elem.toDouble()
    }
    return result / arrNumber.size
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun calcSize(str: String?) = str?.length

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
fun strangeFun(): Float? {
    return null
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun returnNothing(listNUm: List<Int>?) {}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun getNum(num: Int): String? {
    return null
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun retunrStringNullble(): List<String>? {
    return null
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun doSomething(str: String?, num: Int?): Boolean? {
    return null
}


//Напиши рабочий код для следующих задач:
//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(num: Int) = num * 2

//
//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(num: Int): Boolean {
    return num % 2 == 0
}

//
//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
//
fun printNumbersUntil(n: Int) {
    if (n < 0) return
    for (i in 1..n) {
        println(n)
    }
}

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
//
fun findFirstNegative(listNUm: List<Int>): Int? {
    for (elem in listNUm) {
        if (elem < 0) return elem
    }
    return null
}

//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(listStr: List<String>) {
    for (elem in listStr) {
        if (elem == null) return
    }
}

//Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.
fun drawRectangle(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    // Верхняя граница
    var topLine = "+"
    for (i in 1 until width - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)

    // Боковые границы
    for (i in 1 until height - 1) {
        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }

    // Нижняя граница
    var bottomLine = "+"
    for (i in 1 until width - 1) {
        bottomLine += "-"
    }
    bottomLine += "+\n"
    print(bottomLine)
}