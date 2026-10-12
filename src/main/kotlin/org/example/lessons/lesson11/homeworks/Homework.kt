package org.example.org.example.lessons.lesson11.homeworks


//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.

//Не принимает аргументов и не возвращает значения.
fun doNothing() {}

//Принимает два целых числа и возвращает их сумму.
fun sumInt(a: Int, b: Int) = a + b

//Принимает строку и ничего не возвращает.
fun getString(str: String) {}

//Принимает список целых чисел и возвращает среднее значение типа Double.
fun equalArr(arrNumber: List<Int>): Double {
    var result: Double = 0.0
    for (elem in arrNumber) {
        result += elem.toDouble()
    }
    return result / arrNumber.size
}

//Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
fun calcSize(str: String?) = str?.length

//Не принимает аргументов и возвращает nullable вещественное число.
fun strangeFun(): Float? {
    return null
}

//Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
fun returnNothing(listNUm: List<Int>?) {}

//Принимает целое число и возвращает nullable строку.
fun getNum(num: Int): String? {
    return null
}

//Не принимает аргументов и возвращает список nullable строк.
fun retunrStringNullble(): List<String>? {
    return null
}

//Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun doSomething(str: String?, num: Int?): Boolean? {
    return null
}


//Напишите валидную сигнатуру метода а так же рабочий код для задач.

//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(num: Int) = num * 2

//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(num: Int): Boolean {
    return num % 2 == 0
}

//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 0) return
    for (i in 1..n) {
        println(n)
    }
}

//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(listNUm: List<Int>): Int? {
    for (elem in listNUm) {
        if (elem < 0) return elem
    }
    return null
}

//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(listStr: List<String>) {
    for (elem in listStr) {
        if (elem == null) return
    }
}
