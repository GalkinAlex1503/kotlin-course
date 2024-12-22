package com.galkinalex.kotlincourse.lesson15.homework

//Класс Shelf (Полка Стеллажа)
//Характеристики:
//Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
//Список предметов (items): хранит названия предметов на полке.
//Методы:
//Добавление Предмета (addItem):
//Принимает название предмета.
//Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
//Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.
//
//Удаление Предмета (removeItem):
//Принимает название предмета.
//Удаляет предмет, если он найден на полке.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.
//
//Проверка Вместимости (canAccommodate):
//Принимает название предмета.
//Определяет, вместится ли предмет на полку.
//Возвращает true, если предмет вместится, и false, если места недостаточно.
//
//Проверка наличия предмета:
//Принимает название предмета
//Возвращает true если такой предмет есть
//
//Получение списка предметов:
//Возвращает неизменяемый список предметов


class Shelf(
    val capacity: Int,
    val items: MutableList<String>
) {
    fun addItem(nameItem: String): Boolean {
        return if (this.canAccommodate(nameItem)) {
            this.items.add(nameItem)
            true
        } else false
    }

    fun removeItem(nameItem: String): Boolean {
        return if (this.items.contains(nameItem)) {
            this.items.remove(nameItem)
            true
        } else false
    }

    fun canAccommodate(nameItem: String): Boolean {
        return this.items.sumOf { it.length } + nameItem.length <= this.capacity
    }

    fun isItemExists(nameItem: String): Boolean {
        return this.items.contains(nameItem)
    }

    fun getItemsList(): List<String> {
        return this.items.toList()
    }
}