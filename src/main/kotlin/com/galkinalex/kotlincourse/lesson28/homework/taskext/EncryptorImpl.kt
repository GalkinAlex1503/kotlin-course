package com.galkinalex.kotlincourse.lesson28.homework.taskext

class EncryptorImpl(
    private val encKey: Int
) : Encryptor {
    override fun encrypt(content: String): String {
        return content.map { it + encKey }.joinToString("")
    }
}