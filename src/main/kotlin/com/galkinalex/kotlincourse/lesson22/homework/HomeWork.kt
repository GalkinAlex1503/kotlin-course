package com.galkinalex.kotlincourse.lesson22.homework

import com.galkinalex.kotlincourse.lesson22.homework.extensions.*

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

}