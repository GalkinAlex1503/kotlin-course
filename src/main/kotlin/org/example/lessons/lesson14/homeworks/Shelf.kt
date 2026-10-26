package org.example.org.example.lessons.lesson14.homeworks

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