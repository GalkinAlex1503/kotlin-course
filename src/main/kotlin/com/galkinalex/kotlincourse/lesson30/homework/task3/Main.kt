package com.galkinalex.kotlincourse.lesson30.homework.task3

import com.galkinalex.kotlincourse.lesson30.homework.task1.StatusTests

//Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения
// и возвращает Enum со статусом прохождения теста в зависимости от того как выполнится
// принятая лямбда. Если без исключений - pass, если будет AssertionError - failure,
// прочие исключения  - broken.

fun testStart(subfun: () -> Unit):  StatusTests {
    try {
        subfun()
        return StatusTests.PASS
    } catch (e: AssertionError) {
        return StatusTests.FAIlURE
    } catch (e: Exception) {
        return StatusTests.BROKEN
    }
}

fun main() {

}