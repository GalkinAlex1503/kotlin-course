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
    //  val npe: String? = null
    //  val  npeTrans = npe!!

    //ArrayIndexOutOfBoundsException
    //  val arr = arrayOf(1,2,3)
    //  arr[5]

    //ClassCastException
    //  val cast: Any = "str"
    //  cast as Int

    //NumberFormatException
    //  val numStr = "36,6"
    //  numStr.toDouble()

    //IllegalArgumentException
    //  val req = 10
    //  require( req < 10)

    //IllegalStateException
    //  val chk = 10
    //  check(chk < 10)

    //OutOfMemoryError
    //   val arrOME = mutableListOf<String>()
    //   while (true) {
    //        arrOME.add("**********************************************************************************************")
    //    }

    //StackOverflowError
    //  sOFE()

}

fun sOFE () {
    sOFE()
}