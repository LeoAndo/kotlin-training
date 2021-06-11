fun main() {
    val numbersMap = mapOf(
        "key1" to 1,
        "key2" to 2,
        "key3" to 3,
        "key4" to 4,
        "key4" to 5,) // keyは必ず一意(Unique)

    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key1" in numbersMap) println("key1は存在する")
    if (1 in numbersMap.values) println("1の値は存在する")
}