package com.galkinalex.kotlincourse.lesson28.homework

import java.io.File

//Задача 5
//Создайте файл workspace/task5/config/config.txt
//запишите в него список параметров (в формате ключ=значение),
//а затем прочитайте файл и выведите только значения.

fun main() {
    val file = File(ConstHomeWork28.WORKSPACE + "/task5/config/config.txt")
    file.parentFile.mkdirs()
    file.createNewFile()

    val paramMap = mapOf(
        "key1" to "vol1",
        "key2" to "vol2",
        "key3" to "vol3"
    )
    file.writeText(paramMap.map { it.key + "=" + it.value }.joinToString("\n"))

    val txtList = file.readLines()
    val mapRead = txtList.associate {
        val str = it.split("=")
        str[0] to str[1]
    }
    mapRead.forEach { println(it.value) }
}