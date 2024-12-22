package com.galkinalex.kotlincourse.lesson26

fun funA(
    arg1: () -> Unit
) {
}

fun funC(
    arg1: (Int) -> String
) {
    println(arg1(5))
}

//-------------------
fun <T> newFun(
    arg1: (List<T>) -> T,
    arg2: List<T>
): T {
    return arg1(arg2)
}


fun main() {
    val val1: (Int) -> String = {
        it.toString() + "5"
    }

    val val2: (Int) -> String = {
        "${it + 5} "
    }

    funC(val1)
    funC(val2)

//-----------------------
    val val3: (List<Int>) -> Int = {
        it.sum()
    }

    val val4: (List<String>) -> String = { list ->
        list.joinToString { it }
    }

    println(newFun(val3, listOf(1, 2, 3, 4)))
    println(newFun(val4, listOf("asd", "dfg", "765", "090")))

}