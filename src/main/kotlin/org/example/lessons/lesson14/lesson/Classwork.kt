package org.example.org.example.lessons.lesson14.lesson
//
//Объектно-ориентированное программирование (ООП) - это парадигма программирования, которая использует "объекты" для моделирования данных и поведения программы. Основные концепции ООП включают классы и объекты, наследование, инкапсуляцию, полиморфизм и абстракцию.
//
//Классы и объекты
//Класс в ООП определяется как шаблон или чертёж, который описывает состояние и поведение, которыми обладает объект этого класса. Класс состоит из полей (атрибутов) и методов (функций или процедур).
//
//Объект - это экземпляр класса. Когда класс определен, ни один из его содержащихся методов или переменных не используется, пока не будет создан объект этого класса. Объекты создаются и уничтожаются динамически и могут иметь множество экземпляров одного класса.
//
//Основная структура класса в Kotlin
//В Kotlin класс объявляется с использованием ключевого слова class. Внутри класса могут быть поля (свойства) и методы (функции). Пример базового класса:
//
//fun main() {
//    val person = Person("John", 30)
//    person.sayHello()
//}
//class Person(val name: String, var age: Int) {
//    // Метод класса
//    fun sayHello() {
//        println("Hello, my name is $name and I am $age years old.")
//    }
//}
//val name: String — неизменяемое свойство (аналог final в Java).
//
//var age: Int — изменяемое свойство.
//
//sayHello() — метод, который выводит приветствие с использованием свойств класса.
//
//Конструктор класса
//Конструктор используется для объявления полей, значения которым необходимо задать в момент инициализации объекта этого класса. Первичный конструктор определяется в круглых скобках сразу после названия класса и содержит в себе перечисление полей с типами через запятую.
//
//class Passenger(
//    val name: String,
//    private val dateOfBirth: String,
//    private var phone: String
//) {
//    private var age: Int = calculateAge()
//    private fun calculateAge(): Int {
//        return Period.between(
//            LocalDate.parse(dateOfBirth),
//            LocalDate.now()
//        ).years
//    }
//    fun recalculateAge() {
//        age = calculateAge()
//    }
//}
//class Carriage(val capacity: Int, val type: String = "Плацкарт") {
//    private val passengers = mutableMapOf<Int, Passenger>()
//    fun boardPassenger(passenger: Passenger, seat: Int) {
//        if (passengers.size < capacity) {
//            passengers[seat] = (passenger)
//        }
//    }
//    fun passengerGetOff(seat: Int) {
//        passengers.remove(seat)
//    }
//}
//class Train(val engineType: String) {
//    val carriages = mutableListOf<Carriage>()
//    fun boardPassenger(
//        passenger: Passenger,
//        seat: Int,
//        carriageType: String
//    ) {
//        // логика для размещения пассажира
//    }
//}
//fun main() {
//    val reservedSeatCarriage = Carriage(48)
//    val compartmentCarriage = Carriage(16, "Купе")
//    val train = Train("Electric locomotive")
//    train.carriages.add(reservedSeatCarriage)
//    train.carriages.add(compartmentCarriage)
//    val passengerAlexandr = Passenger("Alexandr", "02.10.1983", "")
//    train.boardPassenger(passengerAlexandr, 10, "Купе")
//}
//Object
//object в Kotlin используется для создания синглтонов, то есть классов, которые могут иметь только один экземпляр. Это удобно, когда вам нужен глобальный объект, например, менеджер конфигурации или логгер.
//
//object Logger {
//    fun log(message: String) {
//        println("Log: $message")
//    }
//}
//fun main() {
//    Logger.log("Application started")
//}
//Здесь Logger — это синглтон, и его методы доступны без создания экземпляра.
//
//Companion object
//Если вам необходимо создать что-то похожее на статическое поле или метод (как в Java), в Kotlin используется companion object. Он позволяет объявить статические методы и переменные, которые принадлежат самому классу, а не конкретному его экземпляру:
//
//class Calculator {
//    companion object {
//        fun add(a: Int, b: Int): Int {
//            return a + b
//        }
//    }
//}
//fun main() {
//    val result = Calculator.add(5, 3)
//    println("Result: $result")
//}
//Здесь companion object содержит метод add(), который можно вызвать без создания экземпляра класса Calculator.
//
//Data class
//data class — это специальный вид классов в Kotlin, который предназначен для хранения данных. Они автоматически предоставляют полезные функции, такие как toString(), equals(), hashCode(), и copy(). Пример:
//
//data class User(val id: Int, val name: String)
//fun main() {
//    val user1 = User(1, "Alice")
//    val user2 = user1.copy(name = "Bob")
//    println(user1) // Output: User(id=1, name=Alice)
//    println(user2) // Output: User(id=1, name=Bob)
//}
//data class автоматически генерирует полезные методы.
//
//Функция copy() позволяет легко создавать копии объектов, меняя нужные поля.
//
//Практические задания
//Физический предмет: Лампа Создайте класс Lamp, который будет представлять лампу. У лампы должно быть свойство isOn (Boolean), которое показывает, включена ли лампа. Добавьте метод toggle(), который меняет состояние лампы (включает или выключает её).
//
//class Lamp(var isOn: Boolean) {
//    fun toggle() {
//        isOn = !isOn
//        val state = if (isOn) "on" else "off"
//        println("The lamp is $state")
//    }
//}
//fun main() {
//    val lamp = Lamp(false)
//    lamp.toggle()  // The lamp is on
//    lamp.toggle()  // The lamp is off
//}
//Явление: Ветер Создайте класс Wind, который будет представлять ветер. В классе должно быть свойство speed (Int), которое описывает скорость ветра (в км/ч). Добавьте метод convertToMetersPerSecond(), который пересчитывает скорость ветра в метры в секунду и возвращает это значение.
//
//class Wind(val speed: Int) {
//    fun convertToMetersPerSecond(): Double {
//        return speed / 3.6
//    }
//}
//fun main() {
//    val wind = Wind(36)
//    val speedInMetersPerSecond = wind.convertToMetersPerSecond()
//    println("Speed in meters per second: $speedInMetersPerSecond")
//}
//Природное явление: Солнце Создайте объект Sun, который будет представлять солнце. Добавьте свойства isShining (Boolean), чтобы отображать, светит ли солнце в данный момент, и temperature (Int), чтобы отображать текущую температуру на поверхности солнца в градусах Цельсия. Добавьте метод shine(), который выводит сообщение, если солнце светит.
//
//object Sun {
//    val isShining: Boolean = true
//    val temperature: Int = 5500
//    fun shine() {
//        if (isShining) {
//            println("The sun is shining with a temperature of $temperature°C.")
//        } else {
//            println("The sun is not shining right now.")
//        }
//    }
//}
//fun main() {
//    Sun.shine()  // The sun is shining with a temperature of 5500°C.
//}
//Транспортное средство: Автомобиль Создайте класс Car, который будет представлять автомобиль. В классе должны быть свойства brand (String) и model (String). Добавьте companion object, который будет содержать список популярных брендов автомобилей. Добавьте метод showInfo(), который выводит информацию об автомобиле.
//
//class Car(val brand: String, val model: String) {
//    companion object {
//        val popularBrands = listOf("Toyota", "BMW", "Tesla", "Ford")
//    }
//    fun showInfo() {
//        println("Car brand: $brand, model: $model")
//    }
//}
//fun main() {
//    val car = Car("Toyota", "Camry")
//    car.showInfo()  // Car brand: Toyota, model: Camry
//    println("Popular car brands: ${Car.popularBrands}")
//}
//Заказ в ресторане: Блюдо Создайте data class Dish, который будет представлять блюдо в ресторане. У него должны быть свойства name (String), ingredients (List), и price (Double). Добавьте метод describeDish(), который выводит описание блюда и его ингредиенты.
//
//data class Dish(val name: String, val ingredients: List<String>, val price: Double) {
//    fun describeDish() {
//        println("Dish: $name, Price: $$price, Ingredients: ${ingredients.joinToString(", ")}")
//    }
//}
//fun main() {
//    val pasta = Dish("Pasta Carbonara", listOf("Pasta", "Eggs", "Parmesan", "Bacon"), 12.99)
//    pasta.describeDish()  // Dish: Pasta Carbonara, Price: $12.99, Ingredients: Pasta, Eggs, Parmesan, Bacon
//}
