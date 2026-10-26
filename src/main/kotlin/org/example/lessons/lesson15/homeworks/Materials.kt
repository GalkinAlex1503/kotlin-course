package org.example.org.example.lessons.lesson15.homeworks

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


class AddFirst() : Materials() {
    fun addFirst(str: String) {
        val addMaterials = listOf(str) + extractMaterial()
        addMaterials.forEach { addMaterial(it) }
    }
}


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



class ThirdClass() : Materials() {
    fun sortThirdMethod(str: String) {
        val containerMaterials = extractMaterial().toMutableList()
        containerMaterials.add(str)
        containerMaterials.sort()
        containerMaterials.forEach { addMaterial(it) }
    }
}


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