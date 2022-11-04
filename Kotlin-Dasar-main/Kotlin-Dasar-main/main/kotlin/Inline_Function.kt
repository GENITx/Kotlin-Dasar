package main.kotlin

//Inline Function
inline fun hello(name : () -> String) : String {
    return "Hello ${name()}"
}

//Noinline
inline fun Hello(firstname : () -> String, noinline lastname : () -> String) : String {
    return "Hello ${firstname()} ${lastname()}"
}

fun main() {
    println(hello { "Eko" })
    println(hello { "Kurniawan"})
    println(Hello({"Eko"}, {"Khaneddy"}))
}