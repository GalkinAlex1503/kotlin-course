package com.galkinalex.kotlincourse.lesson22.homework.extensions

fun  Number.within(other: Double , deviation: Double ): Boolean {
    return   (this.toDouble() - other) <= deviation
}