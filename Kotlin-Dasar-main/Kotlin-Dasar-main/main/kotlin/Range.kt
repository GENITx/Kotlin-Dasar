package main.kotlin

fun main(){

    // range

    val range = 1..100

    // reverse

    // val range = 1000 downTo 1

    // range with step

    // val range1 = 1..100 step 2
    // val range2 = 1000 downTo 1 step 5

    /*

    Operasi                             Keterangan
    count()                 Mendapatkan total data di range
    contains(value)         Mengecek apakah terdapat value tersebut
    first                   Mendapatkan nilai pertama
    last                    Mendapatkan nilai terakhir
    step                    Mendapatkan nilai tiap kenaikan

    */

    println(range.count())
    println(range.contains(2))
    println(range.first)
    println(range.last)
    println(range.step)

}