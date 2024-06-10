import com.sun.jdi.IntegerType

fun main(args:Array<String>) {
    // Type Casting

    var x: Int = 10;
    var k: Int = 20;
    var y: Double = 12.456
    var z: Byte = 40;

    println("Before Type Casting: ")
    println("X: $x, K: $k, Y: $y")


    k = z.toInt();
    y = x.toDouble();
    x = y.toInt();

    println("After Type conversion: ")
    println("X: $x, K: $k, Y: $y")
}