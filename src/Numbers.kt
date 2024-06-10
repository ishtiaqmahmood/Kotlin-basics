fun main(args:Array<String>) {
    
    // Number Data Types
    // Six Primitive Data Type

    // Byte: -128 to 127 (1 bit)
    // Short: -32768 to 32767 (2 bit)
    // Int: -2147483648 to 2147483647 (4 bit)
    // Long: -9 trillion to +9 trillion (8 bit)
    // Float: -3.40E+38 to +3.40E+38 (precision-6) (1 bit)
    // Double: -1.79E+308 to +1.79E+308 (precision-15) (2 bit)

    val a: Byte = 100;
    val b: Short = 1100;
    val c: Int = 100000;
    val d: Long = 10000000;
    val e: Float = 12.34F
    val f: Double = 12.3454344233133


    val sum = a + b + c + d; // Automatically change Type to the highest Source Type
    println(sum)

    val sub = d - f; // Double type
    println(sub)


}