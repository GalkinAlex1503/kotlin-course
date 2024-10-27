package com.galkinalex.kotlincourse.lesson15.homework

//Мероприятие: Концерт Создайте класс, который будет представлять концерт.
// У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
// Также приватное поле “проданные билеты”.
// Добавьте метод, который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.

class Show(
    val band: String,
    val location: String,
    val priceTicket: Double,
    val capacityHall: Int,
    private var soldTickets: Int
) {
    fun showInfoShow() {
        println("Band: $band, location: $location, price ticket: $priceTicket, hall capacity $capacityHall, ticket sold: $soldTickets")
    }

    fun buyTicket() {
        this.soldTickets += 1
    }
}