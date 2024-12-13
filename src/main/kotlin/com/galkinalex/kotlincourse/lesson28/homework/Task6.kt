package com.galkinalex.kotlincourse.lesson28.homework

import java.io.File

//Задача 6
//Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути директорий, а потом пути файлов
fun main() {
    val workspace = File(ConstHomeWork28.WORKSPACE)

    val files: Array<File>? = workspace.listFiles()
    println("directories")
    files?.forEach {  checkFiles(it , false) }
    println("files")
    files?.forEach {  checkFiles(it , true) }

}

fun checkFiles(files: File , showFile: Boolean) {
    val files: Array<File>? = files.listFiles()
    files?.forEach {
        if (it.isFile) {
            if (showFile) {
                println(it)
            }
        } else {
            if (!showFile) {
                println(it)
            }
            checkFiles(it, showFile)
        }
    }
}