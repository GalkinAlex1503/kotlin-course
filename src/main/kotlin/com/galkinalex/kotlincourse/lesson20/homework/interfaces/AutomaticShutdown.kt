package com.galkinalex.kotlincourse.lesson20.homework.interfaces

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}