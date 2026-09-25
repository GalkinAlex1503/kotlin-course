package org.example.org.example.lessons.lesson07.homeworks

fun main() {
    //Задача на вложенный цикл
    println("Задача на вложенный цикл")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println("")
    }
}
