package com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass

import com.galkinalex.kotlincourse.lesson20.homework.interfaces.*

abstract class WashingMachine : Powerable, Openable, TemperatureRegulatable, WaterConnection, AutomaticShutdown,
    Drainable, Timable,
    Mechanical, SoundEmitting, Programmable, Cleanable