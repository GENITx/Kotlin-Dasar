package main.kotlin

fun main(){

    /*

    Unary Operator

    Operator            Keterangan
    ++                  a = a + 1
    --                  a = a - 1
    -                   Negative
    +                   Positive
    !                   Boolean kebalikan


    */

    /*

    Operator Perbandingan

    Operator            Keterangan
        >               Lebih Dari
        <               Kurang Dari
        >=              Lebih Dari Sama Dengan
        <=              Kurang Dari Sama Dengan
        ==              Sama Dengan
        !=              Tidak Sama Dengan


    */

    val a = 100
    val b = 200

    val result : Boolean = a > b

    /*

    Operator Logika

    Operator    Keterangan
    &&          Dan
    ||          Atau
    !           Kebalikan

    */

    val finalExam = 80
    val attendant = 75

    val passFinalExam = finalExam > 75
    val passAttendant = attendant > 80

    val pass = passFinalExam && passAttendant

}