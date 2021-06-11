fun main() {
    val listWithNulls: List<String?> = listOf("Kotlin", null, "Swift")
    for (element in listWithNulls) {
        element?.let { println(it) }
    }
}