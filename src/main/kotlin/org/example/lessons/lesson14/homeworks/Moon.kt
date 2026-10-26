package org.example.org.example.lessons.lesson14.homeworks

class Moon(
    val isVisible: Boolean,
    val phase: String
) {
    fun showPhase() {
        println("Moon ${if (!isVisible) "is not visible now!" else "is $phase"}")
    }
}