package Kotlin

fun argsNoReturn(a: Int, b: Int) { //no return + arguement
    println(a + b)
}

fun returnWithArgument(a: Int, b: Int): Int { // return + arguement
    return a + b
}

fun noReturnNoArgument() { // no return + no arguement
    println("noargs no return")
}

fun returnWithoutArgument(): Int { // return + no arguement
    return 34
}