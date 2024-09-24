package com.galkinalex.kotlincourse.lesson6

import kotlin.math.round

fun main() {

    // Задание 1: "Определение Сезона"
    // Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
    println("Задание 1")
    println(getSeason(3))
    println(getSeason(12))
    println(getSeason(-1))
    println(getSeason(15))


    // Задание 2: "Расчет Возраста Питомца"
    // Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
    // До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
    println("Задание 2")
    println(calcDogAge(1))
    println(calcDogAge(5))
    println(-1)

    // Задание 3: "Определение Вида Транспорта"
    // Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать,
    // исходя из длины маршрута. Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
    println("Задание 3")
    println(calcTypeTransport(0.1))
    println(calcTypeTransport(2.0))
    println(calcTypeTransport(10.5))
    println(-1.0)

    // Задание 4: "Расчет Бонусных Баллов"
    // Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию,
    // которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей
    // при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.
    println("Задание 4")
    println(calsBonus(0.0))
    println(calsBonus(150.5))
    println(calsBonus(1505.0))
    println(-1.0)

    // Задание 5: "Определение Типа Документа"
    // Контекст: В системе хранения документов каждый файл имеет расширение.
    // Напишите функцию, которая на основе расширения файла возвращает
    // его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
    println("Задание 5")
    println(getTypeDocument("txt"))
    println(getTypeDocument("bmp"))
    println(getTypeDocument("doc"))

    //    Задание 6: "Конвертация Температуры"
    //    Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот
    //    в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции.
    //    Несколько аргументов передаются через запятую. Возвращать нужно строку.
    //    Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result C” для цельсия
    println("Задание 6")
    println(getTemperature(45, "C"))
    println(getTemperature(90, "F"))
    println(getTemperature(45, "E"))

    // Задание 7: "Подбор Одежды по Погоде"
    // Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип
    // одежды: "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и
    // "футболка и шорты" при температуре выше 15. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
    println("Задание 7")
    println(getClothes(0))
    println(getClothes(-10))
    println(getClothes(20))
    println(getClothes(45))

    // Задание 8: "Выбор Фильма по Возрасту"
    // Контекст: Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и
    // возвращает доступные для него категории фильмов: "детские", "подростковые", "18+".
    println("Задание 8")
    println(calcCategoryFilm(1))
    println(calcCategoryFilm(13))
    println(calcCategoryFilm(18))
    println(calcCategoryFilm(-1))

}

fun getSeason(numSeason: Int): String {
    return if (numSeason in 1..2 || numSeason == 12) {
        "Winter"
    } else if (numSeason in 3..5) {
        "Spring"
    } else if (numSeason in 6..8) {
        "Summer"
    } else if (numSeason in 9..11) {
        "Autumn"
    } else {
        "invalid number of months"
    }
}

fun calcDogAge(numAge: Int): Double {
    if (numAge < 0) throw Exception("Invalid age")

    return if (numAge in 0..2) {
        numAge * 10.5
    } else {
        numAge * 4.0
    }
}

fun calcTypeTransport(distance: Double): String {
    if (distance < 0) throw Exception("Invalid range")

    return if (distance < 1.0) {
        "пешком"
    } else if (distance < 5.0) {
        "велосипед"
    } else {
        "автотранспорт"
    }
}

fun calsBonus(sumPay: Double): Double {
    if (sumPay < 0) throw Exception("Invalid summa")

    return if (sumPay < 1000.0) {
        ((sumPay - (sumPay % 100)) / 100) * 2
    } else {
        ((sumPay - (sumPay % 100)) / 100) * 5
    }
}

fun getTypeDocument(extFile: String): String {
    return when (extFile) {
        "txt" -> "Текстовый документ"
        "bmp" -> "Изображение"
        "exl" -> "Таблица"
        else -> "Неизвестный тип"
    }
}

fun getTemperature(degrees: Int, typeTemperate: String): String {
    val convDegrees: Double
    if (typeTemperate != "C" && typeTemperate != "F") return "Invalid type of temperature"
    if (typeTemperate == "C") {
         convDegrees = (degrees * 1.8 ) + 32.0
        return  "$convDegrees F"
    } else {
        convDegrees = (degrees - 32.0 ) * 1.8
        return  "$convDegrees C"
    }

}

fun getClothes(degrees: Int): String {
    return if (degrees < -35 || degrees > 35) {
        "рекомендуйте не выходить из дома"
    } else if (degrees < 0) {
        "куртка и шапка"
    } else if (degrees in 0..15) {
        "ветровка"
    } else if (degrees > 15) {
        "футболка и шорты"
    } else "Invalid temperature"
}

fun calcCategoryFilm(age: Int): String {
    return when {
        age < 0 -> {
            "Invalid age"
        }
        age in 0..12 -> {
            "детские"
        }
        age in 13..17 -> {
            "детские и подростковые"
        }
        else -> {
            "детские и подростковые и 18+"
        }
    }
}