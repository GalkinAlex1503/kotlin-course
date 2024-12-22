package com.galkinalex.kotlincourse.lesson20.homework.classes.abstractclass

import com.galkinalex.kotlincourse.lesson20.homework.interfaces.BatteryOperated
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.LightEmitting
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Powerable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Programmable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Rechargeable
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.SoundEmitting
import com.galkinalex.kotlincourse.lesson20.homework.interfaces.Timable

abstract class ElectronicClock : Rechargeable, Powerable, Timable, BatteryOperated, LightEmitting, SoundEmitting,
    Programmable