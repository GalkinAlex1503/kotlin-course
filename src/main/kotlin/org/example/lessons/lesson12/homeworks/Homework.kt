package org.example.org.example.lessons.lesson12.homeworks

fun main() {
    val list1 = listOf<Int>()
    println("$list1 -> ${analize(list1)}")
    val list2 = listOf(1, 2, 3, 4)
    println("$list2 -> ${analize(list2)}")
    val list3 = listOf(0, 1, 2, 3, 4, 5, 6)
    println("$list3 -> ${analize(list3)}")
    val list4 = listOf(1, 2, 3, 4, 5, 10000)
    println("$list4 -> ${analize(list4)}")
    val list5 = listOf(10, 10, 10, 10, 10, 10, 10)
    println("$list5 -> ${analize(list5)}")
    val list6 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println("$list6 -> ${analize(list6)}")
    val list7 = listOf(-101, -500, -30, -11, -12)
    println("$list7 -> ${analize(list7)}")
    val list8 = listOf(1001, 1002, 1003, 1004, 1005, 1006)
    println("$list8 -> ${analize(list8)}")
    val list9 = listOf(1, 2, 3, 14, 5)
    println("$list9 -> ${analize(list9)}")
    val list10 = listOf(1, 2, 3, 4, 5, 5, 6, 7, 8, 8)
    println("$list10 -> ${analize(list10)}")
    println()

    println("Задание 3: ")
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(grades.filter { it >= 60 }.sorted().take(3))
    println()

    println("Задание 4:")
    val listTask4 = listOf(
        "Стол",
        "табурет",
        "ваза",
        "Кружка",
        "Зеркало",
        "ковер",
        "Шкаф",
        "часы",
        "Люстра",
        "подушка",
        "Картина",
        "столик",
        "Вазон",
        "шторы",
        "Пуф",
        "книга",
        "Фоторамка",
        "светильник",
        "Коврик",
        "вешалка",
        "Подставка",
        "телевизор",
        "Комод",
        "полка",
        "Абажур",
        "диван",
        "Кресло",
        "занавеска",
        "Бра",
        "пепельница",
        "Глобус",
        "статуэтка",
        "Поднос",
        "фигурка",
        "Ключница",
        "плед",
        "Тумба",
        "игрушка",
        "Настенные часы",
        "подсвечник",
        "Журнальный столик",
        "сувенир",
        "Корзина для белья",
        "посуда",
        "Настольная лампа",
        "торшер",
        "Этажерка"
    )
    println(listTask4.map { it.lowercase() }.groupBy { it[0] })
    println()

    println("Задание 5:")
    println(String.format("%.2f", listTask4.map { it.length }.average()))
    println()

    println("Задание 6:")
    val listTask6 = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(listTask6.distinct().sortedDescending().groupBy { if (it % 2 == 0) "чет" else "нечет" })
    println()

    println()
    println("Задание 7:")
    val listTask7 = listOf(22, 18, 30, 45, 17, null, 60)
    println(listTask7.filterNotNull().firstOrNull { it > 18 } ?: "Подходящий возраст не найден")
}

fun analize(list: List<Int>): String {
    return when {
        list.isEmpty() -> "Пусто"
        list.size < 5 -> "Короткая"
        list[0] == 0 -> "Стартовая"
        list.sum() > 10000 -> "Массивная"
        list.average() == 10.0 -> "Сбалансированная"
        list.joinToString("").length == 20 -> "Клейкая"
        list.max() < -10 -> "Отрицательная"
        list.min() > 1000 -> "Положительная"
        list.contains(3) && list.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}