package com.galkinalex.kotlincourse.lesson26.homework

//Задания на разработку кода

//  Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр, оставляющую только строки,
//  удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение).
//  Функция должна вернуть результат фильтрации исходного списка строк.
fun filterStrings(
    listStr: List<String>,
    filterFun: (String) -> Boolean,
): List<String> {
    return listStr.filter { filterFun(it) }
}

//Создайте функцию applyToNumbers, которая принимает список чисел и функцию,
//  преобразующую каждое число в другое число (те-есть принимающая число и возвращающая число).
//  Функция должна вернуть результат преобразования исходного списка чисел.
fun applyToNumbers(
    numList: List<Number>,
    transformFun: (Number) -> Number
): List<Number> {
    return numList.map { transformFun(it) }
}

//  Реализуйте функцию sumByCondition, которая принимает список чисел и функцию,
//  определяющую условие для включения числа в сумму. Функция должна вернуть сумму чисел, прошедших проверку.
fun sumByCondition(
    numList: List<Number>,
    checkFun: (Number) -> Boolean
): Number {
    return numList.filter { checkFun(it) }.sumOf { it.toDouble() }
}

//  Напишите функцию combineAndTransform,
//  которая принимает две коллекции одного типа и функцию для их объединения и
//  преобразования в одну коллекцию другого типа.
//  Функция должна вернуть результат преобразования (коллекцию второго типа)
fun <T> combineAndTransform(
    col1: List<T>,
    col2: List<T>,
    funUnion: (List<T>, List<T>) -> Set<T>
): Set<T> {
    return funUnion(col1, col2)
}