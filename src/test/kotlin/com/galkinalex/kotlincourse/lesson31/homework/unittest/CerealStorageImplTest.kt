package com.galkinalex.kotlincourse.lesson31.homework.unittest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test


class CerealStorageImplTest {

    @Test
    fun `should initialize with valid containerCapacity and storageCapacity`() {
        val storageTest = CerealStorageImpl(15f, 100f)
        assertEquals(15f, storageTest.containerCapacity)
        assertEquals(100f, storageTest.storageCapacity)
    }

    @Test
    fun `should initialize valid with zero for containerCapacity and valid storageCapacity`() {
        val storageTest = CerealStorageImpl(0f, 100f)
        assertEquals(0f, storageTest.containerCapacity)
        assertEquals(100f, storageTest.storageCapacity)
    }

    @Test
    fun `should initialize valid with zero for containerCapacity and zero storageCapacity`() {
        val storageTest = CerealStorageImpl(0f, 0f)
        assertEquals(0f, storageTest.containerCapacity)
        assertEquals(0f, storageTest.storageCapacity)
    }

    @Test
    fun `should throw IllegalArgumentException when containerCapacity is negative`() {
        assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(-1f, 50f)
        }
    }

    @Test
    fun `should throw if storageCapacity is lower than containerCapacity`() {
        assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(10f, 9.9f)
        }
    }

    @Test
    fun `should add the amount of cereal to the container using the addCereal function`() {
        val storageTest = CerealStorageImpl(10f, 100f)
        assertEquals(0f, storageTest.addCereal(Cereal.RICE, 2f))
    }

    @Test
    fun `should add more cereal than the maximum capacity to the container using the addCereal function`() {
        val storageTest = CerealStorageImpl(10f, 100f)
        assertEquals(2f, storageTest.addCereal(Cereal.RICE, 12f))
    }

    @Test
    fun `you should add a quantity of cereal equal to the maximum capacity to the container using the addCereal function`() {
        val storageTest = CerealStorageImpl(10f, 100f)
        assertEquals(0f, storageTest.addCereal(Cereal.RICE, 10f))
    }

    @Test
    fun `should throw an error when using the addCereal function with negative values`() {
        val storageTest = CerealStorageImpl(10f, 100f)
        assertThrows(IllegalArgumentException::class.java) {
            storageTest.addCereal(Cereal.RICE, -2f)
        }
    }


    @Test
    fun `should return the amount of cereal received`() {
        val storageTest = CerealStorageImpl(10f, 100f)
        storageTest.addCereal(Cereal.RICE, 2f)
        assertEquals(2f, storageTest.getCereal(Cereal.RICE, 2f))
    }

    @Test
    fun `should return the amount the remainder of cereal `() {
        val storageTest = CerealStorageImpl(10f, 100f)
        storageTest.addCereal(Cereal.RICE, 5f)
        assertEquals(5f, storageTest.getCereal(Cereal.RICE, 7f))
    }

    @Test
    fun `should throw an error when using the getCereal function with negative values`() {
        val storageTest = CerealStorageImpl(10f, 100f)
        storageTest.addCereal(Cereal.RICE, 2f)
        assertThrows(IllegalArgumentException::class.java) {
            storageTest.getCereal(Cereal.RICE, -2f)
        }
    }

    @Test
    fun removeContainer() {
    }

    @Test
    fun getAmount() {
    }

    @Test
    fun `should return the amount of cereal that the container can hold, taking into account its current fullness`() {
        val storageTest = CerealStorageImpl(10f, 100f)
        storageTest.addCereal(Cereal.RICE, 2f)
        assertEquals(8f, storageTest.getSpace(Cereal.RICE))
    }

    @Test
    fun `must return the amount of cereal that is not in stock that the container can hold, taking into account its current filling`() {
        val storageTest = CerealStorageImpl(10f, 100f)
        assertEquals(10f, storageTest.getSpace(Cereal.RICE))
    }

    @Test
    fun `should return a string representation of a single container storage`() {
        val storageTest = CerealStorageImpl(10f, 100f)
        storageTest.addCereal(Cereal.RICE, 2.4f)
        assertEquals("RICE: 2.4" , storageTest.toString())
    }

    @Test
    fun `should return a string representation of the store`() {
        val storageTest = CerealStorageImpl(10f, 100f)
        storageTest.addCereal(Cereal.RICE, 2f)
        storageTest.addCereal(Cereal.BULGUR, 4.5f)
        assertEquals("RICE: 2.0\nBULGUR: 4.5" , storageTest.toString())
    }

}