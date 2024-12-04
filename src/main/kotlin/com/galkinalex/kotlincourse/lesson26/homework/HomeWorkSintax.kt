package com.galkinalex.kotlincourse.lesson26.homework

//Задания на отработку синтаксиса
//  Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.
fun funTaskSyntax1(
    subFun: () -> Unit
) {
}

//  Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.
fun funTaskSyntax2(
    subFun: (Int) -> String
) {
}

//  Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.
fun funTaskSyntax3(
    subFun: Int.(String) -> Boolean
) {
}

//  Напишите функцию, которая принимает функцию с двумя аргументами типа Double и возвращает Boolean.
fun funTaskSyntax3(
    subFun: (Double, Double) -> Boolean
) {
}

//  Напишите функцию, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>.
fun <T> funTaskSyntax3(
    subFun: (T) -> List<T>
) {
}

//  Создайте функцию, принимающую функцию с аргументом типа String и возвращающую другую функцию,
//  принимающую Int и возвращающую Boolean.
fun funTaskSyntax4(
    subFun: (String) -> (Int) -> Boolean
) {
}

//  Напишите функцию, которая принимает список чисел, множество строк,
//  функцию с аргументами типа List<Int> и Set<String> и возвращающую Map<String, Int>.
fun funTaskSyntax5(
    argList: List<Number>,
    argSet: Set<String>,
    subFun: (List<Int>, Set<String>) -> Map<String, Int>
) {
}

//  Напишите функцию, возвращающую строку, принимающую число и функцию, принимающую число и возвращающую строку
fun funTaskSyntax6(
    num: Int,
    subFun: (Int) -> String
): String {
    return ""
}

//  Напишите функцию, принимающую функцию, которая возвращает функцию без аргументов и возвращаемого значения.
fun funTaskSyntax7(
    subFun: () -> () -> Unit
) {
}