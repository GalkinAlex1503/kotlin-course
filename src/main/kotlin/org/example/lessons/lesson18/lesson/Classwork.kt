package org.example.org.example.lessons.lesson18.lesson
//
//Абстракция в объектно-ориентированном программировании (ООП) — это процесс выделения ключевых характеристик объекта, исключая из рассмотрения несущественные детали. Это позволяет сосредоточиться на том, "что" делает объект, а не на том, "как" он это делает, облегчая тем самым проектирование и реализацию программных систем.
//
//Прочитай ещё раз, это важно - абстракция отвечает на вопрос “что”, а не “как”. Например, когда мы проектируем стиральную машину, мы должны ответить на вопрос - что она должна делать? Абстрактно - стирать, полоскать, отжимать бельё. По этой абстракции можно построить множество реализаций, которые будут соответствовать этой абстракции, но каждая реализация будет технически отличаться от другой - способ загрузки белья, способ вращения барабана, полуавтоматические или автоматы, разные программы стирки и так далее.
//
//Язык предоставляет нам несколько возможностей для абстрактного описания программы: Интерфейс и Абстрактный класс.
//
//interface Powerable {
//    // Абстрактные методы без реализации
//    fun turnOn()
//    fun turnOff()
//}
//
//interface Device : Powerable {
//
//    // Константа, определенная в companion object
//    companion object {
//        const val TYPE = "Device"
//    }
//
//    // Абстрактное свойство (поле), которое должно быть переопределено в классе, реализующем интерфейс
//    val deviceId: String
//
//    // Метод с реализацией, вызывающий приватный метод
//    fun restart() {
//        turnOff()
//        logAction("Устройство с ID $deviceId выключено для перезагрузки.")
//        turnOn()
//        logAction("Устройство с ID $deviceId включено после перезагрузки.")
//    }
//
//    // Приватный метод с реализацией (доступно начиная с Kotlin 1.4)
//    private fun logAction(action: String) {
//        println("* Лог действия устройства: $action *")
//    }
//}
//
//abstract class HouseholdAppliance(
//    val brand: String
//) : Device {
//
//    abstract val applianceType: String
//
//    var isPoweredOn: Boolean = false
//        private set
//
//    abstract fun operate()
//
//    override fun turnOn() {
//        isPoweredOn = true
//        onPowerChange()
//    }
//
//    override fun turnOff() {
//        isPoweredOn = false
//        onPowerChange()
//    }
//
//    private fun onPowerChange() {
//        val state = if (isPoweredOn) {
//            "включено"
//        } else {
//            "выключено"
//        }
//        println("Устройство '$applianceType $brand' $state.")
//    }
//
//    protected open fun performMaintenance() {
//        println("*** Секция обслуживания устройства ***")
//    }
//}
//
//interface Programmable {
//
//    fun selectProgram(preset: Int)
//}
//
//class Microwave(
//    brand: String,
//    serialNumber: String
//) : HouseholdAppliance(brand), Programmable {
//
//    private val programPresets = mapOf(
//        1 to "warm up soup",
//        2 to "warm up bread"
//    )
//
//    private var lastProgram = 1
//
//    override val deviceId = serialNumber
//
//    override val applianceType: String = "Микроволновая печь"
//
//    override fun operate() {
//        if (isPoweredOn) {
//            invokeProgram()
//            performMaintenance()
//        } else {
//            println("Микроволновая печь от $brand не включена. Пожалуйста, включите ее.")
//        }
//    }
//
//    override fun performMaintenance() {
//        super.performMaintenance()
//        println("Чистка микроволновой печи от $brand.")
//    }
//
//    override fun selectProgram(preset: Int) {
//        if (preset in programPresets) {
//            lastProgram = preset
//        }
//    }
//
//    private fun invokeProgram() {
//        println(programPresets[lastProgram])
//    }
//}
//
//fun main() {
//    val mw = Microwave("Samsung", "CX45HGR-T10")
//    println(mw.isPoweredOn)
//    // mw.isPoweredOn = true // так нельзя
//    println(mw.deviceId)
//    mw.turnOn()
//    mw.operate()
//    mw.restart()
//    mw.operate()
//    mw.turnOff()
//}
//Интерфейс (или по другому контракт) описывает то, что должен делать объект, построенный на этом интерфейсе. Если проще, то самый базовый интерфейс содержит в себе описания необходимых методов - только сигнатура без реализации. В котлине интерфейс также может содержать описания полей без инициализации и методы с реализацией. Для всех сущностей используется модификатор доступа public (который по умолчанию не указывается), но методы с реализацией могут использовать модификатор private, при условии, что есть публичные методы с реализацией, которые в своём теле вызывают приватный метод. Иначе этот метод не будет доступен нигде.
//
//Нейминг интерфейсов
//Названия интерфейсов в объектно-ориентированном программировании часто формируются с использованием глаголов с суффиксом "-able" (в английском языке), что помогает выразить намерение или способность объекта выполнять определённое действие или иметь определённую характеристику. Это соглашение делает код более понятным и читаемым, указывая на роль интерфейса в системе.
//
//Почему глаголы с суффиксом "-able"?
//Выражает способность: Суффикс "-able" превращает глагол в прилагательное, указывая на способность или возможность чего-либо. Например, интерфейс Movable говорит о том, что объект может быть перемещён, т.е., имеет способность к перемещению.
//Определяет поведение: Интерфейсы в ООП определяют поведение, которое классы-реализаторы должны предоставить. Использование глаголов с "-able" подчёркивает, что интерфейс предписывает классам определённые действия или свойства, например, Serializable указывает на способность объекта быть сериализованным.
//Повышает читаемость кода: Когда интерфейсы названы по принципу действия, которое они представляют, это упрощает понимание того, что делает класс, реализующий такой интерфейс. Это создаёт более интуитивно понятный код.
//Содействует принципу единственной ответственности: Названия интерфейсов, формируемые таким образом, часто указывают на конкретную функцию или способность, способствуя разделению ответственности в коде. Это поддерживает принцип единственной ответственности (Single Responsibility Principle), один из принципов SOLID.
//Примеры
//
//Runnable: объект может быть запущен (выполнен);
//Readable: объект может быть прочитан;
//Closable: объект может быть закрыт (обычно применяется к ресурсам, требующим освобождения).
//Множественная имплементация
//Принцип наследования в Kotlin реализуется через наследование классов (open или абстрактных). Родительским может быть только один класс, множественного наследования в Kotlin нет. При этом есть возможность множественной имплементации интерфейсов. Это означает, что один класс может включать несколько интерфейсов и таким образом наделяться целым комплексом свойств. Так же при проектировании мы можем наследоваться от родительского класса и имплементировать один или несколько интерфейсов. Для этого родительский класс и все интерфейсы перечисляются через запятую после двоеточия.
//
//Как в списке из наследуемого класса и интерфейсов понять - где класс а где интерфейсы? Класс обязательно будет с вызовом конструктора (круглые скобки с аргументами или без), у интерфейсов конструктора нет, поэтому интерфейсы в этом списке будут без скобочек.
//
//Практические задания
//Создай интерфейсы по их описанию:
//
//Интерфейс для включаемого объекта (можно включить и выключить)
//Интерфейс для открываемого объекта (можно открыть и закрыть)
//// Примеры для дальнейшей практической работы
//
//interface WaterContainer {
//    val capacity: Int
//    fun fillWater(amount: Int)
//    fun getWater(amount: Int)
//}
//interface TemperatureRegulatable {
//    val maxTemperature: Int
//    fun setTemperature(temp: Int)
//}
//interface WaterConnection {
//    fun connectToWaterSupply()
//    fun getWater(amount: Int)
//}
//interface AutomaticShutdown {
//    val sensorType: String
//    val maxSensoredValue: Int
//    fun startMonitoring()
//}
//interface Drainable {
//    fun connectToDrain()
//    fun drain()
//}
//interface Timable {
//    fun setTimer(time: Int)
//}
//interface BatteryOperated {
//    fun getCapacity(): Double
//    fun replaceBattery()
//}
//interface Mechanical {
//    fun performMechanicalAction()
//}
//interface LightEmitting {
//    fun emitLight()
//    fun completeLiteEmission()
//}
//interface SoundEmitting {
//    fun setVolume(volume: Int)
//    fun mute()
//    fun playSound(stream: InputStream)
//}
//interface Programmable {
//    fun programAction(action: String)
//    fun execute()
//}
//interface Movable {
//    fun move(direction: String, distance: Int)
//}
//interface Cleanable {
//    fun clean()
//}
//interface Rechargeable {
//    fun getCapacity(): Double
//    fun recharge()
//}
//Используя эти интерфейсы, реализуй абстрактные классы для бытовой техники:
//
//Электрический чайник - Powerable, WaterContainer, Timable
//Пылесос - Powerable, Movable, Cleanable
//Микроволновая печь - Powerable, Openable, Timable, TemperatureRegulatable
//Портативная колонка - BatteryOperated, SoundEmitting, Rechargeable
//Духовка - Powerable, TemperatureRegulatable, Timable, Openable
//Блендер - Powerable, Openable, Cleanable
//Водонагреватель - Powerable, WaterContainer, TemperatureRegulatable
//Игрушечный автомобиль - BatteryOperated, Movable, SoundEmitting
//Увлажнитель воздуха - Powerable, WaterContainer, LightEmitting
//Электрическая зубная щётка - BatteryOperated, Rechargeable, Cleanable
//Вентилятор - Powerable, Movable (направление воздушного потока)
//Умный дверной замок - BatteryOperated, Programmable, Openable
//Напиши функцию, которая принимает объект типа Powerable и выключает его.
//Примени эту функцию к разными объектам, которые создавали в предыдущем задании (Электрический чайник, Холодильник, Механические часы)