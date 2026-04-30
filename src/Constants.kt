fun main() {
    // Constants in Kotlin are declared with 'val' and their values cannot be changed after assignment.

    val number: Int = 10         // Int: Stores Integers
    val pi: Double = 3.14159     // Double: Stores double-precision floating-point numbers
    val k: Float = 5.19F         // Float: Stores single-precision floating-point numbers
    val name: String = "Gatling" // String: Stores a sequence of characters

    // The following would cause a compilation error:
    // number = 11

    println("Int: $number Double: $pi Float: $k String: $name")
}
