package org.example.org.example.lessons.lesson14.homeworks

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

    fun getShelvesList(): List<Shelf> {
        return this.shelves.toList()
    }

    fun printContents() {
        this.shelves.forEach {
            println(" ")
        }
    }

    fun advancedRemoveShelf(): List<String>? {
        return null
    }
}