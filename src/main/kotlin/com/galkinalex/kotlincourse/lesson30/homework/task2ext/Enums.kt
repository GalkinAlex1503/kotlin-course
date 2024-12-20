package com.galkinalex.kotlincourse.lesson30.homework.task2ext

enum class CoffeeType(
    val cost: Double,
    val coffeeBase: String,
    val recommendedSugar: Int,
    val hasMilk: Boolean = false
) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0),
    NESCAFE(0.5, "Nescafe classic", 1)
    ;

    fun description() =
        "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."
}

enum class CharacterTypes(
    val favoriteCoffee: CoffeeType
) {
    CTO(CoffeeType.ESPRESSO),
    UX_UI(CoffeeType.LATTE),
    CRM(CoffeeType.CAPPUCCINO), // Customer Relationship Manager
    GAME_DEV(CoffeeType.LATTE),
    TEAM_LEAD(CoffeeType.ESPRESSO),
    BACKEND_DEV(CoffeeType.AMERICANO),
    PM(CoffeeType.CAPPUCCINO),
    SYSADMIN(CoffeeType.AMERICANO),
    QA(CoffeeType.NESCAFE)
}