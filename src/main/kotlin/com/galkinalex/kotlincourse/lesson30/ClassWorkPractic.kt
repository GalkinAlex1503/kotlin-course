package com.galkinalex.kotlincourse.lesson30

import java.lang.IllegalArgumentException

enum class Seasons (
    val firstMonth: String,
    val isVolatileDuration: Boolean
) {
    WINTER("december", true),
    SPRING("march", false),
    SUMMER("june", false),
    AUTUMN("september", false),
    ;
    fun showInfo () {
        println("In $this ${if (isVolatileDuration) "not constant" else "constant"} numbers of days")
    }
    companion object {
        fun getMonth (month: String): Seasons {
            return entries.filter { it.firstMonth == month}.firstOrNull() ?: throw IllegalArgumentException("no seasons")
        }
    }
}

interface Hasvalue {
    val value: String
}

interface HasAction {
    fun action()
}

enum class HomeDevices(
    override val value: String
) :Hasvalue, HasAction {
    FRIDGE("fridger") {
        override fun action() {
            println("ffrrrrr")
        }
    },
    WASHER("washmashine") {
        override fun action() {
            println("whhhhhh")
        }
    },
    TV("tvset"),
    ;

    override fun action() {
        println("tvvvvvvvv $value")
    }
}


fun main() {
    Seasons.WINTER.showInfo()
    println(Seasons.getMonth("december") )
//    println(Seasons.getMonth("dfgdf") )


    HomeDevices.FRIDGE.action()
    HomeDevices.TV.action()

}

fun example(arg: Hasvalue) {
    arg.value
}

fun example2(arg: HasAction) {
    arg.action()
}
