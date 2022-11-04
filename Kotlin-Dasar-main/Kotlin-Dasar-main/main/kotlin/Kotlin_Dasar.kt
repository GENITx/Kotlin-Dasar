package main.kotlin

fun main() {

    val kotlin = "🙂"
    println(kotlin)

//    Integer Number
    var age : Byte = 3_0
    var height : Int = 1_7_0
    var distance : Short = 2_0_0_0
    var balance : Long = 100_000_000L

//    Floating Point Number
    var value : Float = 98.98F
    var radius : Double = 2342342343.54535

//    Literals
    var decimalLiteral : Int = 100
    var hexadecimalLiteral : Int = 0xA1 // 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, 10, 11, 12, ...
    var binaryLiteral : Int = 0b1001 // 1001 = 2^0 + 2^3 = 1 + 8 = 9

//    Conversion
    var number : Int = 100

    var byte : Byte = number.toByte()
    var short : Short = number.toShort()
    var int : Int = number.toInt()
    var long : Long = number.toLong()
    var float : Float = number.toFloat()
    var double : Double = number.toDouble()

//     Character
    var char1 : Char = 'E'
    var char2 : Char = 'K'
    var char3 : Char = 'O'

//    Boolean
    var benar : Boolean = true
    var salah : Boolean = false

//    String
    var firstname : String = "Eko"
    var lastname : String = "Khannedy"
    var fullname : String = firstname + " " + lastname
    var address : String = """
   		Street Not Yet Done,
        Province Subang,
        Country Indonesia
   """

//    String Trim Margin
    var address1 : String = """
   		|Street Not Yet Done,
        |Province Subang
   """.trimMargin()
    var address2 : String = """
   		>Street Not Yet Done,
        >Province Subang
   """.trimMargin(">")

//    Nullable
    var name : String? = "Jumadi"
    name = null

//    Print

//    Integer Number
    println("==========")
    println(age)
    println(height)
    println(distance)
    println(balance)
    println("==========")

//    Floating Point Number
    println("==========")
    println(value)
    println(radius)
    println("==========")

//    Literals
    println("==========")
    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)
    println("==========")

//    Conversion
    println("==========")
    println("Original Num : " + number)
    println("Byte : " + byte)
    println("Short : " + short)
    println("Int : " + int)
    println("Long : " + long)
    println("Float : " + float)
    println("Double : " + double)
    println("==========")

//    Print the variable in one line
    println("==========")
    println("$number - $byte - $short - $int - $long - $float - $double")
    println("$char1 - $char2 - $char3")
    println("$benar - $salah")
    println("==========")

    println("==========")
    println("$firstname - $lastname - $fullname")
    println(address)
    println(address1)
    println(address2)
    println("==========")

//    String Template
    println("==========")
    println(fullname)
    println("$firstname $lastname")
    println("total $fullname char = ${fullname.length}")
    println("==========")

//    Nullable
    println("==========")
    println(name?.length)
    println("==========")

//    Note
//    val cant we rewrite (immutable)
//    var can we rewrite (mutable)
//    print without enter space
//    if we put the underscore( _ ) in the value of number, the program will not read it

}