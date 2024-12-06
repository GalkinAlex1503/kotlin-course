package com.galkinalex.kotlincourse.lesson26.homework

//1. Задания на отработку синтаксиса
//  Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.
fun funTaskSyntax1(
    subFun: () -> Unit
) {
}

//2.  Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.
fun funTaskSyntax2(
    subFun: (Int) -> String
) {
}

//3.  Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.
fun funTaskSyntax3(
    subFun: Int.(String) -> Boolean
) {
}

//4.  Напишите функцию, которая принимает функцию с двумя аргументами типа Double и возвращает Boolean.
fun funTaskSyntax4(
    subFun: (Double, Double) -> Boolean
) {
}

//5.  Напишите функцию, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>.
fun <T> funTaskSyntax5(
    subFun: (T) -> List<T>
) {
}

//6.  Создайте функцию, принимающую функцию с аргументом типа String и возвращающую другую функцию,
//  принимающую Int и возвращающую Boolean.
fun funTaskSyntax6(
    subFun: (String) -> (Int) -> Boolean
) {
}

//7.  Напишите функцию, которая принимает список чисел, множество строк,
//  функцию с аргументами типа List<Int> и Set<String> и возвращающую Map<String, Int>.
fun funTaskSyntax7(
    argList: List<Number>,
    argSet: Set<String>,
    subFun: (List<Int>, Set<String>) -> Map<String, Int>
) {
}

//8.  Напишите функцию, возвращающую строку, принимающую число и функцию, принимающую число и возвращающую строку
fun funTaskSyntax8(
    num: Int,
    subFun: (Int) -> String
): String {
    return ""
}

//9.  Напишите функцию, принимающую функцию, которая возвращает функцию без аргументов и возвращаемого значения.
fun funTaskSyntax9(
    subFun: () -> () -> Unit
) {
}