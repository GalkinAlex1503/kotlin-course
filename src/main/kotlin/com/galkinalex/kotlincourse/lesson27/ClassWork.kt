package com.galkinalex.kotlincourse.lesson27

import java.io.File

fun main() {
    val list = mutableListOf(1, 2, 3)

    println(list.size)
    list.add(3)
    println(list.size)

    val l: MutableList<Int>.() -> Unit = {
        println(size)
        add(3)
        println(size)
    }

    //with
    with(list,l)
    with(list) {
        println(size)
        add(3)
        println(size)
    }

    //run
    list.add(5)
    val result = list.sum()
    val result1 = list.run {
        add(5)
        sum()
    }

    // use  (for Closeable)
    val s = File("example.txt").inputStream()
    val content = s.readBytes()
    println(content)
    s.close()

    File("example.txt").inputStream().use {
        val content = it.readBytes()
        println(content.size)
    }

    //apply
    val list3 = mutableListOf<Int>().apply {
        add(1)
        add(2)
    }

    //also
    list.also{
        println("dfdgf")
    }.add(3)

    //let
    val str: String? = "Hello"
    str?.let {
        println(it.length)  // Выполняется только если str не null
    }
}