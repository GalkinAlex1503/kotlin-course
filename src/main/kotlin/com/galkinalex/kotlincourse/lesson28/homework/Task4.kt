package com.galkinalex.kotlincourse.lesson28.homework

import java.io.File

//Задача 4
//Создайте директорию workspace/task4/temp.
//Внутри директории temp создайте несколько вложенных файлов и директорий.
//Удалите директорию workspace/task4 со всем содержимым

fun main() {
    val file = File(ConstHomeWork28.WORKSPACE + "/task4/temp")
    file.mkdirs()
    println("create files system")
    for (i in 1..5) {
        val tempDir = File(file.path).resolve(i.toString())
        tempDir.mkdirs()
        for (j in 1..3) {
            val tempFile = File(tempDir.path).resolve("$j.txt")
            tempFile.createNewFile()
        }
    }

    println("delete files system ${file.path}")
    file.parentFile.deleteRecursively()
}