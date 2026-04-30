fun main() {
    // Pairs and Triples are simple ways to group 2 or 3 values together.

    // --- Pairs (x, y) ---

    // Manual type declaration
    val coordinates: Pair<Int, Int> = Pair(4, 6)

    // Type inference
    val coordinates1 = Pair(3.234, 7)

    // Using the 'to' operator
    val coordinates2 = 3 to 6

    println("Pair 2 - X: ${coordinates2.first}, Y: ${coordinates2.second}")

    // --- Triples (x, y, z) ---

    // Manual type declaration
    val coordinates3: Triple<Int, Int, Int> = Triple(1, 4, 6)

    // Type inference
    val coordinates4 = Triple(3, 5.678, 8.79)

    println("Triple 4 - X: ${coordinates4.first}, Y: ${coordinates4.second}, Z: ${coordinates4.third}")
}
