package main.kotlin

fun main(){

    val members : Array<String> = arrayOf("Eko", "Joko", "Budi")
    val values : Array<Byte> = arrayOf(100, 90, 50)
    val balances : Array<Int> = arrayOf(10_000, 20_000, 30_000)

    /*

    Operasi                     Keterangan
    size                Untuk mendapatkan panjang Array
    get(index)          Mendapat data di posisi index
    [index]             Mendapat data di posisi index
    set(index, value)   Mengubah data di posisi index
    [index] = value     Mengubah data di posisi index

    */

    val eko : String = members[0]
    val joko : String = members.get(1)
    val budi : String = members.get(2)

    members.set(0, "Amar")
    val amar : String = members[0]

    val names : Array<String?> = arrayOfNulls(5)
    names.set(0, "Eko")
    names.set(1, null)
    names.set(2, "Kurniawan")
    names.set(3, null)
    names.set(4, "Khannedy")

    println(members[2])
    println(names[3])

}