package com.galkinalex.kotlincourse.lesson28.homework.taskext

import java.io.File

class FileProcessorImpl : FileProcessor {
    override fun findFilesByExtension(extension: String, directory: File): List<File> {
        return directory.walk().filter { it.isFile && it.extension == extension }.map { it.absoluteFile }.toList()
    }

    override fun encryptFiles(files: List<File>, encryptor: Encryptor) {
        files.forEach {
            val text = it.readText()
            val encText = encryptor.encrypt(text)
            val destination = "${it.path}.enc"
            File(destination).apply {
                createNewFile()
                writeText(encText)
            }
        }

    }

    override fun moveToBackup(files: List<File>, baseDir: File, backupDir: File) {
        val absoluteBasePath = baseDir.absoluteFile
        files.forEach {
            backupDir.absoluteFile.apply {
                val relativeDir = it.relativeTo(absoluteBasePath)
                val destination = "${path}/${relativeDir.path}"
                it.copyTo(File(destination))
                it.delete()
            }

        }

    }
}