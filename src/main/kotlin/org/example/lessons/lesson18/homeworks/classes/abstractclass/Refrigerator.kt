package org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass

import org.example.org.example.lessons.lesson18.homeworks.interfaces.Cleanable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.LightEmitting
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Openable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Powerable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.TemperatureRegulatable

abstract class Refrigerator : Powerable, Openable, TemperatureRegulatable, Cleanable, LightEmitting