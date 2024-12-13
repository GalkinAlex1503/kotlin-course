package com.galkinalex.kotlincourse.lesson28.homework

import java.io.File

//Создайте директорию workspace/task9/docs.
//Проверь, есть ли файл с именем readme.md. Если файла нет, создайте его и запишите текст "This is a README file."

fun main() {
    val file = File(ConstHomeWork28.WORKSPACE + "/task7/docs")
    file.mkdirs()

    val fileReadMe = File(file.path + "/readme.md")
    if (fileReadMe.exists()) {
        println("the file exists")
    } else {
        fileReadMe.createNewFile()
        fileReadMe.writeText("This is a README file.")
    }
}