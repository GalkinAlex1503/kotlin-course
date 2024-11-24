package com.galkinalex.kotlincourse.lesson24.homework

fun main() {

    try {

        //NullPointerException
        val npe: String? = null
        npe!!

        //ArrayIndexOutOfBoundsException
        val arr = arrayOf(1, 2, 3)
        arr[5]

        //ClassCastException
        val cast: Any = "str"
        cast as Int

        //NumberFormatException
        val numStr = "36,6"
        numStr.toDouble()

        //IllegalArgumentException
        val req = 10
        require(req < 10)

        //IllegalStateException
        val chk = 10
        check(chk < 10)

        //OutOfMemoryError
        val arrOME = mutableListOf<String>()
        while (true) {
            arrOME.add("**********************************************************************************************")
        }

        //StackOverflowError
        sOFE()

    } catch (e: Exception) {
        when (e) {
            is NullPointerException -> println("This is NullPointerException  e: $e")
            is ArrayIndexOutOfBoundsException -> println("This is ArrayIndexOutOfBoundsException  e: $e")
            is ClassCastException -> println("This is ClassCastException  e: $e")
            is NumberFormatException ->  println("This is NumberFormatException  e: $e")
            is IllegalArgumentException -> println("This is IllegalArgumentException  e: $e")
            is IllegalStateException -> println("This is IllegalStateException  e: $e")
            is OutOfMemoryError -> println("This is OutOfMemoryError  e: $e")
            is StackOverflowError -> println("This is StackOverflowError  e: $e")
            else -> println("This is Exception  e:$e")
        }
    }

}
