package com.galkinalex.kotlincourse.lesson27.homework

fun main() {
//    Задание 2: Использование apply для инициализации объекта Employee
    val galkinAlex = Employee(
        "Alex",
        18,
        "seller"
    )
    galkinAlex.apply {
        if (email.isBlank()) {
            email = "${name.lowercase()}@mail.com"
        }
        if (department.isBlank()) {
            department = "it"
        }
    }
//    Задание 3: Использование also для логирования
    val log: (Person) -> Unit = { persona ->
        println("name: ${persona.name}")
        println("age:  ${persona.age}")
        println("email:  ${persona.email}")
    }

    val sam = Person(
        "Sam",
        30
    )

    sam.also(log)

//    Задание 4: Использование with для преобразование Person в Employee
    val bob = Person(
        "Bob",
        25
    )
    val bobManager = with(bob) {
        Employee(
            name,
            age,
            "manager"
        )
    }
//    Задание 5: Использование run для преобразования и инициализации Employee
    val john = Person(
        "John",
        27
    )
    val johnGuard = john.run {
        Employee(
            name,
            age,
            "security"
        )
    }

    johnGuard.apply {
        if (email.isBlank()) {
            email = "${name.lowercase()}@mail.com"
        }
        if (department.isBlank()) {
            department = "it"
        }
    }

//    Задание 6: Использование let для безопасного преобразования Person в Employee
    val hiring: (Person?) -> Employee? = { pers ->
        pers?.let {
            Employee (
                pers.name,
                pers.age,
                position = "it"
            )
        }
    }

    val andy = Person(
        "Andy",
        50
    )
    val andyBoss  = hiring(andy)
}