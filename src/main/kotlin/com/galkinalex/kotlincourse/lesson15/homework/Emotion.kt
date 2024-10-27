package com.galkinalex.kotlincourse.lesson15.homework

//Аспект реальности: Эмоция Создайте класс Emotion, который представляет эмоцию.
// У него должно быть свойство type (String) и intensity (Int).
// Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.

class Emotion(
    val type: String,
    val intensity: Int
) {
    fun express() {
        println("Type emotion $type have ${if (intensity > 5) "strong intensity" else "low intensity"}")
    }
}