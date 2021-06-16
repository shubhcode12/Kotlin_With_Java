package Kotlin

fun main() {
   // var objectCar = Car("audi", 15);
var defaultValueObject= Car(56,"nano");
//objectCar.printCarDetails()
}

//primary constructor with default args
class Car(var carName: String="simpleCar", var carMileage: Int=23) {
    fun printCarDetails() {
        println("car is $carName milage is $carMileage")
    }

    // initializer block, it is executed - with primary constructor
    init {
        println("init bloc Car Name = $carName")
        println("init block mileage = $carMileage")
    }
    constructor(ml:Int,carname:String,): this(carname,ml){
        println("2nd bloc Car Name = $carName")
    }

}