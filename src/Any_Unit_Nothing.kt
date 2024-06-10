fun main(args:Array<String>){

    // Any, Unit, Nothing

    // Any: Every type in Kotlin except null
    val anyNumber: Any = 42
    val anyString: Any = "String"

    // Unit: Like void in Java

    // Nothing: fun is never completes
    // return nothing, do nothing
}

fun add(): Unit{
    val sum = 2+5
    println(sum)
    // return nothing just printing a value
}

fun doNothing(): Nothing{
    while (true) {

    }
}