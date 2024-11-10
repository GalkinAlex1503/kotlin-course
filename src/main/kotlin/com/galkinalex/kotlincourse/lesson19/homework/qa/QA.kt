package com.galkinalex.kotlincourse.lesson19.homework.qa

abstract class BaseClass(
    // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass ----> через метод getAll
    private val privateVal: String,
    // объясни, почему это поле недоступно в main() , ----> идентификатор доступа - протект, поля доступно только внутри расширяемых классов и их методов
    protected val protectedVal: String,
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    private var privateField = "добавь сеттер чтобы изменить меня из main()"
    fun setPrivateField (value: String) {
        privateField = value
    }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // объясни, почему эта функция не может быть публичной  --->  она возвращает класс который обявлен внутри текущего класса как протектед, и не может быть возвращен мне этого класса публичной функцией
     protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // объясни, почему эта функция не может быть публичной или protected  --->   функция возвращает класс который является приватным относительно этого класса
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет   --->   функция наследована от родительского класса

    // проверь, что выводится на печать при вызове функции printText()  --->  Печать из класса BaseClass
    // и объясни, почему не происходит переопределение метода privatePrint()   --->  метод приватный для родительского класса
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    // ---> изменение проверки длины чтобы работал сеттер
    override fun verifyPublicField(value: String): Boolean {
        return value.length > 3
    }

    fun setProtField (value: String) {
        protectedField = value
    }

}

