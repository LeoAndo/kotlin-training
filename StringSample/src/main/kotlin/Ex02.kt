fun main(args: Array<String>) {
    val str = ""

    // ifBlank / isEmpty を使おう！
    val ret = if (str.isBlank()) "default value" else str
    println(ret)
    val ret2 = str.ifBlank { "default value" }
    println(ret2)

    val ret3 = if (str.isEmpty()) "default value" else str
    println(ret)
    val ret4 = str.ifEmpty { "default value" }
    println(ret2)
}