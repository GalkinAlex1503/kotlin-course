package com.galkinalex.kotlincourse.lesson18.homework.carts

open class ShoppingCart(
    private val goods: MutableMap<Int, Int>
) {
    override fun toString (): String {
        var result = ""
        goods.forEach { result += "id товара: ${it.key}, количество товара: ${it.value} \n" }
        return result
    }
    open fun addToCart(idGood: Int) {
        if (goods.containsKey(idGood)) {
            goods[idGood] = goods.getValue(idGood) + 1
        } else {
            goods[idGood] = 1
        }
    }

    open fun addToCart(idGood: Int, goodValue: Int) {
        if (goods.containsKey(idGood)) {
            goods[idGood] = goods.getValue(idGood) + goodValue
        } else {
            goods[idGood] = goodValue
        }
    }

    open fun addToCart(goodList: List<Int>) {
        goodList.forEach {
            if (goods.containsKey(it)) {
                goods[it] = goods.getValue(it) + 1
            } else {
                goods[it] = 1
            }
        }
    }
}