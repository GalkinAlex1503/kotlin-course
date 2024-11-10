package com.galkinalex.kotlincourse.lesson20.homework.interfaces

import java.io.InputStream

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}