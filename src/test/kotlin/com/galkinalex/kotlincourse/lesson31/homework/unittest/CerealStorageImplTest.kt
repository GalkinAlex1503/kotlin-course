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
    fun getCereal() {
    }

    @Test
    fun removeContainer() {
    }

    @Test
    fun getAmount() {
    }

    @Test
    fun getSpace() {
    }

    @Test
    fun testToString() {
    }

    @Test
    fun getContainerCapacity() {
    }

    @Test
    fun getStorageCapacity() {
    }
}