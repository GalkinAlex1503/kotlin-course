package org.example.org.example.lessons.lesson07.homeworks

//Задания для цикла for
//  Прямой диапазон
//Напишите цикл for, который выводит числа от 1 до 5.
//Напишите цикл for, который выводит четные числа от 1 до 10.
//  Обратный диапазон
//Создайте цикл for, который выводит числа от 5 до 1.
//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
//  С шагом (step)
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
//  Использование до (until)
//Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
//Задания для цикла while
//  Цикл while
//Создайте цикл while, который выводит квадраты чисел от 1 до 5.
//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
//  Цикл do while
//Используйте цикл do while, чтобы вывести числа от 5 до 1.
//Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
//Задания для прерывания и пропуска итерации
//  Использование break
//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
//  Использование continue
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
//Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
fun main() {
    //Задания для Цикла for
    println("Задания для Цикла for")
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

    //  Использование до (until)
    //Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.

    println("Использование До (until):")
    val size = 9
    for (i in 3 until size step 2) {
        println(i)
    }
    println("")


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


    println("Задания для Прерывания и Пропуска Итерации")
    println("Использование break:")
    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }
    println("")

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

}