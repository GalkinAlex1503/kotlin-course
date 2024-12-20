package com.galkinalex.kotlincourse.lesson30.homework.task2ext

//Напиши функцию, которая определит, какой тип кофе предложить посетителю исходя из его функциональной принадлежности.
//Эспрессо - СТО или тимлид
//Латте - дизы и геймдев
//Капучино - Менеджеры
//Американо - бэкендеры и сисадмины
//Для QA добавь в enum ещё один вид напитка: Nescafe classic
//Реши задачу через доработку enum CharacterTypes

fun chooseCoffee(client: CharacterTypes): CoffeeType {
    return client.favoriteCoffee
}

fun main() {
    val semen = CharacterTypes.CTO
    println("For ${semen.name} i offer ${chooseCoffee(semen).coffeeBase}")

    val juliya = CharacterTypes.QA
    println("For ${juliya.name} i offer ${chooseCoffee(juliya).coffeeBase}")

}