package com.galkinalex.kotlincourse.lesson25

fun main() {

    val funB = fun() {}  //ananim func
    val funC: () -> Unit = {}
    val funD = {}
    val funE: (String) -> Int = { arg -> arg.length }
    val funG = { arg: String -> arg.length }

    //-----
    val fun2 = fun String.(arg1: Int, arg2: Int): Boolean {
        println(this)
        println(arg1)
        println(arg2)
        return arg1 == arg2
    }
    val fun3: String.(Int, Int) -> Boolean = { arg1, arg2 ->
        println(this)
        println(arg1)
        println(arg2)
        arg1 == arg2
    }

    val str = "Hello"
    println(str.fun3(1, 2))

    //===================================
    val fun12 = fun(list: List<Int>): Int {
        return list.filter { it > 0 }.sum()
    }

    val fun13: (List<Int>) -> Int = { list ->
        list.filter { it > 0 }.sum()
    }

    val fun14 = { list: List<Int> ->
        list.filter { it > 0 }.sum()
    }

    val filterEvan1 = fun Set<Int>.(): Set<Int> {
        return filter { it % 2 == 0 }.toSet()
    }

    val filterEvan2: Set<Int>.() -> Set<Int> = {
        filter { it % 2 == 0 }.toSet()
    }
}

fun funA() {}

fun String.fun1(arg1: Int, arg2: Int): Boolean {
    println(this)
    println(arg1)
    println(arg2)
    return arg1 == arg2
}

fun fun11(list: List<Int>): Int {
    return list.filter { it > 0 }.sum()
}

fun Set<Int>.filterEvan(): Set<Int> {
    return filter { it % 2 == 0 }.toSet()
}