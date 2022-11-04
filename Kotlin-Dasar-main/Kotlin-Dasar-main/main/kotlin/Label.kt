package main.kotlin

//Return to Label
fun test(name : String, param : (String) -> Unit) : Unit = param(name)

fun main() {
//    Label
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            println("$i x $j = ${i*j}")
        }
    }

//    Break to Label
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            println("$i x $j = ${i*j}")
            if (j == 10) {
                break@loopI
            }
        }
    }

//    Continue to Label
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            println("$i x $j = ${i*j}")
            if (j == 5) {
                continue@loopI
            }
        }
    }

//    Return to Label
    test("eko") testLabel@ {
        if (it == "eko") {
            return@testLabel
        }
    }
    println("Eko")

}