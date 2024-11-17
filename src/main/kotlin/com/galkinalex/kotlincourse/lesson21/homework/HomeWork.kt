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
        return listElem.toList()
    }
}

//4. Создайте интерфейс Mapper<T, R>,
// который будет определять метод для преобразования элементов типа T в элементы типа R.
//6.Добавь к интерфейсу Mapper ещё один метод,
// который будет преобразовывать список элементов типа T в список элементов типа R.
// Реализуй этот метод в классе PhrasesToListOfStrings с аналогичной механикой.
interface Mapper<T, R> {
    fun transform(elem: T): R
    fun convertList(list: List<T>): List<R>

}

//5. Создай класс PhrasesToListOfStrings
// и имплементируй интефрейс Mapper с типами String и List<String>. Метод преобразования должен разбивать входящую
// строку по символу пробела и возвращать список из полученных слов.
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun transform(elem: String): List<String> {
        return elem.split(" ")
    }

    override fun convertList(list: List<String>): List<List<String>> {
        return list.map { transform(it) }
    }
}

//7. Напишите интерфейс Validator<T>, который будет проверять значение типа T
// на соответствие определенным условиям и возвращать булево значение (успешная или неуспешная проверка).
interface Validator<T> {
    fun check(elem: T): Boolean
}

//8.Создай класс StringValidator и имплементируй интерфейс Validator с типом String?.
// Реализуй проверку, что строка не является null, не пустая и не состоит из одних пробелов.
class StringValidator : Validator<String?> {
    override fun check(elem: String?): Boolean {
        return !elem.isNullOrBlank()
    }
}

//9. Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int.
// Реализуй проверку, что число чётное.
class OddValidator : Validator<Int> {
    override fun check(elem: Int): Boolean {
        return elem % 2 == 0
    }
}

//10. Создай класс ListValidator
//с дженериком, ограниченным типом Number
//имплементируй интерфейс Validator
//типизированный по типу List с nullable типом дженерика класса
//Реализуй проверку:
//что ни один элемент списка не является null
//Ни один элемент приведённый к типу Double не равен 0.0
class ListValidator : Validator<List<Number?>> {
    override fun check(elem: List<Number?>): Boolean {
        if (elem.isEmpty()) {
            return false
        }

        elem.forEach {
            //      println(it)
            it ?: return false
        }
        elem.forEach {
            if (it?.toDouble() == 0.0) {
                return false
            }
        }
        return true
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
    val exm3 = ListHolder(mutableListOf(1, 2, 3, 4))
    exm3.addElem(9)
    println(exm3.getList())
    println()

    println("4 5")
    val exm5 = PhrasesToListOfStrings()
    println(exm5.transform("sdfsf sdfsd sdfs"))
    println("6")
    println(exm5.convertList(listOf("sdfd cxv", "bvnbn oipo")))
    println()

    println("7 8")
    val exm7 = StringValidator()
    println(" string (${"  "}) ${exm7.check("  ")}")
    println(" string (${"sdfsd"}) ${exm7.check("sdfsd")}")
    println()

    println("9")
    val exm9 = OddValidator()
    var num = 5
    println(" ${num} - ${exm9.check(num)}")
    num = 6
    println(" ${num} - ${exm9.check(num)}")
    println()

    println("10")
    val exm10 = ListValidator()
    println(" ()   ${exm10.check(listOf())} ")
    println(" (1, null , 2)   ${exm10.check(listOf(1, null, 2))} ")
    println(" (1,  2, 0 , 4)   ${exm10.check(listOf(1, 2, 0, 4))} ")
    println(" (1,  2, 3 , 4)   ${exm10.check(listOf(1, 2, 3, 4))} ")
}