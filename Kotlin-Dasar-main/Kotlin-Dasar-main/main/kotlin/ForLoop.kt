package main.kotlin

fun main(){

    val names = arrayOf("Eko", "Kurniawan", "Khannedy")

    // For Array
    for (name in names) {
        println(name)
    }

    // For Range
    for (value in 0..10) {
        println(value)
    }

    for (value in 10 downTo 0 step 5) {
        println(value)
    }

}
