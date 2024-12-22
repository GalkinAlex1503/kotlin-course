package com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass

import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Cleanable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.LightEmitting
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Openable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Powerable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.TemperatureRegulatable

abstract class Refrigerator : Powerable, Openable, TemperatureRegulatable, Cleanable, LightEmitting