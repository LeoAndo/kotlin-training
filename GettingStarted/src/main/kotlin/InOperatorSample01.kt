fun main() {
    val emailsList = listOf("abc", "cba", "def")
    if ("abc" in emailsList) {
        println("abc exists.")
    } else if ("ab" in emailsList) {
        println("ab exists.")
    }
}