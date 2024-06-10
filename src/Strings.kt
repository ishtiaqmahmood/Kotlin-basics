fun main(args: Array<String>) {

    // Strings
    // Non-Primitive Data Types

    val a: String = "Hello" // Constant
    var b: String = "Gatling" // Changeable
    b = " John "

    val c: String = a + b // String concatenation

    println("String: " + c) // Using "+" or concatenation Symbol
    println("String: a-> $a, b-> $b"); // Using Sting Templates

    val d: Int = 10;
    val e: Int = 20;

    println(c+d+e) // d & e is converted to the string
}