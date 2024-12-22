package com.galkinalex.kotlincourse.lesson7


fun main() {
    //Задания для Цикла for
    println("Задания для Цикла for")
    //Прямой Диапазон:
    println("Прямой Диапазон:")
    for (i in 1..5) {
        println(i)
    }
    println("")
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }
    println("")

    //Обратный Диапазон:
    println("Обратный Диапазон:")
    for (i in 5 downTo 1) {
        println(i)
    }
    println("")
    for (i in 10 downTo 1) {
        println(i - 2)
    }
    println("")

    //С Шагом (step):
    println("С Шагом (step):")
    for (i in 1..9 step 2) {
        println(i)
    }
    println("")

    for (i in 3..20 step 3) {
        println(i)
    }
    println("")

    //Использование До (until):
    println("Использование До (until):")
    for (i in 1 until 9) {
        println(i)
    }
    println("")

    for (i in 3 until 15) {
        println(i)
    }
    println("")

    //Задания для Цикла while
    //Цикл while:
    println("Задания для Цикла while")
    println("Цикл while:")
    var counter = 0
    while (counter++ < 5) {
        println(counter * counter)
    }
    println("")

    counter = 10
    while (counter >= 5) {
        println(counter)
        counter--
    }
    println("")

    println("Цикл do...while:")
    counter = 5
    do {
        println(counter)
    } while (counter-- > 1)
    println("")

    counter = 5
    do {
        println(counter)
    } while (counter++ < 10)
    println("")

    //Задания для Прерывания и Пропуска Итерации
    println("Задания для Прерывания и Пропуска Итерации")
    //Использование break:
    println("Использование break:")
    //Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }
    println("")

    //Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    counter = 1
    while (true) {
        if (counter == 10) {
            break
        }
        counter++
    }
    println("")

    //Использование continue:
    println("Использование continue:")
    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
    println("")

    counter = 0
    while (counter++ < 10) {
        if (counter % 3 == 0) {
            continue
        }
        println(counter)
    }
    println("")

    //Задача на вложенный цикл
    println("Задача на вложенный цикл")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println("")
    }
}