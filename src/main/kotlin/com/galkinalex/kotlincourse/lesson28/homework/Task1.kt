package com.galkinalex.kotlincourse.lesson28.homework

import java.io.File

//Задача 1
//Создайте текстовый файл workspace/task1/example.txt
//запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.

fun main() {
    val file = File("src/main/kotlin/com/galkinalex/kotlincourse/lesson28/homework/task1/example.txt")
    file.parentFile.mkdirs()
    val isNewFileCreated: Boolean = file.createNewFile()
    if (isNewFileCreated) {
        println("Файл был создан")
    } else {
        println("Файл уже существует")
    }
    println("writeText")
    file.writeText("Hello, Kotlin!")

    if (file.exists()) {
        println("Файл существует")
    } else {
        println("Файл не найден")
    }
}