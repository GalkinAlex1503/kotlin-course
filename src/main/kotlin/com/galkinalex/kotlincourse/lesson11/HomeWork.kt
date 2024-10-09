package com.galkinalex.kotlincourse.lesson11

fun main() {
//    Задание 1: Создание Пустого Словаря
//    Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val mapTask1 = mapOf<Int, Int>()
    println("mapTask1 $mapTask1")
    println()

//    Задание 2: Создание и Инициализация Словаря
//    Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val mapTask2 = mapOf(0.1F to 0.1, 2.3F to 1.1)
    println("mapTask2 $mapTask2")
    println()

//    Задание 3: Создание Изменяемого Словаря
//    Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val mapTask3 = mutableMapOf<Int, String>()
    println("mapTask3 $mapTask3")
    println()

//    Задание 4: Добавление Элементов в Словарь
//    Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    val mapTask4 = mutableMapOf(1 to "sdfds", 2 to "dfghfd")
    mapTask4[3] = "vbnmbvn"
    println("mapTask4 $mapTask4")
    println()

//    Задание 5: Получение Значений из Словаря
//    Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    val mapTask5 = mutableMapOf(1 to "fds", 2 to "hfd")
    println("mapTask5 2 = ${mapTask5[2]}  5 = ${mapTask5[5]}")
    println()

//    Задание 6: Удаление Элементов из Словаря
//    Удалите определенный элемент из изменяемого словаря по его ключу.
    val mapTask6 = mutableMapOf(1 to "fds", 2 to "hfd")
    mapTask6.remove(1)
    println("mapTask6 $mapTask6")
    println()

//    Задание 7: Перебор Словаря в Цикле
//    Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val mapTask7 = mutableMapOf(1.0 to 1, 2.4 to 3, 5.0 to 0)
    for ((key, vol) in mapTask7) {
        if (vol == 0) {
            println("бесконечность")
        } else {
            println(key / vol)
        }
    }
    println()

//    Задание 8: Перезапись Элементов Словаря
//    Измените значение для существующего ключа в изменяемом словаре.
    val mapTask8 = mutableMapOf(1 to "fds", 2 to "hfd")
    mapTask8[2] = "new"
    println("mapTask8 $mapTask8")
    println()

//    Задание 9: Сложение Двух Словарей
//    Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val mapTask9First = mutableMapOf(1 to "fds", 2 to "hfd")
    val mapTask9Second = mutableMapOf(1 to "sdf", 3 to "hugh")
    val mapTask9Result = mutableMapOf<Int, String>()
    for (elem in mapTask9First) {
        mapTask9Result[elem.key] = elem.value
    }
    for (elem in mapTask9Second) {
        mapTask9Result[elem.key] = elem.value
    }
    println("mapTask9First  $mapTask9First  mapTask9Second $mapTask9Second mapTask9Result $mapTask9Result")
    println()

//    Задание 10: Словарь с Сложными Типами
//    Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val mapTask10 = mutableMapOf<String, List<Int>>()
    mapTask10["asdas"] = listOf(1, 2, 3, 4)
    mapTask10["fghf"] = listOf(2, 2, 3, 6)
    println("mapTask10 $mapTask10")
    println()

//    Задание 11: Использование Множества в Качестве Значения
//    Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
//    Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    val mapTask11 =
        mutableMapOf(1 to mutableSetOf("dsdf", "sfdsd", "sdfsdf"), 2 to mutableSetOf("5645", "bn,mn", "qweq"))
    mapTask11[1]?.add("new")
    println("mapTask11 $mapTask11")
    println()

//    Задание 12: Поиск Элемента по Значению
//    Создай словарь, где ключами будут пары чисел.
//    Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val mapTask12 = mapOf(
        Pair(1, 1) to "sdfsd",
        Pair(2, 3) to "sdfsdf",
        Pair(5, 4) to "bingo 5 4",
        Pair(4, 5) to "bingo 4 5",
        Pair(5, 5) to "bingo 5 5"
    )
    println("mapTask12 $mapTask12")
    for (elem in mapTask12) {
        if (elem.key.first == 5 || elem.key.second == 5) {
            println(elem.value)
        }
    }
    println()

//    Задание 6: Словарь Библиотека
//    Ключи - автор книги, значения - список книг
    val mapExtTask6 = mutableMapOf<String, List<String>>()

//    Задание 12: Справочник Растений
//    Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val mapExtTask12 = mapOf<String, List<String>>()

//    Задание 8: Четвертьфинала
//    Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val mapExtTask8 = mapOf<String, List<String>>()

//    Задание 9: Курс лечения
//    Ключи - даты, значения - список препаратов принимаемых в дату
    val mapExtTask9 = mapOf<String, MutableList<String>>()

//    Задание 10: Словарь Путешественника
//    Ключи - страны, значения - словари из городов со списком интересных мест.
    val mapExtTask10 = mutableMapOf<String, List<String>>()
}