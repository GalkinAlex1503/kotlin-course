package com.galkinalex.kotlincourse.lesson8

fun main() {
    //    Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
    //    делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.
    //
    //    Правила Проверки и Преобразования:
    //    Если фраза содержит слово "невозможно":
    //    Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
    //    Если фраза начинается с "Я не уверен":
    //    Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
    //    Если фраза содержит слово "катастрофа":
    //    Преобразование: Замените "катастрофа" на "интересное событие".
    //    Если фраза заканчивается на "без проблем":
    //    Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
    //    Если фраза содержит только одно слово:
    //    Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

    println("Я не уверен в успехе этого проекта- > ${transform("Я не уверен в успехе этого проекта")}")
    println("Я не уверен в успехе этого проекта - > ${transform("Я не уверен в успехе этого проекта")}")
    println("Произошла катастрофа на сервере - > ${transform("Произошла катастрофа на сервере")}")
    println("Этот код работает без проблем - > ${transform("Этот код работает без проблем")}")
    println("Удача - > ${transform("Удача")}")
    println()

    //    Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
    //    Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
    //    Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.

    getLogDate("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    println()

    //    Задание 2: Маскирование Личных Данных
    //    Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
    //    Замаскируйте все цифры, кроме последних четырех, символами "*".

    println(maskNumber("4539 1488 0343 6467"))
    println()

    //    Задание 3: Форматирование Адреса Электронной Почты. Используй replace
    //    Описание: У вас есть электронный адрес "username@example.com".
    //    Преобразуйте его в строку "username [at] example [dot] com".

    println(transformEMail("username@example.com"))
    println()

    //    Задание 4: Извлечение Имени Файла из Пути
    //    Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.

    println(getFileName("C:/Пользователи/Документы/report.txt"))
    println()

    //    Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения.
    //    Используй for для перебора слов. Используй var переменную для накопления первых букв.
    //    Описание: У вас есть фраза, например "Объектно-ориентированное программирование".
    //    Создайте аббревиатуру из начальных букв слов (например, "ООП").

    println(makeAbbreviation("Объектно-ориентированное программирование"))
    println()

    //    Дополнительные задания
    //
    //    Написать метод, который преобразует строку из нескольких слов в строку,
    //    где каждое слово начинается с заглавной буквы а все остальные - строчные.
    //    (можно использовать такой же подход как в задании 5, но накапливать не первые буквы а целиком слова,
    //    составленные из первой буквы с uppercase и оставшейся части слова)

    println(formatString("можно использовать такой же подход как в задании 5, но накапливать не первые буквы а целиком слова составленные из первой буквы с uppercase и оставшейся части слова"))
    println()

    //    Написать шифратор/дешифратор для строки. Шифровка производится путём замены двух соседних букв между собой:
    //    Kotlin шифруется в oKltni. Дешифровка выполняется аналогично. Если длина строки - нечётная,
    //    в конец добавляется символ пробела до начала шифрования. Таким образом все шифрованные сообщения будут с чётной длинной.
    //    Должно получиться два публичных метода: encrypt() и decrypt() которые принимают и возвращают строку.

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