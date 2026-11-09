package org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass

import org.example.org.example.lessons.lesson18.homeworks.interfaces.AutomaticShutdown
import org.example.org.example.lessons.lesson18.homeworks.interfaces.BatteryOperated
import org.example.org.example.lessons.lesson18.homeworks.interfaces.LightEmitting
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Powerable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Rechargeable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.SoundEmitting
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Timable

abstract class SmartSpeaker : Powerable, AutomaticShutdown, Timable, BatteryOperated, LightEmitting, SoundEmitting,
    Rechargeable