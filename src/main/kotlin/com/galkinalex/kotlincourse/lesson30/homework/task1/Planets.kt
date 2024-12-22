package com.galkinalex.kotlincourse.lesson30.homework.task1

//Создай Enum с планетами солнечной системы, включая расстояние до солнца
// в астрономических единицах и вес планеты.

enum class Planets(
    val distance: Double
) {
    MERCURY(0.39),
    VENUS(0.72),
    EARTH(1.0),
    MARS(1.52),
    JUPITER(5.2),
    SATURN(9.58),
    URANUS(19.22),
    NEPTUNE(30.05),
    ;
}