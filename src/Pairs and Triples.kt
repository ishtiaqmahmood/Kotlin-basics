import kotlin.reflect.typeOf

fun main(args:Array<String>) {

    // Pairs and Triples

    // Pairs (x, y)

    val coordinates: Pair<Int, Int> = Pair(4,6) // Manual Type declaration
    val coordinates_1 = Pair(3.234,7) // Type Interface (Automatic)
    val coordinates_2 = 3 to 6 // Using "to" operator

    println("X coordinates ${coordinates_2.first}")
    println("Y coordinates ${coordinates_2.second}")

    // Triples (x, y, z)

    val coordinates_3: Triple<Int,Int,Int> = Triple(1,4,6); // Manual Type declaration
    val coordinates_4 = Triple(3, 5.678,8.79) // Type Interface (Automatic)

    println("X1 coordinates ${coordinates_4.first}")
    println("Y1 coordinates ${coordinates_4.second}")
    println("Z1 coordinates ${coordinates_4.third}")

}