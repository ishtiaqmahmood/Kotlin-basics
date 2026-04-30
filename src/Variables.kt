fun main() {
    // Variables in Kotlin are declared with 'var' and their values can be changed.

    var number: Int = 10         // Int: Stores Integers
    var pi: Double = 3.14159     // Double: Stores double-precision floating-point numbers
    var k: Float = 5.19F         // Float: Stores single-precision floating-point numbers
    var name: String = "Gatling" // String: Stores a sequence of characters

    // Changing var values
    number = 11
    pi = 3.1416
    k = 4.67F
    name = "John"

    // String templates using $variableName
    println("Int: $number Double: $pi Float: $k String: $name")

    // String concatenation using '+'
    println("Int: " + number + " Double: " + pi + " Float: " + k + " String: " + name)
}
