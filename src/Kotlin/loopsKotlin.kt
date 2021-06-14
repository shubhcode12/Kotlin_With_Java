fun main() {


    //for loop increment
    for (i in 0..9) println("for loop iteration num=$i")
    //decrement
    for (i in 9 downTo 0) println("decrement for loop iteration num=$i")
    //stepping
    for (i in 0..9 step 2) println("for loop with step iteration num=$i")


    //while loop
    var j = 0
    while (j < 10) {
        println("while loop iteration=$j")
        j++
    }

    //do while loop
    var d = 0
    do {
        println(" do while loop iteration=$d")
        d++
    } while (d < 10)
}