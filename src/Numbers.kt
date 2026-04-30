fun main() {
    // Kotlin provides several built-in types that represent numbers.

    // Byte: 8-bit signed integer (-128 to 127)
    val a: Byte = 100

    // Short: 16-bit signed integer (-32,768 to 32,767)
    val b: Short = 1100

    // Int: 32-bit signed integer (-2^31 to 2^31 - 1)
    val c: Int = 100000

    // Long: 64-bit signed integer (-2^63 to 2^63 - 1)
    val d: Long = 10000000L

    // Float: 32-bit single-precision floating point
    val e: Float = 12.34F

    // Double: 64-bit double-precision floating point
    val f: Double = 12.3454344233133

    // Kotlin automatically handles type conversion in expressions to the highest precision type
    val sum = a + b + c + d // Result is Long
    println("Sum of integers: $sum")

    val sub = d - f // Result is Double
    println("Subtraction with double: $sub")
}
