package main.kotlin

//    Method References 1
fun toUpper(value: String) = value.toUpperCase()

//Lambda Expression di Variable
fun  main() {
//     membuat lambda
    val lambdaName : (String) -> String = {
        value : String -> value.toUpperCase()
    }

//    It
    val lambdaName1 : (String) -> String = {
        it.toUpperCase()
    }

//    Method References 2
    val lambdaName2 : (String) -> String = ::toUpper

//    mengeksekusi lambda
    val name = lambdaName("Eko")
    val name1 = lambdaName1("Eko")
    val name2 = lambdaName2("Eko")
    println(name)
    println(name1)
    println(name2)
}