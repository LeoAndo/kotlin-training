fun main() {
    val map = mapOf(Pair("a", 1), Pair("b", 2), Pair("c", 3))
    for ((k, v) in map) {
        println("key: $k value: $v")
    }
}