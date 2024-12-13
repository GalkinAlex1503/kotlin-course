package com.galkinalex.kotlincourse.lesson28.homework

import java.io.File

//Создайте файлы
//workspace/task10/data/1/4/prod/data14.mysql
//workspace/task10/data/2/3/prod/data23.mysql
//workspace/task10/data/5/2/prod/data52.mysql
//Создайте директорию workspace/task10/backup и скопируйте туда файлы из workspace/task10/data
// сохраняя структуру директорий. Для копирования используй метод copyTo

fun main() {
    val data14 = File(ConstHomeWork28.WORKSPACE + "/task8/data/1/4/prod/data14.mysql")
    val data23 = File(ConstHomeWork28.WORKSPACE + "/task8/data/2/3/prod/data23.mysql")
    val data52 = File(ConstHomeWork28.WORKSPACE + "/task8/data/5/2/prod/data52.mysql")
    data14.parentFile.mkdirs()
    data14.createNewFile()
    data14.writeText("select * from data14")
    data23.parentFile.mkdirs()
    data23.createNewFile()
    data23.writeText("select * from data23")
    data52.parentFile.mkdirs()
    data52.createNewFile()
    data52.writeText("select * from data52")

    val backup = File(ConstHomeWork28.WORKSPACE + "/task8/backup")
    backup.mkdirs()


    val revativeData14 = data14.toRelativeString(File(ConstHomeWork28.WORKSPACE + "/task8/data"))
    val backupdata14 = backup.resolve(revativeData14)
    backupdata14.parentFile.mkdirs()
    data14.copyTo(backupdata14)

    val revativeData23 = data23.toRelativeString(File(ConstHomeWork28.WORKSPACE + "/task8/data"))
    val backupdata23 = backup.resolve(revativeData23)
    backupdata23.parentFile.mkdirs()
    data23.copyTo(backupdata23)

    val revativeData52 = data52.toRelativeString(File(ConstHomeWork28.WORKSPACE + "/task8/data"))
    val backupdata52 = backup.resolve(revativeData52)
    backupdata52.parentFile.mkdirs()
    data52.copyTo(backupdata52)
}

