package com.galkinalex.kotlincourse.lesson17.homework

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)
class AddFirst() : Materials() {
    fun addFirst(str: String) {
        val addMaterials = listOf(str) + extractMaterial()
        addMaterials.forEach { addMaterial(it) }
    }
}

//Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными, которые уже есть.
// То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.
class TwoClass() : Materials() {
    fun mixTwoMethod(newList: List<String>) {
        val containerMaterials = extractMaterial()
        if (newList.size >= containerMaterials.size) {
            for (i in newList.indices) {
                addMaterial(newList[i])
                if (i < containerMaterials.size) {
                    addMaterial(containerMaterials[i])
                }
            }
        } else {
            for (i in containerMaterials.indices) {
                if (i < newList.size) {
                    addMaterial(newList[i])
                }
                addMaterial(containerMaterials[i])
            }
        }
    }
}

//Третий класс должен добавлять элементы в список в алфавитном порядке. Если мы добавляем новый элемент в список,
// то он должен встать где-то между другими элементами и занять место в соответствии с сортировкой по алфавиту.

class ThirdClass() : Materials() {
    fun sortThirdMethod(str: String) {
        val containerMaterials = extractMaterial().toMutableList()
        containerMaterials.add(str)
        containerMaterials.sort()
        containerMaterials.forEach { addMaterial(it) }
    }
}

//Четвёртый класс должен принимать словарь из строк (ключи и значения).
// Каждая пара ключа и значения должна попадать в контейнер следующим образом - ключ в начало, значение в конец.
class ForthClass() : Materials() {
    fun addForthMethod(workMap: Map<String, String>) {
        val resultList = mutableListOf<String>()
        workMap.forEach {
            resultList.add(0, it.key)
            resultList.add(it.value)
        }
        resultList.forEach { addMaterial(it) }
    }
}