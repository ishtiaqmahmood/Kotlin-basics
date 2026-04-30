fun main() {
    // Strings in Kotlin are sequences of characters.

    val a: String = "Hello"   // Immutable string (val)
    var b: String = "Gatling" // Mutable string reference (var)
    b = "John"

    // String concatenation
    val c: String = a + " " + b
    println("Concatenated String: $c")

    // String templates
    println("Using templates: a -> $a, b -> $b")

    val d: Int = 10
    val e: Int = 20

    // When adding a number to a string, the number is converted to a string.
    println(c + d + e) // Results in "Hello John1020"
}
