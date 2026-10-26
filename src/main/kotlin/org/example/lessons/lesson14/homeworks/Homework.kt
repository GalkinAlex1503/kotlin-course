package org.example.org.example.lessons.lesson14.homeworks

fun main() {

    println("Событие: Вечеринка")
    val partyTest = Party("Paris", 100)
    partyTest.details()
    println()


    println("Аспект реальности: Эмоция")
    val emo1 = Emotion("angry", 10)
    val emo2 = Emotion("confuse", 3)
    emo1.express()
    emo2.express()
    println()


    println("Природное явление: Луна")
    val moon1 = Moon(true, "Full Moon")
    val moon2 = Moon(true, "New Moon")
    val moon3 = Moon(false, "Half Moon")
    moon1.showPhase()
    moon2.showPhase()
    moon3.showPhase()
    println()


    println("Покупка: Продукт")
    val product1 = Product("milk", 10.3, 2)
    val product2 = Product("beer", 5.0, 0)
    println("${product1.name}  count ${product1.count}")
    println("${product2.name}  count ${product2.count}")
    println()


    println("Мероприятие: Концерт")
    val ahha = Show("Ahha", "Berlin", 10.5, 1000, 0)
    val rhcp = Show("Red Hot Chilly Peppers", "Beograd", 20.0, 5000, 0)
    ahha.showInfoShow()
    rhcp.showInfoShow()
    println("buy 1 ticket on show ${rhcp.band}")
    rhcp.buyTicket()
}