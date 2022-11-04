package main.kotlin

fun  main(){
//    Return If
    fun sayHello(name : String = "") : String {
        return if (name == "") {
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }
    sayHello("Eko")

//    Return When
    fun sayHola(name : String = "") : String {
    return when (name) {
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}
    sayHola("Budi")

}