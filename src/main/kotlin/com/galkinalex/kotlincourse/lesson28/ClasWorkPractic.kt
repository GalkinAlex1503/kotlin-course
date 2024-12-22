package com.galkinalex.kotlincourse.lesson28

import java.io.File

fun main() {
    val data = mapOf("one" to 1.0, "two" to 2.0)
    writeDataToFile(data, "test/text.txt")
    println(readFiletoMap("test/text.txt"))
}

fun createFileOrDirectory(path: String) {
    File(path).apply {
        if (path.endsWith("/")) {
            mkdirs()
        } else {
            parentFile.mkdirs()
            createNewFile()
        }
    }
}

fun writeDataToFile(data: Map<String, Double>, path: String) {
    val txt = data.map { "${it.key}=${it.value}" }.joinToString("\n")
    createFileOrDirectory(path)
    File(path).writeText(txt)
}

fun readFiletoMap(path: String): Map<String, Double> {
    val txt = File(path).readLines()
    return txt.associate {
        val str = it.split("=")
        str[0] to str[1].toDouble()
    }
}