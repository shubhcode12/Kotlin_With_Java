package Kotlin

fun main(){
    var obj= classesInKotlin(); //creating obj
    println(obj.value)

    var nestedObject = classesInKotlin.NestedClass()//no need of object of outer class, as the nested method by default static
    println(nestedObject.printNested())

    var innerClassObject = obj.InnerClass(); //inner class is non-static (by default) class so needs object of outer class tocreate its object
    innerClassObject.printinnervar()
}
class classesInKotlin {
    val value=89;

    class NestedClass{ //by default static
        val nestedvar=90;
        fun printNested(){
            println(" nested var is $nestedvar");
        }
    }
    inner class InnerClass{ //not static by default
        val innerVar=1000;
        fun printinnervar(){
            println("inner var is $innerVar")
        }
    }

}