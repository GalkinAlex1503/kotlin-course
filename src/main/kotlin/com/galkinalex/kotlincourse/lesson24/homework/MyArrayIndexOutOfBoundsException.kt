package com.galkinalex.kotlincourse.lesson24.homework

class MyArrayIndexOutOfBoundsException(
    cause: ArrayIndexOutOfBoundsException
) : RuntimeException(
    "my message throw",
    cause
)