package com.galkinalex.kotlincourse.lesson15.homework

//Природное явление: Луна Создайте объект Moon, который будет представлять Луну.
// Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент,
// и phase (String), чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
// Добавьте метод showPhase(), который выводит текущую фазу Луны.

class Moon(
    val isVisible: Boolean,
    val phase: String
) {
    fun showPhase() {
        println("Moon ${if (!isVisible) "is not visible now!" else "is $phase"}")
    }
}