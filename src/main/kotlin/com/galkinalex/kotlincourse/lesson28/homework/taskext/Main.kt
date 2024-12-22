package com.galkinalex.kotlincourse.lesson28.homework.taskext

import com.galkinalex.kotlincourse.lesson28.homework.ConstHomeWork28
import java.io.File

fun main() {
    val workDir = File(ConstHomeWork28.WORKSPACE + "/taskext/data")
    val backDir = File(ConstHomeWork28.WORKSPACE + "/taskext/backup")

    val encryptorImpl = EncryptorImpl(5)
    val fileProcessorImpl = FileProcessorImpl()
    val encryptionManager = EncryptionManager(fileProcessorImpl, encryptorImpl)

    encryptionManager.encryptFilesInDirectory(workDir, backDir, "txt")

}