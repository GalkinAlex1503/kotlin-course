package com.galkinalex.kotlincourse.lesson31

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {
    @Test
    fun plus1() {
        val calc = Calculator()
        val actual = calc.plus(2, 3)
        Assertions.assertEquals(5, actual)
    }

    @Test
    fun plus2() {
        val calc = Calculator()
        val actual = calc.plus(2, 3)
        Assertions.assertEquals(5, actual)
    }
}

class SimpleTest {


    private lateinit var testList: MutableList<String>

    @BeforeEach
    fun setUp() {
        // Инициализация перед каждым тестом
        testList = mutableListOf("one", "two", "three")
        println("Список инициализирован перед тестом")
    }

    @AfterEach
    fun tearDown() {
        // Очистка после каждого теста
        testList.clear()
        println("Список очищен после теста")
    }

    @Test
    fun testAddElement() {
        // Добавляем элемент и проверяем размер списка
        testList.add("four")
        assertEquals(4, testList.size, "Размер списка должен быть 4")
    }

    @Test
    fun testRemoveElement() {
        // Удаляем элемент и проверяем размер списка
        testList.remove("one")
        assertEquals(2, testList.size, "Размер списка должен быть 2")
    }
}


class HelloJunit5Test {

    @Test
    fun `First test`() {
        print("Hello, JUnit5!")
    }
}