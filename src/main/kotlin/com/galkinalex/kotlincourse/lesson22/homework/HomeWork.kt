package com.galkinalex.kotlincourse.lesson22.homework

import com.galkinalex.kotlincourse.lesson22.homework.extensions.funA
import com.galkinalex.kotlincourse.lesson22.homework.extensions.funB
import com.galkinalex.kotlincourse.lesson22.homework.extensions.funC
import com.galkinalex.kotlincourse.lesson22.homework.extensions.funD
import com.galkinalex.kotlincourse.lesson22.homework.extensions.funE
import com.galkinalex.kotlincourse.lesson22.homework.extensions.revert
import com.galkinalex.kotlincourse.lesson22.homework.extensions.within

//2. Сконструируй объекты, позволяющие вызвать определённые выше функции и вызови их.
fun main() {
    val exmplA = arrayOf(1, 2, 3, 4, 5)
    println("funA ${exmplA.funA()}")
    println()

    val exmplB = 'c'
    exmplB.funB(1, 2, true)
    println()

    val exmplC = mutableListOf("one", "two")
    println("funC ${exmplC.funC("two", 1)} ")
    println("funC ${exmplC.funC("two", 0)} ")
    println()

    val exmplD = mapOf("one" to listOf("o", "n", "e"), "two" to listOf("t", "w", "o"))
    println("funD ${exmplD.funD(2)}")
    println()

    val exmplE = 1000L
    println("funD ${exmplE.funE()}")
    println()

    println("Переворот элементов пары")
    val pairOne = ("key" to "vol")
    println("$pairOne  revert ${pairOne.revert()}")
    val pairTwo = ("key" to 1)
    println("$pairTwo  revert ${pairTwo.revert()}")
    val pairThree = ("key" to null)
    println("$pairThree  revert ${pairThree.revert()}")
    println()

    println("Проверка допустимого отклонения числа")
    val explWithin = 100.0
    val other = 101.0
    val deviation = 2.0
    println("$explWithin  -> ${explWithin.within(other, deviation)} ")
    println()
}