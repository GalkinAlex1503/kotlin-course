package org.example.org.example.lessons.lesson17.lesson
//
//Инкапсуляция — это один из основных принципов ООП. Он играет ключевую роль в управлении доступом к данным и методам класса, защищая данные от некорректных изменений и предотвращая исполнение методов, не предназначенных для прямого вызова извне. Инкапсуляция позволяет скрыть детали реализации класса, предоставляя внешнему миру только необходимый интерфейс для взаимодействия с объектом.
//
//Инкапсуляция в Kotlin
//
//В Kotlin инкапсуляция реализуется с помощью модификаторов доступа: private, protected, internal и public. Эти модификаторы определяют уровень доступа к классам, полям, методам и конструкторам в вашем коде.
//
//Private: Члены класса доступны только внутри этого класса.
//Protected: Члены класса доступны внутри класса и в производных классах.
//Internal: Члены класса доступны в любом месте того же модуля.
//Public: Члены класса доступны отовсюду, где есть доступ к классу.
//Пример инкапсуляции:
//
//class Account(private var balance: Double) {
//
//    fun deposit(amount: Double) {
//        if (amount > 0) {
//            balance += amount
//        }
//    }
//
//    fun getBalance(): Double {
//        return balance
//    }
//
//    fun withdraw(amount: Double): Double {
//        if (amount > 0) {
//            val withdraw = min(amount, balance)
//            balance -= withdraw
//            return withdraw
//        }
//        return 0.0
//    }
//}
//
//fun main() {
//
//    val account = Account(0.0)
//    account.deposit(15.0)
//    println("Текущий баланс ${account.getBalance()}")
//    println("Хочу снять 12 и получаю ${account.withdraw(12.0)}")
//    println("Текущий баланс ${account.getBalance()}")
//    println("Хочу снять 10 но получаю ${account.withdraw(10.0)}")
//    println("Текущий баланс ${account.getBalance()}")
//}
//В этом примере поле balance скрыто от прямого доступа извне класса Account, тем самым защищая его от непреднамеренных изменений. Доступ к balance осуществляется через публичные методы deposit, getBalance и withdraw.
//
//Примеры с наследованием
//
//open class Person(private val name: String, protected val age: Int) {
//    // Публичный метод
//    fun greet() {
//        secret()
//        println("Привет, меня зовут $name.")
//    }
//    // Защищённый метод
//    protected fun getName(): String {
//        return name
//    }
//    // Приватный метод
//    private fun secret() {
//        println("Это секретный метод.")
//    }
//}
//
//class Student(
//    name: String,
//    age: Int,
//    val studentId: Int
//) : Person(name, age) {
//    // Публичный метод
//    fun study() {
//        // Используем защищённый метод getName() из родительского класса
//        println("${getName()} (id: $studentId) учится.")
//    }
//    fun showAge() {
//        // Обращаемся к защищённому полю age из родительского класса
//        println("Мне $age лет.")
//    }
//    fun tryAccessSecret() {
////         Попытка вызвать приватный метод secret() из родительского класса
////         secret() // Ошибка компиляции: метод secret() недоступен
//    }
//}
//fun main() {
//    val student = Student("Алексей", 20, 12345)
//    student.greet()        // Вывод: Это секретный метод. \n Привет, меня зовут Алексей.
//    student.study()        // Вывод: Алексей учится.
//    student.showAge()      // Вывод: Мне 20 лет.
//    println(student.studentId)
////    println(student.name)
////    println(student.age)
////    student.secret()    // Ошибка: метод secret() недоступен
//    student.tryAccessSecret()
//}
//Инкапсуляция конструкторов и классов
//Благодаря возможности скрыть конструктор можно добиться запрета на создание экземпляров класса напрямую и предоставить методы-инициализаторы, которые обеспечат правильную инициализацию конструктора.
//
//Приватные классы позволяют создавать скрытую архитектуру, нужную только для реализации механик внутри одного класса и не нужную во внешнем коде. Чтобы класс сделать приватным, он должен находиться либо в одном файле с другим классом, который его будет использовать, либо внутри другого класса. Следует понимать, что нельзя сделать публичными или protected поля, в типе которых указан приватный класс.
//
//class SomeClass private constructor(val arg1: Int, val arg2: Int) {
//
//    companion object {
//
//        fun init(arg1: Int): SomeClass {
//            return SomeClass(arg1, arg1 + 1)
//        }
//    }
//    private val data = mutableListOf<AnotherClass>()
//
//    fun add(arg: Int) {
//        data.add(AnotherClass(arg + arg2))
//    }
//
//    fun get(): List<Int> {
//        return data.map { it.arg }
//    }
//}
//
//private data class AnotherClass(val arg: Int)
//
//
//Практические задания
//Инкапсуляция полей
//Класс "Лампа": Разработайте класс Lamp с приватными полями isOn (включена ли лампа) и публичными методами turnOn() и turnOff() для управления состоянием лампы.
//
//Инкапсуляция методов
//Игровая Консоль
//Создайте класс GameConsole с публичным методом startGame(gameName: String). Внутри класса определите приватные методы initializeHardware() и loadGame(gameName: String), которые автоматически выполняются при вызове startGame(gameName). Пользователь не должен вызывать инициализацию аппаратного обеспечения и загрузку игры напрямую.
//
//Банкомат
//Написать класс счёта, в котором можно пополнять, проверять и списывать с баланса только при предоставлении корректного пин кода. Также можно выполнять смену пинкода. В случае неудачной проверки, выбрасываем ошибку. Количество неверно введённых пинкодов 3, после чего проверка всегда будет заканчиваться ошибкой. Если пин введён верно, то счётчик попыток сбрасывается.
//
//Раскраска
//Расставь правильно объявление для переменных (var или val) и модификаторы доступа руководствуясь правилом, что всё должно быть val и private за исключением того, что явно требует модификации или публичного доступа.
//
//class Iron(model: String, color: String, maxWaterAmount: Float) {
//
//    standByTemperature = 20f
//    temperature: Float = standByTemperature
//    isPowerOn: Boolean = false
//    waterAmount: Float = 0f
//    indicator = false
//
//    fun powerOn(targetTemperature: Float) {
//        isPowerOn = true
//        println("Утюг включён")
//        setTemperature(targetTemperature)
//    }
//
//    fun powerOff() {
//        indicator = false
//        isPowerOn = false
//        println("Утюг выключен")
//        changeTemperature(standByTemperature)
//    }
//
//    fun setTemperature(target: Float) {
//        if (target > temperature) {
//            indicator = true
//        }
//        changeTemperature(target)
//        indicator = false
//    }
//
//    fun addWater(amount: Float): Float {
//        if (amount <= 0f) return 0f
//        val freeSpace = maxWaterAmount - waterAmount
//        val waterForAdding = minOf(amount, freeSpace)
//        waterAmount += waterForAdding
//        return amount - waterForAdding
//    }
//
//    fun letOffSteam(seconds: Int): Boolean {
//        if (waterAmount == 0f) return false
//        val targetTime = System.currentTimeMillis() + 2 * 1000
//        val steamPortion = 5f
//        while (targetTime > System.currentTimeMillis()) {
//            println("Пшшшшш")
//            if (waterAmount >= steamPortion) {
//                waterAmount -= steamPortion
//            } else {
//                waterAmount = 0f
//                println("Вода закончилась")
//                break
//            }
//            Thread.sleep(200)
//        }
//        return waterAmount > 0
//    }
//
//    fun changeTemperature(target: Float) {
//        val upTemperaturePerSecond = 10f
//        val downTemperaturePerSecond = 3f
//
//        while (abs(target - temperature) > 10) {
//            if (target > temperature) {
//                temperature += upTemperaturePerSecond
//                println("Нагрелся до $temperature")
//            } else {
//                temperature -= downTemperaturePerSecond
//                println("Остыл до $temperature")
//            }
//            Thread.sleep(1000)
//        }
//    }
//}