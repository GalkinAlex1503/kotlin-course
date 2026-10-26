package org.example.org.example.lessons.lesson14.homeworks

class Emotion(
    val type: String,
    val intensity: Int
) {
    fun express() {
        println("Type emotion $type have ${if (intensity > 5) "strong intensity" else "low intensity"}")
    }
}