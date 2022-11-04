package main.kotlin

//Factorial For Loop
fun FactorialLoop(value : Int) : Int {
    var result = 1
    for (i in value downTo 1) {
        result *= i
    }
    return result
}

//Factorial Recursive Function
fun FactorialRecursive(value: Int) : Int {
    return when (value) {
        1 -> 1
        else -> value * FactorialRecursive(value - 1)
    }
}

fun main() {
    println(FactorialLoop(3))
    println(FactorialRecursive(8))
}