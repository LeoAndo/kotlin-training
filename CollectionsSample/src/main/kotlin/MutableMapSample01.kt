fun main() {
    val numbersMap = mutableMapOf(
        "key1" to 10,
        "key2" to 20,
        "key3" to 30,
        "key4" to 40,
    )
    print(numbersMap)

    println("==============================")

    numbersMap["key1"] = 99
    numbersMap.put("key5",50)
    print(numbersMap)
}

fun print(numbersMap: Map<String, Int>) {
    for ((key, value) in numbersMap) {
        println("key: ${key} , value : ${value}")
    }
}