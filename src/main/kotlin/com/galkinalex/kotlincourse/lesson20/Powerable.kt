package com.galkinalex.kotlincourse.lesson20

interface Powerable {   // интерфейсы предпочтительно называть с суффиксом able
    fun powerOn()  // реализация в интерфейсе не нужна, как правило т.е. без {}

    fun powerOff()
}