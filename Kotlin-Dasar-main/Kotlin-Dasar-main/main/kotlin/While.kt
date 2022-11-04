package main.kotlin

fun main() {

    var i = 0

    // While
    while (i < 10) {
        println("While Loop")
        i++
    }

    // Do While
    do {
        println("Loop")
        i++
    } while (i < 10)

    // Break
    while (true) {
        println("Break Me")
        i++
        if (i > 1000) {
            break
        }
    }

    // Continue
    for (i in 1..1000) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }

}