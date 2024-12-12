package com.galkinalex.kotlincourse.lesson28.homework

import java.io.File

//Задача 3
//Создайте директорию workspace/task3/structure.
//Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и subDir2.
// Проверьте, что myDir действительно содержит эти поддиректории.
fun main() {
    val structure = File(ConstHomeWork28.WORKSPACE + "task3/structure")
    structure.mkdirs()
    println(structure.path)
    val subDir1 = File(structure.path + "/subDir1")
    val subDir2 = File(structure.path + "/subDir2")
    subDir1.mkdir()
    subDir2.mkdir()
    println(subDir1.path + " " + subDir2.path)
}