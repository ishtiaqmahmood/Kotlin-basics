fun main() {
    // Any, Unit, Nothing are special types in Kotlin.

    // Any: The root of the Kotlin type hierarchy. Every Kotlin class has Any as a superclass.
    val anyNumber: Any = 42
    val anyString: Any = "String"
    println("Any Number: $anyNumber, Any String: $anyString")

    add()
    // doNothing() // This would never complete
}

/**
 * Unit: The type with only one value: the Unit object.
 * This is equivalent to 'void' in Java.
 */
fun add(): Unit {
    val sum = 2 + 5
    println("Sum is: $sum")
    // 'return Unit' or just 'return' is optional
}

/**
 * Nothing: A type that has no values.
 * It is used to represent a value that never exists,
 * for example, if a function never completes.
 */
fun doNothing(): Nothing {
    while (true) {
        // Infinite loop
    }
}
