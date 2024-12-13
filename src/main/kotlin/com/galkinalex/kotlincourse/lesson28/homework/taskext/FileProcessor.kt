package com.galkinalex.kotlincourse.lesson28.homework.taskext

import java.io.File

interface FileProcessor {
    fun findFilesByExtension(extension: String, directory: File): List<File>
    fun encryptFiles(files: List<File>, encryptor: Encryptor)
    fun moveToBackup(files: List<File>, baseDir: File ,backupDir: File)
}