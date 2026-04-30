fun main() {
    // Type conversion in Kotlin must be explicit. There is no implicit widening conversion.

    var x: Int = 10
    var k: Int = 20
    var y: Double = 12.456
    var z: Byte = 40

    println("Before Type Conversion:")
    println("X (Int): $x, K (Int): $k, Y (Double): $y, Z (Byte): $z")

    // Explicit conversion using toType() functions
    k = z.toInt()
    y = x.toDouble()
    x = y.toInt() // Note: This truncates the decimal part

    println("\nAfter Type Conversion:")
    println("X (now Int from Double): $x")
    println("K (now Int from Byte): $k")
    println("Y (now Double from Int): $y")
}
