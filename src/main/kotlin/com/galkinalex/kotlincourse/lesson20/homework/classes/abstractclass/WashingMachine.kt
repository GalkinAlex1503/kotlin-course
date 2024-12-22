package com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass

import com.galkinalex.kotlincourse.lesson20.homework.interfaces.AutomaticShutdown
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Cleanable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Drainable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Mechanical
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Openable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Powerable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Programmable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.SoundEmitting
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.TemperatureRegulatable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Timable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.WaterConnection

abstract class WashingMachine : Powerable, Openable, TemperatureRegulatable, WaterConnection, AutomaticShutdown,
    Drainable, Timable,
    Mechanical, SoundEmitting, Programmable, Cleanable