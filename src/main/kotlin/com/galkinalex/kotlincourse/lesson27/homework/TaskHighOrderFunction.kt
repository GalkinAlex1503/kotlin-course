package com.galkinalex.kotlincourse.lesson27.homework

import jdk.internal.org.jline.utils.Colors.s
import javax.swing.text.html.HTML.Tag.S

fun timeTracker(
    subFunc: () -> Any
) {
    val startTime = System.currentTimeMillis()
    subFunc()
    val endTime = System.currentTimeMillis()
    println("work time = ${endTime - startTime}")
}

fun main() {

    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }

    timeTracker(myFunction)
}