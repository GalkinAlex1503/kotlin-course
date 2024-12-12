package com.galkinalex.kotlincourse.lesson28.homework

import java.io.File

//Задача 2
//Создайте директорию workspace/task2/testDir
//проверьте, является ли она директорией, и выведите её абсолютный путь.
fun main() {
    val file = File("src/main/kotlin/com/galkinalex/kotlincourse/lesson28/homework/task2/testDir")
    file.mkdirs()
    if (file.isDirectory) {
        println(file.absoluteFile)
    }
}