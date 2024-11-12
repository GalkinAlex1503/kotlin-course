package com.galkinalex.kotlincourse.lesson21.homework

//    1. Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>,
//    которая будет создавать карту из списков ключей и значений.
//    Если ключей или значений больше, то оставшиеся ключи или значения не записываем в словарь.
fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    if (keys.size != values.size) {
        throw Exception("Incorrect parameters")
    }
    val result = mutableMapOf<K, V>()
    for (i in keys.indices) {
        result[keys[i]] = values[i]
    }
    return result.toMap()
}

//2. Напишите функцию getMiddleElement<T>(list: List<T>): T?,
// которая будет возвращать средний элемент списка, если он существует.
fun <T> getMiddleElement(list: List<T>): T? {
    return if (list.size % 2 == 0) {
        null
    } else {
        list[(list.size / 2).toInt()]
    }
}

//3. Напишите класс ListHolder,
// который будет хранить список элементов типа T и иметь метод для добавления и получения всех элементов.
class ListHolder<T>(
    private val listElem: MutableList<T>
) {
    fun addElem(elem: T) {
        listElem.add(elem)
    }

    fun getList(): List<T> {
        return listElem
    }
}

//4. Создайте интерфейс Mapper<T, R>,
// который будет определять метод для преобразования элементов типа T в элементы типа R.
interface Mapper <T, R> {
    fun  transform(elem: T): R
}

//5. Создай класс PhrasesToListOfStrings
// и имплементируй интефрейс Mapper с типами String и List<String>. Метод преобразования должен разбивать входящую
// строку по символу пробела и возвращать список из полученных слов.
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun transform(elem: String): List<String> {
      return elem.split(" ")
    }
}
// ****** класс с интерефейосм Mapper с типами Double и List<Int>.  Метод разбивает агргумент на целую и дробную часть и помещает их в список
class DoubleToListOfInt : Mapper<Double, List<String>> {
    override fun transform(elem: Double): List<String> {
       return elem.toString().split(".")
    }
}

fun main() {
    println("1")
    println(toMap(listOf(1, 2, 3, 4, 5), listOf("1", "2", "3", "4", "5")))
    println()

    println("2")
    println(getMiddleElement(listOf("sdfs", "sdfs")))
    println(getMiddleElement(listOf("sdfs", "gfgfh", "fghfgh")))
    println(getMiddleElement(listOf(1, 2, 3, 4, 5)))
    println()

    println("3")
    println("4")
    println("5")
    val exm5 = PhrasesToListOfStrings()
    println( exm5.transform("sdfsf sdfsd sdfs") )
    val exm5_2 = DoubleToListOfInt()
    println( exm5_2.transform( 10.02 ) )

}