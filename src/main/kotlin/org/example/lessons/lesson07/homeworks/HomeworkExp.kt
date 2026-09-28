package org.example.org.example.lessons.lesson07.homeworks

fun main() {
    //Задача на вложенный цикл
    println("Задача на вложенный цикл")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println("")
    }

    sumNum(5)
    factorial(6)
    sumChet(8)
    drowS(6, 6)
    sumAll(10)
}

fun sumNum (arg: Int) {
    var sum = 0
    for (i in 1..arg) {
        sum += i
    }
    println(sum)
}

fun factorial (arg: Int) {
    var sum = 1
    var i = 0
    while (i++ in 1..arg) {
        sum *= i
    }
    println(sum)
}

fun sumChet (arg: Int) {
    var sum = 0
    var i = 0
    while (i++ in 2..arg step 2 )
        sum += i
    println(sum)
}

fun drowS (x: Int, y: Int) {
    for (i in 1..y) {
        for (j in 1..x) {
            if (i == 1 || i == y) {
                print(" * ")
            } else {
                if (j == 1 || j == x) {
                    print(" * ")
                }
                else print("   ")
            }
        }
        println("")
    }
}

fun sumAll (arg: Int) {
    var sumChet = 0
    var sumNeChet = 0
    for (i in 1..arg) {
        if (i % 2 == 0) {
            sumChet += i
        } else {
            sumNeChet += i
        }
    }
    println("${sumChet}  ${sumNeChet} ")

}