package main.kotlin

// Function
fun HelloWorld() {
    println("Hello Ges")
}

// Function Parameter
fun sayHello(firstname : String, lastname : String) {
    println("Hello $firstname $lastname")
}

// Function Default Parameter
fun hello(firstname : String, lastname : String = "") {
    println("Hello $firstname $lastname")
}

// Function Named Argument
fun FullName(firstname : String, middlename : String, lastname : String) {
    println("Hello $firstname $middlename $lastname")
}

// Unit Returning Function
fun printHello(name : String?) : Unit {
    if (name == null) {
        println("Hello Bro")
    } else {
        println("Hello $name")
    }
}

// Function Return Type
fun sum(a : Int, b : Int) : Int {
    val total = a + b
    return total
}

// Single Expression Functio
fun double(a : Int) : Int = a * 2

fun hi(name : String) : Unit = println("Hi $name")

// Function Varargs Parameter
fun finalValue(name : String, vararg values : Int) {
    var total = 0.0
    for (value in values) {
        total += value
    }
    total /= values.size
    println("Final Value $name = $total")
}

// Extension Function
fun String.hello() : String {
    return "Hello $this"
}

// Function Infix Notation
infix fun String.to(type : String) : String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

// Function Main
fun main() {
    HelloWorld()
    sayHello("Eko", "Khannedy")
    hello("Eko")
    FullName(firstname = "Eko", lastname = "Khannedy", middlename = "Kurniawan")

    printHello("Eko")

    println(sum(10, 10))
    println(double(10))
    hi("Eko")
    finalValue("Eko", 10)
    val name : String = "Eko"
    val hello : String = name.hello()
    println(hello)

    val result : String = "Eko" to "UP"

//    Function Scope
    fun sayHola(name : String) : Unit {
        println("Hello $name")
    }

    sayHola("Budi")

}