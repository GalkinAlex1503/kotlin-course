package org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass

import org.example.org.example.lessons.lesson18.homeworks.interfaces.BatteryOperated
import org.example.org.example.lessons.lesson18.homeworks.interfaces.LightEmitting
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Powerable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Rechargeable

abstract class Flashlight : Powerable, BatteryOperated, LightEmitting, Rechargeable