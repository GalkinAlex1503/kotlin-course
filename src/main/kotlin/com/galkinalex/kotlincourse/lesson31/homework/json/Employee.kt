package com.galkinalex.kotlincourse.lesson31.homework.json

import com.galkinalex.kotlincourse.lesson30.homework.task2ext.CharacterTypes

//Создай дата класс сотрудника компании Employee, содержащий:
//имя
//статус трудоустройства (булево)
//дата рождения (строка)
//должность CharacterTypes (enum из прошлого урока)
//список подчинённых с типом Employee

data class Employee(
    val name: String,
    val employmentStatus: Boolean,
    val birthDay: String,
    val characterTypes: CharacterTypes,
    val employList: List<Employee>?
)
