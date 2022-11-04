package main.kotlin

fun main(){
    // val finalExam = 'A'
    // val passValues = arrayOf('A', 'B', 'C')
    // val name = "Eko"
    val examValue = 90

    // When Expression
    /*
    when (finalExam) {
        'A' -> println("Amajing")
        'B' -> println("Gud")
        'C' -> println("Hehe Not Bad")
        'D' -> println("Euh Cupu")
        'E' -> println("NT")
        else -> println("Ummm.... Gimana ya gk ada nilai")
    }
    */

    // When Expression Multiple Option
    /*
    when (finalExam) {
        'A', 'B', 'C' -> println("Lulus YEY")
        else -> {
            println("Euh Gagal")
        }
    }
    */

    // When Expression In
    /*
    when (finalExam) {
        in passValues -> println("LULUSSSSS")
        !in passValues -> println("Yah ngulang deh")
    }
    */

    // When Expression Is
    /*
    when (name) {
        is String -> println("This is fking string")
        !is String -> println("This isnt fking string")
    }
    */

    // When Tanda Variable
    when {
        examValue > 80 -> println("NC1")
        examValue > 60 -> println("Cupu")
        else -> println("NT")
    }

}