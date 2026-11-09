package org.example.org.example.lessons.lesson18.homeworks.classes.abstractclass

import org.example.org.example.lessons.lesson18.homeworks.interfaces.AutomaticShutdown
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Cleanable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.LightEmitting
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Mechanical
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Openable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Powerable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Programmable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.SoundEmitting
import org.example.org.example.lessons.lesson18.homeworks.interfaces.TemperatureRegulatable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.Timable
import org.example.org.example.lessons.lesson18.homeworks.interfaces.WaterContainer

abstract class CoffeeMachine : Powerable, Openable, WaterContainer, TemperatureRegulatable, AutomaticShutdown, Timable,
    Mechanical, LightEmitting, SoundEmitting, Programmable, Cleanable