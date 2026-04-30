fun main() {
    // Basic Control Flow

    // 1. Comparison Operators (==, !=, >, >=, <, <=, !)
    val one = 1
    val two = 2

    println("one == two: ${one == two}")   // false
    println("one != two: ${one != two}")   // true
    println("!(one == two): ${!(one == two)}") // true
    println("one > two: ${one > two}")     // false
    println("one < two: ${one < two}")     // true
    println("one >= two: ${one >= two}")   // false
    println("one <= two: ${one <= two}")   // true

    // 2. Logic Operators (AND: &&, OR: ||)
    println("true && false: ${true && false}") // false
    println("true || false: ${true || false}") // true

    // 3. String and Char Comparison
    val x = "Kotlin"
    val y = "Java"
    println("Kotlin > Java: ${x > y}") // true (lexicographical comparison)

    val k = 'a'
    val l = 'b'
    println("'a' > 'b': ${k > l}") // false
}
