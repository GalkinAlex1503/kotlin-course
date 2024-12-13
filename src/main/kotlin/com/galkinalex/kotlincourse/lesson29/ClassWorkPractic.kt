package com.galkinalex.kotlincourse.lesson29

import java.time.Instant
import java.time.LocalDate
import java.time.Period
import java.util.Calendar

fun main() {

    val currentTime = Instant.now()
    println(currentTime)
    val myTime = Instant.ofEpochSecond(34534)
    println(myTime)
    val dateKnow = LocalDate.of(2024,2,29)
    val lasDaySpring = LocalDate.of(2025,5, 31)
    val periodDays = Period.between(dateKnow,lasDaySpring)


}