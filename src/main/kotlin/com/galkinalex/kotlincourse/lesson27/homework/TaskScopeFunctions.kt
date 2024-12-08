package com.galkinalex.kotlincourse.lesson27.homework

fun main() {
//    Задание 2: Использование apply для инициализации объекта Employee
    val galkinAlex = Employee(
        "Alex",
        18,
        "seller"
    )
    galkinAlex.apply {
        if(email.isBlank()) {
            email = "${name.lowercase()}@mail.com"
        }
    }
//    Задание 3: Использование also для логирования
//    Задание 4: Использование with для преобразование Person в Employee
    val newPerson = Person(
        "Bob",
        25
    )
    val newPersonEmpl = with(newPerson) {
        val newPersonEmployee = Employee (
            newPerson.name,
            newPerson.age,
            "manager"
        )
        newPersonEmployee
    }
//    Задание 5: Использование run для преобразования и инициализации Employee
//    Задание 6: Использование let для безопасного преобразования Person в Employee
}