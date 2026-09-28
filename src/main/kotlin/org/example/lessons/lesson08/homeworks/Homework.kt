package org.example.org.example.lessons.lesson08.homeworks

fun main() {

    println("Я не уверен в успехе этого проекта- > ${transform("Я не уверен в успехе этого проекта")}")
    println("Я не уверен в успехе этого проекта - > ${transform("Я не уверен в успехе этого проекта")}")
    println("Произошла катастрофа на сервере - > ${transform("Произошла катастрофа на сервере")}")
    println("Этот код работает без проблем - > ${transform("Этот код работает без проблем")}")
    println("Удача - > ${transform("Удача")}")
    println()


    getLogDate("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    println()


    println(maskNumber("4539 1488 0343 6467"))
    println()


    println(transformEMail("username@example.com"))
    println()


    println(getFileName("C:/Пользователи/Документы/report.txt"))
    println()


    println(makeAbbreviation("Объектно-ориентированное программирование"))
    println()


    println(formatString("можно использовать такой же подход как в задании 5, но накапливать не первые буквы а целиком слова составленные из первой буквы с uppercase и оставшейся части слова"))
    println()


    println(encrypt("Kotlin"))
    println(dencrypt("oKltni"))
    println()

    //    Таблица умножения
    println(createTable(5, 4))


}

fun transform(txt: String): String {
    var res: String = transformRule1(txt)
    res = transformRule2(res)
    res = transformRule3(res)
    res = transformRule4(res)
    res = transformRule5(res)
    return res
}

fun transformRule1(txt: String): String {
    return txt.replace("невозможно".lowercase(), "совершенно точно возможно, просто требует времени")
}

fun transformRule2(txt: String): String {
    return if (txt.startsWith("Я не уверен")) "$txt, но моя интуиция говорит об обратном"
    else txt
}

fun transformRule3(txt: String): String {
    return txt.replace("катастрофа".lowercase(), "интересное событие")
}

fun transformRule4(txt: String): String {
    return if (txt.endsWith("без проблем")) txt.replace("без проблем", "с парой интересных вызовов на пути")
    else txt
}

fun transformRule5(txt: String): String {
    return if (!txt.contains(" ")) "Иногда, $txt , но не всегда"
    else txt
}

fun getLogDate(txt: String) {
    val listTxt = txt.split("->")
    val dateBlock = listTxt[1].trim().split(" ")
    println("${dateBlock[0]} ${dateBlock[1]}")
}

fun maskNumber(txt: String): String {
    return "**** **** **** ${txt.substring(15)}"
}

fun transformEMail(txt: String): String {
    return "${txt.split("@")[0]} [at] ${txt.split("@")[1].split(".")[0]} [dot] ${txt.split("@")[1].split(".")[1]}"
}

fun getFileName(txt: String): String {
    return txt.reversed().split("/")[0].reversed()
}

fun makeAbbreviation(txt: String): String {
    if (txt.isEmpty()) return txt
    if (!txt.contains(" ")) return txt[0].uppercase()

    var result = ""
    for (word in txt.split(" ", "-")) result += word[0].uppercase()

    return result
}

fun formatString(txt: String): String {
    var result = ""
    for (elem in txt.split(" ")) result += "${elem[0].uppercase()}${elem.substring(1)} "

    return result.trim()
}

fun encrypt(txt: String): String {
    var result = ""

    for (elem in (if (txt.length % 2 == 1) "$txt " else txt).chunked(2)) {
        result += elem.reversed()
    }
    return result
}

fun dencrypt(txt: String): String {
    var result = ""

    for (elem in txt.chunked(2)) {
        result += elem.reversed()
    }
    return result
}

fun createTable(x: Int, y: Int): String {
    var result = ""
    val lengthCell = (x * y).toString().length

    for (i in 0..x) {
        for (j in 0..y) {
            if (i == 0 && j == 0) {
                result += "${fillCell(lengthCell, 1)} "
                continue
            } else if (i == 0) {
                result += "${fillCell(lengthCell, j)}$j"
                continue
            } else if (j == 0) {
                result += "${fillCell(lengthCell, j)}$i"
                continue
            }

            result += "${fillCell(lengthCell, i * j)}${i * j}"
        }
        result += "\n"
    }
    return result
}

fun fillCell(lf: Int, cellValue: Int): String {
    var result = ""
    for (i in 0..(lf - cellValue.toString().length)) {
        result += " "
    }
    return result
}