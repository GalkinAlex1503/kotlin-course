package com.galkinalex.kotlincourse.lesson27

fun main() {
//   val list = mutableListOf(1, 2, 3, 4)

//    list.add(6)
//    println(list)

    //   val list1 = list.toList()

    val list2 = with(mutableListOf(1, 2, 3, 4)) {
        add(6)
        println(this)
        toList()
    }.size

//    val sb = StringBuilder()
//    sb.append("fbkadjbgk")
//    sb.append("SGKANSGOI")
//    sb.append("askjadgj")
//
//    val strLength = sb.length

    val sb = StringBuilder().run {
        append("fbkadjbgk", "adkgjdbgu")
        append("SGKANSGOI")
        append("askjadgj")
        length
    }

//    val list = arrayListOf<String>()
//    list.add("мама")
//    list.add("мыла")
//    list.add("раму")

    val list = arrayListOf<String>().also {
        it.add("мама")
        it.add("мыла")
        it.add("раму")
    }

    val string: String? = "aisjgbadgojn"
    string?.length

    println(string?.length)
    println(string?.isEmpty())
    println(string?.uppercase())

    string?.let {
        println(it.length)
        println(it.isEmpty())
        println(it.uppercase())
    }

}