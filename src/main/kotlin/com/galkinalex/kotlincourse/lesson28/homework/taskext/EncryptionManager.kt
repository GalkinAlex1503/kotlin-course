package com.galkinalex.kotlincourse.lesson28.homework.taskext

import java.io.File

class EncryptionManager(
    private val fileProcessor: FileProcessor,
    private val encryptor: Encryptor
) {
    fun encryptFilesInDirectory(directory: File, backupDir: File, extension: String) {
        require(extension.isNotBlank() && backupDir.path.isNotBlank() && directory.path.isNotBlank())

        val files = fileProcessor.findFilesByExtension(extension, directory)

        fileProcessor.encryptFiles(files, encryptor)
        fileProcessor.moveToBackup(files, directory, backupDir)
    }
}