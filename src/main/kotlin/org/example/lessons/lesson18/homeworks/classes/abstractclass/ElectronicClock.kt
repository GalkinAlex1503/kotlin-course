package org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass

import org.example.org.example.lessons.lesson18.homeworks.interfaces.BatteryOperated
import org.example.org.example.lessons.lesson18.homeworks.interfaces.LightEmitting
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Powerable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Programmable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Rechargeable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.SoundEmitting
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Timable

abstract class ElectronicClock : Rechargeable, Powerable, Timable, BatteryOperated, LightEmitting, SoundEmitting,
    Programmable