package org.example.org.example.lessons.lesson18.homeworks.interfaces

import java.io.InputStream

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}