package com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass

import com.galkinalex.kotlincourse.lesson20.homework.interfaces.AutomaticShutdown
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.LightEmitting
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Powerable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Programmable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.SoundEmitting
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Timable

abstract class SmartLamp : AutomaticShutdown, LightEmitting, Powerable, Programmable, SoundEmitting, Timable