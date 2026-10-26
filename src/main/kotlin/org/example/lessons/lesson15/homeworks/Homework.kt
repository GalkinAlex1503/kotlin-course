package org.example.org.example.lessons.lesson15.homeworks

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val ordinalNumbersSecond = listOf(
        "newfirst", "newsecond", "newthird", "newfourth", "newfifth",
        "newsixth", "newseventh", "neweighth", "newninth", "newtenth",
        "neweleventh", "newtwelfth", "newthirteenth"
    )

    val first = AddFirst()
    ordinalNumbers.forEach { first.addMaterial(it) }
    //   println(first.printContainer())
    first.addFirst("new")
    println("test 1 class")
    println(first.printContainer())
    first.extractMaterial()
    println()

    println("test 2 class")
    val second = TwoClass()
    ordinalNumbers.forEach { second.addMaterial(it) }
    second.mixTwoMethod(ordinalNumbersSecond)
    println(second.printContainer())
    second.extractMaterial()
    println()

    println("test 3 class")
    val third = ThirdClass()
    ordinalNumbers.forEach { third.addMaterial(it) }
    third.sortThirdMethod("newnewnew")
    println(third.printContainer())
    third.extractMaterial()
    println()

    println("test 4 class")
    val forth = ForthClass()
    val workMap = mapOf("1" to "one", "2" to "two", "2" to "three")
    forth.addForthMethod(workMap)
    println(forth.printContainer())
}