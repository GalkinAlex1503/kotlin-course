package com.galkinalex.kotlincourse.lesson14

fun main() {

    println("Task 1")
    //    Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val mapTask1 = mapOf("test1" to 13, "test2" to 26, "test3" to 5)
    println(" average time = ${mapTask1.map { it.value }.average()} ")
    println()

    println("Task 2")
//    Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными.
//    Выведите список всех тестовых методов.
    val mapTask2 = mapOf("test1" to "sdfsds", "test2" to "sdfsfghfg", "test3" to "erwerwer")
    mapTask2.forEach { println(" name test = ${it.key}") }
    println()

    println("Task 3")
//    В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val mapTask3 = mutableMapOf("test1" to "sdfsds", "test2" to "sdfsfghfg", "test3" to "erwerwer")
    mapTask3["testNew"] = "dfgdfgd"
    println(mapTask3)
    println()

    println("Task 4")
//    Посчитайте количество успешных тестов в словаре с результатами.
    val mapTask4 = mutableMapOf("test1" to true, "test2" to true, "test3" to false)
    println(" Test passed ${mapTask4.filterValues { it }.count()}")
    println()

    println("Task 5")
//    Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
    val mapTask5 = mutableMapOf("test1" to "sdfsds", "test2" to "sdfsfghfg", "test3" to "erwerwer")
    mapTask5.remove("test2")
    println("new bug's list $mapTask5")
    println()

    println("Task 6")
//    Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
//    выведите сообщение о странице и статусе её проверки.
    val mapTask6 = mutableMapOf("test1.com" to 200, "test2.io" to 200, "test3.ru" to 404)
    for (elem in mapTask6) {
        println("site ${elem.key}  response ${elem.value}")
    }
    println()

    println("Task 7")
//    Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val mapTask7 = mutableMapOf("test1.com" to 15, "test2.io" to 16, "test3.ru" to 400)
    mapTask7.filterValues { it > 50 }.forEach { println("services with time out ${it.key} delay ${it.value}") }
    println()

    println("Task 8")
//    В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
//    Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val mapTask8 = mutableMapOf("users" to "alex", "doOrder" to "ok", "listProducts" to "khkhkjhkj")
    println("test ${"users"} - response ${mapTask8.getOrElse("users") { "test not pass" }}")
    println("test ${"removeOrder"} - response ${mapTask8.getOrElse("removeOrder") { "test not pass" }}")
    println()

    println("Task 9")
//    Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
//    получите значение для "browserType". Ответ не может быть null.
    val mapTask9 = mutableMapOf("browserType" to "IE", "homeDir" to "./", "user" to "alex")
    println("value for ${"browserType"}  is ${mapTask9.getOrDefault("browserType", "empty")}")
    println()

    println("Task 10")
//    Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
    val mapTask10 = mapOf("IE" to "1.2", "Chrome" to "2.3e", "Mazila" to "1.3lts")
    val mapTask10Result = mapTask10 + ("Safari" to "2.new")
    println(mapTask10Result)
    println()

    println("Task 11")
//    Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
//    получите настройки для конкретной модели или верните настройки по умолчанию.
    val mapTask11 = mapOf("iphone" to "fsgd", "Samsung" to "sdfsdf", "xiomi" to "sdfsdf")
    println(" for ${"pixel"} -  ${mapTask11.getOrDefault("pixel", "new one")}")
    println()

    println("Task 12")
//    Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
    val mapTask12 = mapOf(200 to "ok", 4004 to "not ok", 500 to "all bad")
    println("  code ${"200"}  ${if (mapTask12.containsKey(200)) " in map" else "not in map"}")

    println("Task 13")
//    Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
//    а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии,
//    идентификаторы которых соответствуют определённой версии тестов.
    val mapTask13 = mapOf("Test1_3" to "Passed", "Test2_1" to "Failed", "Test2_3" to "Skipped")
    val validVersia = "3"
    println(mapTask13.filterKeys { it.split("_")[1] == validVersia })
    println()

    println("Task 14")
//    У вас есть словарь, где ключи — это названия функциональных модулей приложения,
//    а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val mapTask14 = mapOf("TestMod1" to "Passed", "TestMod2" to "Failed", "TestMod3" to "Skipped")
    println(" ${if (mapTask14.containsValue("Failed")) "tests failed" else "all tests pass"} ")
    println()

    println("Task 15")
//    Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val mapTask15 = mutableMapOf("browserType1" to "IE", "homeDir1" to "./", "user1" to "alex")
    mapTask15.putAll(mapTask9)
    println(mapTask15)
    println()

    println("Task 16")
//    Объедините два неизменяемых словаря с данными о багах.
    val mapTask16 = mapTask10 + mapTask11
    println(mapTask16)
    println()

    println("Task 17")
//    Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    mapTask15.clear()
    println()

    println("Task 18")
//    Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
    val mapTask18 = mapOf("Test1_3" to "Passed", "Test2_1" to "Failed", "Test2_3" to "Skipped")
    println(mapTask18.filterValues { it != "Skipped" })
    println()

    println("Task 19")
//    Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
    val mapTask19 = mutableMapOf("test1" to "sdfsds", "test2" to "sdfsfghfg", "test3" to "erwerwer")
    mapTask19.remove("test1")
    println(mapTask19)
    println()

    println("Task 20")
//    Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат)
//    в список строк формата "Test ID: результат".
    val mapTask20 = mutableMapOf("test1" to "sdfsds", "test2" to "sdfsfghfg", "test3" to "erwerwer")
    println(mapTask20.map { "Test ${it.key}: ${it.value}" })
    println()

    println("Task 21")
//    Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val mapTask21 = mutableMapOf("test1" to "sdfsds", "test2" to "sdfsfghfg", "test3" to "erwerwer")
    val mapTask21Result = mapTask21.toMap()
    println(mapTask21Result)
    println()

    println("Task 22")
//    Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
//    заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод, например getNameById(id: String))
    println()

    println("Task 23")
//    Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val mapTask23 = mutableMapOf("test1.com" to 15.0, "test2.io" to 16.0, "test3.ru" to 400.0)
    println(mapTask23.mapValues { it.value * 1.1 })
    println()

    println("Task 24")
//    Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val mapTask24 = mutableMapOf("test1" to "sdfsds", "test2" to "sdfsfghfg", "test3" to "erwerwer")
    println(mapTask24.isEmpty())
    println()

    println("Task 25")
//    Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val mapTask25 = mutableMapOf("test1" to "sdfsds", "test2" to "sdfsfghfg", "test3" to "erwerwer")
    println(mapTask25.isNotEmpty())
    println()

    println("Task 26")
//    Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val mapTask26 = mapOf("Test1_3" to "Passed", "Test2_1" to "Failed", "Test2_3" to "Skipped")
    println(mapTask26.all { it.value == "Passed"})
    println()

    println("Task 27")
//    Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val mapTask27 = mapOf("Test1_3" to "Passed", "Test2_1" to "Failed", "Test2_3" to "Skipped")
    println(mapTask27.any { it.value == "Failed"})
    println()

    println("Task 28")
//    Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val mapTask28 = mapOf("Test1_3" to "Passed", "optional2_1" to "Failed", "Test2_3" to "Skipped")
    println(mapTask28.filter { it.value == "Failed" && it.key.contains("optional") })
}

