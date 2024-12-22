package com.galkinalex.kotlincourse.lesson24

fun main() {
    try {
        // Код, который может выбросить исключение
    } catch (e: Exception) {
        // Обработка конкретного типа исключения
    } catch (e: Exception) {
        // Обработка всех остальных исключений
    } finally {
        // Блок, который выполняется всегда, независимо от наличия исключения
    }


//    try {
//        // Код, который может выбросить исключения
//    } catch (e: Exception) {
//        when(e) {
//            is ExceptionA, is ExceptionB -> {
//                // Обработка исключений ExceptionA или ExceptionB
//                println("Обработано исключение типа A или B")
//            }
//            else -> throw e // Перебрасываем исключение дальше, если оно не соответствует обработанным типам
//        }
//    }


}