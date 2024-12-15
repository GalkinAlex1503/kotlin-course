package com.galkinalex.kotlincourse.lesson29.homework


import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

private val boomerFromDate = LocalDate.of(1945, 12, 31)
private val boomerEndDate = LocalDate.of(1965, 1, 1)
private val zoomerStartDate = LocalDate.of(1996, 12, 31)
private val zoomerEndDate = LocalDate.of(2013, 1, 1)

fun main() {
    //    1. Создай текущую временнУю метку и выведи её на печать (чтобы ещё раз запомнить название этого класса)
    val curTimeInst = Instant.now()
    println(curTimeInst.toEpochMilli())

    //    2. Создай дату своего дня рождения.
    val myBirthday = LocalDate.of(1978, 3, 15)
    println(myBirthday)

    //    3. Создай период между датой своего рождения и текущей датой.
    //    Выведи на печать количество лет из этого периода.
    val periodFromMyBirthdayToNow = Period.between(myBirthday, LocalDate.now())
    println(periodFromMyBirthdayToNow.years)

    //     5. Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше.
    //     Не используй в них метод now()
    val task5LocalDate = LocalDate.of(2024, 12, 15)
    val task5LocalTime = LocalTime.of(20, 12, 15)
    val task5LocalDateTime = LocalDateTime.of(2024, 12, 15, 20, 20, 20)
    val task5ZonedDateTime = ZonedDateTime.of(2024, 2, 26, 10, 0, 0, 0, ZoneId.of("Europe/Madrid"))
    val task5ZonedOffset = OffsetDateTime.of(2024, 2, 26, 10, 0, 0, 0, ZoneOffset.of("+03:00"))
    val task5Else = Instant.now()
    myFormatData(task5LocalDate)
    myFormatData(task5LocalTime)
    myFormatData(task5LocalDateTime)
    myFormatData(task5ZonedDateTime)
    myFormatData(task5ZonedOffset)
    myFormatData(task5Else)

    // 6.
    identifyGeneration(myBirthday)

    //    7. Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года.
    //    Создай форматтер, который форматирует дату в месяц и день.
    //    Выведи первую отформатированную дату, прибавив к ней 10 дней.
    //    Выведи вторую отформатированную дату, прибавив к ней 10 дней.
    //    Найди отличия)))
    val task7data1 = LocalDate.of(2023, 2, 25)
    val task7data2 = LocalDate.of(2024, 2, 25)
    val formaterTask7: (LocalDate) -> String = { it.format(DateTimeFormatter.ofPattern("MM-dd")) }
    println(formaterTask7(task7data1.plusDays(10)))
    println(formaterTask7(task7data2.plusDays(10)))
}

//    4. Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
//    содержит ли аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени.
//    В форматированном значении нужно выводить часы, минуты, секунды и таймзону,
//    если они представлены в переданном объекте. Обработай в методе все типы дат, которые знаешь.
//    Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.

fun myFormatData(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ofPattern("yyyy-dd-MM"))
        is LocalTime -> temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        is LocalDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss"))
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        else -> {
            temporal.toString()
        }
    }.also { println(it) }
}

fun isoFormatData(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_TIME)
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        else -> {
            temporal.toString()
        }
    }.also { println(it) }
}

//  6.Создайте функцию identifyGeneration, которая принимает дату рождения в формате LocalDate и печатает строку,
//  определяющую, к какому поколению принадлежит человек: "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
//  и "Зумер" для тех, кто родился с 1997 по 2012 год включительно.
//  Если дата рождения не попадает ни в один из этих диапазонов, функция должна возвращать "Не определено".
//  Для сравнения дат используй методы isAfter(otherDate) и isBefore(otherDate).
//  Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.

fun identifyGeneration(birthDay: LocalDate) {
    when {
        birthDay.isAfter(boomerFromDate) && birthDay.isBefore(boomerEndDate) -> "Бумер"
        birthDay.isAfter(zoomerStartDate) && birthDay.isBefore(zoomerEndDate) -> "Зумер"
        else -> "Не определено"
    }.also { println(it) }
}