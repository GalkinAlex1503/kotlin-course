package com.galkinalex.kotlincourse.lesson15.homework
//
//Класс Rack (Стеллаж)
//Характеристики:
//Список полок (shelves): хранит полки стеллажа.
//Максимальное количество полок.
//Методы:
//Добавление Полки (addShelf):
//Добавляет новую полку в стеллаж.
//Возвращает true, если полка была успешно добавлена или false если стеллаж уже заполнен или была попытка добавить полку которая уже установлена.
//
//Удаление Полки (removeShelf):
//Принимает индекс полки для удаления.
//Удаляет полку по указанному индексу.
//Возвращает true, если полка была успешно удалена или false если она не существует.
//
//Добавление Предмета (addItem):
//Добавляет предмет на самую свободную полку.
//Возвращает true, если предмет успешно добавлен, и false, если на всех полках недостаточно места.
//
//Удаление Предмета (removeItem):
//Находит и удаляет предмет с любой полки.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.
//
//Проверка наличия предмета на полке:
//Возвращает true если предмет есть на одной из полок
//
//Получение списка полок:
//Возвращает неизменяемый список полок
//
//Печать Содержимого (printContents):
//Выводит в консоль информацию о каждой полке: индекс, вместимость, оставшуюся вместимость, список предметов. Информацию выводить в наглядном читаемом виде
//
//Сложное удаление полки (advancedRemoveShelf):
//Принимает индекс полки для удаления
//Перераспределяет предметы по имеющимся полкам, начиная с самых длинных. Если очередной предмет никуда не вмещается, его нужно пропустить и попробовать разместить следующий.
//Удаляет полку с оставшимися предметами
//Возвращает список предметов, которые не удалось удалить
//
//Для усложнения, вместо предметов-слов создать класс предмета с названием и занимаемым размером.

class Rack(
    val shelves: MutableList<Shelf>,
    val maxCapacityShelf: Int
) {
    fun addShelf(shelf: Shelf): Boolean {
        return if (shelves.size < this.maxCapacityShelf) {
            this.shelves.add(shelf)
            true
        } else false
    }

    fun removeShelf(indexShelf: Int): Boolean {
        return if (this.shelves.size <= indexShelf) {
            this.shelves.remove(this.shelves[indexShelf])
            true
        } else false
    }

    fun addItem(nameItem: String): Boolean {
        var bestShelf: Shelf? = null
        var minEmpty = 0
        this.shelves.forEach {
            if (minEmpty > it.capacity - it.items.sumOf { it.length }) {
                bestShelf = it
                minEmpty = it.capacity - it.items.sumOf { it.length }
            }
        }
        return bestShelf?.addItem(nameItem) ?: false
    }

    fun removeItem(nameItem: String): Boolean {
        this.shelves.forEach {
            if (it.removeItem(nameItem)) return true
        }
        return false
    }

    fun isItemExists(nameItem: String): Boolean {
        this.shelves.forEach {
            if (it.isItemExists(nameItem)) return true
        }
        return false
    }

    fun getShelvesList (): List<Shelf> {
        return this.shelves.toList()
    }

    fun printContents() {
        this.shelves.forEach {
            println(" ")
        }
    }

    fun advancedRemoveShelf():List<String>? {
        return null
    }
}