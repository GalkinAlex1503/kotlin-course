package org.example.org.example.lessons.lesson18.homeworks.interfaces

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}