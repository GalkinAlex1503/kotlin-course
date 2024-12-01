package com.galkinalex.kotlincourse.lesson25.homework

//Задание 3. Создай функцию, которая принимает список строк и число, а возвращает список из строк,
// длина которых больше или равна заданному числу. Если список пуст, нужно выкинуть исключение.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

fun main() {

    //Задание 3.

    //test data
    val numSize = 4
    val testList1 = listOf("asd", "dfghfghf", "fghfghfghffg")
    val testList2 = listOf("as", "a", "sas", "dfdfgdfgdfg")
    val testList3 = listOf<String>()

    //anonymous function
    val funTask3AnonymousFun = fun(list: List<String>, num: Int): List<String> {
        require(list.isNotEmpty())
        return list.filter { it.length >= num }
    }

    //lambda expression with type specification
    val funTask3LambdaType: (List<String>, Int) -> List<String> = { list, num ->
        require(list.isNotEmpty())
        list.filter { it.length >= num }
    }
    //lambda expression without specifying a type
    val funTask3LambdaShort = { list: List<String>, num: Int ->
        require(list.isNotEmpty())
        list.filter { it.length >= num }
    }

    //test
    println("Задание 2")
    println("normal function")
    println("$testList1 $numSize -> ${funTask3(testList1, numSize)}")
    println("$testList2 $numSize -> ${funTask3(testList2, numSize)}")
    println(
        "$testList3 $numSize -> ${
            try {
                funTask3(testList3, numSize)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

    println("anonymous function")
    println("$testList1 $numSize -> ${funTask3AnonymousFun(testList1, numSize)}")
    println("$testList2 $numSize -> ${funTask3AnonymousFun(testList2, numSize)}")
    println(
        "$testList3 $numSize -> ${
            try {
                funTask3AnonymousFun(testList3, numSize)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

    println("lambda expression with type specification")
    println("$testList1 $numSize -> ${funTask3LambdaType(testList1, numSize)}")
    println("$testList2 $numSize -> ${funTask3LambdaType(testList2, numSize)}")
    println(
        "$testList3 $numSize -> ${
            try {
                funTask3LambdaType(testList3, numSize)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

    println("lambda expression without specifying a type")
    println("$testList1 $numSize -> ${funTask3LambdaShort(testList1, numSize)}")
    println("$testList2 $numSize -> ${funTask3LambdaShort(testList2, numSize)}")
    println(
        "$testList3 $numSize -> ${
            try {
                funTask3LambdaShort(testList3, numSize)
            } catch (e: Exception) {
                "Error: $e"
            }
        } \n"
    )

}

//normal function
fun funTask3(list: List<String>, num: Int): List<String> {
    require(list.isNotEmpty())
    return list.filter { it.length >= num }
}