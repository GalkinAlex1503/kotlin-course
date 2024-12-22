package com.galkinalex.kotlincourse.lesson30.homework.task1

//Создай Enum с типами жилой недвижимости для сайта аренды,
// включая человекопонятные названия этих типов.

enum class TypeRealEstate(
    val description: String
) {
    APARTMENT("Квартира"),
    HOUSE("Дом"),
    TOWNHOUSE("Таунхаус"),
    STUDIO("Студия"),
    LOFT("Лофт"),
    VILLA("Вилла"),
    COTTAGE("Коттедж"),
    PENTHOUSE("Пентхаус"),
    DUPLEX("Дуплекс"),
    ;
}