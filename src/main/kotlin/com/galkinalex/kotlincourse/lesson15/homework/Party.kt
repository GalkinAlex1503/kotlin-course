package com.galkinalex.kotlincourse.lesson15.homework

//Событие: Вечеринка Создайте класс Party, который описывает вечеринку.
// У него должны быть свойства location (String) и attendees (Int).
// Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.

class Party(
    val location: String,
    val attendees: Int
) {
    fun details() {
        println("Party star in $location, and number of guests is $attendees")
    }

}