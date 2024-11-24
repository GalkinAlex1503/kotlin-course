package com.galkinalex.kotlincourse.lesson24.homework

//    Задание 1. Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
//      NullPointerException
//      ArrayIndexOutOfBoundsException
//      ClassCastException
//      NumberFormatException
//      IllegalArgumentException
//      IllegalStateException
//      OutOfMemoryError
//      StackOverflowError

fun main() {

    //NullPointerException
    try {
        val npe: String? = null
        npe!!
    } catch (e: NullPointerException) {
        println("This is NullPointerException  e: $e")
    }

    //ArrayIndexOutOfBoundsException
    try {
        val arr = arrayOf(1, 2, 3)
        arr[5]
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("This is ArrayIndexOutOfBoundsException  e: $e")
    }

    //ClassCastException
    try {
        val cast: Any = "str"
        cast as Int
    } catch (e: ClassCastException) {
        println("This is ClassCastException  e: $e")
    }

    //NumberFormatException
    try {
        val numStr = "36,6"
        numStr.toDouble()
    } catch (e: NumberFormatException) {
        println("This is NumberFormatException  e: $e")
    }

    //IllegalArgumentException
    try {
        val req = 10
        require(req < 10)
    } catch (e: IllegalArgumentException) {
        println("This is IllegalArgumentException  e: $e")
    }

    //IllegalStateException
    try {
        val chk = 10
        check(chk < 10)
    } catch (e: IllegalStateException) {
        println("This is IllegalStateException  e: $e")
    }

    //OutOfMemoryError
    try {
        val arrOME = mutableListOf<String>()
        while (true) {
            arrOME.add("**********************************************************************************************")
        }
    } catch (e: OutOfMemoryError) {
        println("This is OutOfMemoryError  e: $e")
    }

    //StackOverflowError
    try {
        sOFE()
    } catch (e: StackOverflowError) {
        println("This is StackOverflowError  e: $e")
    }
}

fun sOFE() {
    sOFE()
}