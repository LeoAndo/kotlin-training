fun main(args: Array<String>) {
    testToIntOrNull()
}

fun testToIntOrNull() {
    val result1 = "1".toIntOrNull()
    println(result1)
    val result2 = "abc".toIntOrNull() // parse error
    print(result2)
}
