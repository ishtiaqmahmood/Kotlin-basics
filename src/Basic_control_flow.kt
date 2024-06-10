fun main(args:Array<String>) {

    // Basic Control Flow

    // 1. Comparison Operators (==, !=, >, >=, <, <=, !)
    val one = 1
    val two = 2

    var compare = (one == two) // ("==" -> equal equal ) one is not equal to two, so it returns false
    compare = (one != two) // ("!=" -> not equal) one is not equal to two, so it returns true
    compare = !(one == two) // ("!" -> not) one is not equal to two, so it returns false and then !false return true
    compare = one > two // one is not greater than two, so it returns false
    compare = !(one > two) // one is not greater than two, so it returns false, then !false returns true
    compare = one >= two // one is not greater than or equal to  two, so it returns false
    compare = !(one >= two) // one is not greater than or equal to two, so it returns false, then !false returns true
    compare = one < two // one is smaller than two, so it returns true
    compare = !(one < two) // one is smaller than two, so it returns true, then !true returns false
    compare = one <= two // one is not greater than or equal to  two, so it returns true
    compare = !(one <= two) // one is not greater than or equal to two, so it returns true, then !true returns false

    // 2. Logic Operators (AND:: && , OR:: ||)

    compare = true && true // it returns true
    compare = true && false // it returns false
    compare = false && false // it returns true
    compare = false && true // it returns false

    compare = true || true // it returns true
    compare = true || false // it returns true
    compare = false || false // it returns false

    // 3. String Equality

    val x = "Kotlin"
    val y = "Java"
    var z = (x == y) // it returns false

    z = (x > y) // it returns true

    val k = 'a'
    val l = 'b'

    z = (k > l) // it returns false

    println(z)

}