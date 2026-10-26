package org.example.org.example.lessons.lesson14.homeworks

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