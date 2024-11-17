package com.galkinalex.kotlincourse.lesson22.homework.extensions

fun <T,R> Pair<T,R>.revert(): Pair<R,T> {
    return (this.second to this.first)
}