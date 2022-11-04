package main.kotlin

//Higher-Order Function
fun hello(value : String, transformer : (String) -> String) : String {
    return "Hello ${transformer(value)}"
}

fun main() {
    val upperTransformer = {
        value : String -> value.toUpperCase() //Kapital
    }

    val lowerTransformer = {
            value : String -> value.toLowerCase() //Kecil
    }

    println(hello("Eko", upperTransformer))
    println(hello("Eko", lowerTransformer))

//    Trailing Lambda
    val result1 = hello("Eko") {
        value : String -> value.toUpperCase()
    }

    val result2 = hello("Eko") {
        value : String -> value.toLowerCase()
    }

    println("$result1 $result2")

//    Anonymous Function
    val anonymousUpper = fun (value : String) : String {
        if (value.isBlank()) {
            return "ups"
        }
        return value.toUpperCase()
    }

    val result3 = hello("", anonymousUpper)
    println(result3)

//    Anonymous Function as Parameter
    val result4 = hello("Eko", fun (value : String) : String {
        if (value.isBlank()) {
            return "ups"
        }
        return value.toUpperCase()
    })

    println(result4)
}