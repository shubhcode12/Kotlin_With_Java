package Kotlin

fun main(arr: Array<String>) {
    //if else
    val a = 9
    val b = 80
    if (a > b) println(true) else println(false)

//if else as an expression
    var greater = if (a > b) a else b
    println(greater)

// when condition
    var age=89;
    when (age) {
        18 ->{ println("mature")}
        25 -> println("extra mature")
        10 -> println("kid")
        else -> println("ps go home")
    }

    //when as expresion
    var status=when (age) {
        18 ->"mature"
        25 -> "extra mature"
        10 -> "kid"
        else ->"ps go home"
    }
    println("status is $status ")

}