package org.example.org.example.lessons.lesson15.lesson
//
//Наследование - один из принципов ООП, который позволяет новому классу унаследовать свойства и методы существующего класса. Это позволяет выделять обобщающие свойства и поведение множества схожих классов в один класс и переиспользовать эти обобщённые сущности в других классах не дублируя один и тот же код.
//
//Рассмотрим реализацию наследования на примере транспортных средств.
//
//Vehicle — базовый класс, представляющий транспортное средство. Определяет общие свойства: максимальную массу, вместимость пассажиров и серийный номер. Он включает основные методы: запуск и остановку движения, что характерно для любого транспорта.
//
//WheeledVehicle — класс, расширяющий Vehicle, добавляя характеристику количества колёс. Этот класс отражает общую модель любого колёсного транспорта, не привязываясь к конкретному виду.
//
//Car — класс, наследующий свойства WheeledVehicle. В нём добавлены характеристики двигателя и типа кузова, а также методы управления светом, поворотниками и стеклоочистителями. Таким образом, Car является полноценной реализацией автомобиля как частного случая колёсного транспорта.
//
//Bicycle — также наследует от WheeledVehicle, но с фиксированным значением количества колёс (два) и уникальным методом вращения педалей. Это наглядно показывает, как с помощью наследования и небольших изменений можно создать специализированный класс для другого вида транспорта.
//
//Aircraft — отдельный класс для летательных аппаратов, так как их основное свойство — возможность летать, а не перемещаться на колёсах. Класс добавляет характеристику высоты полёта и методы для её регулировки. Этот класс становится основой для создания всех типов воздушного транспорта.
//
//Airplane и Helicopter — наследуют от Aircraft, предоставляя гибкость в использовании общей функциональности для различных летательных аппаратов.
//
//// Основной класс Транспортное средство
//open class Vehicle(
//    val maxWeight: Int,
//    val passengerCapacity: Int,
//    val serialNumber: String
//) {
//    open fun startMovement() {
//        println("Транспортное средство начало движение.")
//    }
//    open fun stopMovement() {
//        println("Транспортное средство остановлено.")
//    }
//}
//
//// Класс Колёсное транспортное средство, наследующийся от Транспортного средства
//open class WheeledVehicle(
//    maxWeight: Int,
//    passengerCapacity: Int,
//    serialNumber: String,
//    val wheelCount: Int
//) : Vehicle(maxWeight, passengerCapacity, serialNumber)
//// Класс Автомобиль, наследующийся от Колёсного транспортного средства
//class Car(
//    maxWeight: Int,
//    passengerCapacity: Int,
//    serialNumber: String,
//    wheelCount: Int,
//    val engineType: String,
//    val bodyType: String
//) : WheeledVehicle(maxWeight, passengerCapacity, serialNumber, wheelCount) {
//    fun turnOnLights() {
//        println("Габариты включены.")
//    }
//    fun turnOffLights() {
//        println("Габариты выключены.")
//    }
//    fun activateTurnSignal(direction: String) {
//        println("Поворотник включен: $direction")
//    }
//    fun activateWipers() {
//        println("Стеклоочистители включены.")
//    }
//}
//
//// Класс Велосипед, наследующийся от Колёсного транспортного средства
//class Bicycle(
//    maxWeight: Int,
//    passengerCapacity: Int,
//    serialNumber: String
//) : WheeledVehicle(maxWeight, passengerCapacity, serialNumber, 2) {
//    fun pedal() {
//        println("Педали крутятся.")
//    }
//}
//
//// Класс Летательные аппараты
//open class Aircraft(
//    maxWeight: Int,
//    passengerCapacity: Int,
//    serialNumber: String,
//    val flightAltitude: Int
//) : Vehicle(maxWeight, passengerCapacity, serialNumber) {
//    fun increaseAltitude(amount: Int) {
//        println("Высота увеличена на $amount метров.")
//    }
//    fun decreaseAltitude(amount: Int) {
//        println("Высота уменьшена на $amount метров.")
//    }
//}
//
//// Класс Самолёт, наследующийся от Летательного аппарата
//class Airplane(
//    maxWeight: Int,
//    passengerCapacity: Int,
//    serialNumber: String,
//    flightAltitude: Int
//) : Aircraft(maxWeight, passengerCapacity, serialNumber, flightAltitude)
//// Класс Вертолёт, наследующийся от Летательного аппарата
//class Helicopter(
//    maxWeight: Int,
//    passengerCapacity: Int,
//    serialNumber: String,
//    flightAltitude: Int
//) : Aircraft(maxWeight, passengerCapacity, serialNumber, flightAltitude)
//Объяснение abstract и open классов
//abstract класс — это базовый класс, из которого нельзя создавать объекты напрямую. Он содержит абстрактные методы (без реализации), которые должны быть реализованы в наследниках. Используется, когда нужно задать общую структуру или обязательные для реализации методы в производных классах.
//
//open класс — это обычный класс, от которого можно наследоваться. В отличие от abstract, из open класса можно создавать объекты напрямую. Он полезен, когда нужно создать базовый класс с реализацией методов, который можно расширить, но не обязательно реализовать в дочерних классах.
//
//Отличие:
//
//abstract требует реализаций в наследниках
//open предоставляет возможность наследования, но не обязует к этому.
//Когда применять:
//
//abstract — когда нужен шаблон для будущих классов и строгое наследование с обязательной реализацией методов.
//open — для создания класса, от которого можно наследовать, добавляя новые функции, но который сам по себе является завершённой реализацией.
//Практические задания
//Задание 1. Иерархии в окружающем мире. Зная базовый "класс" назови его производные и производные для производных классов.
//
//Иерархия живых существ:
//Живое существо
//Растения, Животные
//...
//Иерархия электронных устройств:
//Электронное устройство
//Стационарное, Мобильное
//...
//Иерархия одежды
//Одежда
//Верхняя одежда, Нижнее бельё, Обувь
//...
//Задание 2. На примере этого абстрактного класса нужно создать три варианта работы с содержимым поля materials, при этом абстрактный класс изменять нельзя.
//
//Создайте класс, с методом, который будет вынимать объект с индексом 0, остальное оставлять в контейнере (без этого объекта)
//То-же самое, только с последним индексом
//То-же самое, только с индексом посерединке
//abstract class Materials {
//
//    private val materials = mutableListOf<String>()
//
//    fun addMaterial(material: String) {
//        materials.add(material)
//    }
//
//    fun extractMaterials(): List<String> {
//        val extracted = materials.toList()
//        materials.clear()
//        return extracted
//    }
//
//    fun printContainer() {
//        materials.forEachIndexed { index, layer ->
//            println("[$index]: $layer")
//        }
//    }
//}
//
//fun main() {
//    val ordinalNumbers = listOf(
//        "first", "second", "third", "fourth", "fifth",
//        "sixth", "seventh", "eighth", "ninth", "tenth",
//        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
//        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
//    )
//}
//Вариант решения
//
//class GetFirstMaterial : Materials() {
//
//    fun extractItem(): String {
//        val materials = extractMaterials()
//        materials.drop(1).forEach {
//            addMaterial(it)
//        }
//        return materials.first()
//    }
//}
//
//class GetLastMaterial : Materials() {
//
//    fun extractItem(): String {
//        val materials = extractMaterials()
//        materials.take(materials.lastIndex - 1)
//            .forEach {
//                addMaterial(it)
//            }
//        return materials.last()
//    }
//}
//
//class GetMiddleMaterial : Materials() {
//
//    fun extractItem(): String {
//        val materials = extractMaterials()
//        val middleIndex = materials.size / 2
//        for (it in materials.indices) {
//            if (it == middleIndex) continue
//            addMaterial(materials[it])
//        }
//        return materials[middleIndex]
//    }
//}