package com.galkinalex.kotlincourse.lesson31.homework.json

import com.google.gson.GsonBuilder
import java.io.File

//Сериализуй CTO в текст с настройкой prettyPrinting
// и текст запиши в файл в корне проекта.
//
//Прочитай текст из файла, десериализуй его в объект класса Employee
// и распечатай в консоль.

fun main() {
    //Serialize
    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(sto)
    val fileName =
        "/home/galkin-alexandr/work/webrelab/kotlin-course/src/main/kotlin/com/galkinalex/kotlincourse/lesson31/homework/json/sto.txt"
    val fileDestination = File(fileName)
    fileDestination.createNewFile()
    fileDestination.writeText(json)

    //Deserialize
    val fileSource = File(fileName)
    val jsonNew = fileSource.readText()
    val stoNew: Employee = gson.fromJson(jsonNew, Employee::class.java)
    println(stoNew)

}