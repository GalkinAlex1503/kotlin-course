package com.galkinalex.kotlincourse.lesson17.homework
//Задание 1
//Потренируйся в создании иерархии классов с расширением базовой сущности.
//Для каждого задания опиши в коде базовый класс с базовыми свойствами и если применимо - методами.
// Для произвольных классов также добавь особенные свойства.
// Детально описывать не нужно, упражнение на то, чтобы усвоить иерархию наследования.
//
//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник, Круг
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник
//
// Учебные Заведения
//Базовый класс: Учебное Заведение
//Производные классы: Школа, …
//Дополнительное разветвление для …: …
//
// Иерархия Мебели
//Базовый класс: Мебель
//Производные классы: …
//Дополнительное разветвление для …: …
//
//
//Задание 2
//Это класс контейнера. Он абстрактный, это означает, что нельзя создавать экземлпяр этого класса, он нужен только для того, чтобы быть основой для подклассов.
//
//Создай подклассы этого контейнера, которые будут добавлять строку material в какое-то определённое место.
//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)
//Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными, которые уже есть. То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.
//Третий класс должен добавлять элементы в список в алфавитном порядке. Если мы добавляем новый элемент в список, то он должен встать где-то между другими элементами и занять место в соответствии с сортировкой по алфавиту.
//Четвёртый класс должен принимать словарь из строк (ключи и значения). Каждая пара ключа и значения должна попадать в контейнер следующим образом - ключ в начало, значение в конец.
//

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val ordinalNumbersSecond = listOf(
        "newfirst", "newsecond", "newthird", "newfourth", "newfifth",
        "newsixth", "newseventh", "neweighth", "newninth", "newtenth",
        "neweleventh", "newtwelfth", "newthirteenth"
    )

    val first = AddFirst()
    ordinalNumbers.forEach { first.addMaterial(it) }
    //   println(first.printContainer())
    first.addFirst("new")
    println("test 1 class")
    println(first.printContainer())
    first.extractMaterial()
    println()

    println("test 2 class")
    val second = TwoClass()
    ordinalNumbers.forEach { second.addMaterial(it) }
    second.mixTwoMethod(ordinalNumbersSecond)
    println(second.printContainer())
    second.extractMaterial()
    println()

    println("test 3 class")
    val third = ThirdClass()
    ordinalNumbers.forEach { third.addMaterial(it) }
    third.sortThirdMethod("newnewnew")
    println(third.printContainer())
    third.extractMaterial()
    println()

    println("test 4 class")
    val forth = ForthClass()
    val workMap = mapOf("1" to "one", "2" to "two", "2" to "three")
    forth.addForthMethod(workMap)
    println(forth.printContainer())
}

