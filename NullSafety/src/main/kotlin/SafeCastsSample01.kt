fun main() {
    val a: String = "Kotlin"

    val aInt: Int? = a as? Int
    println(aInt)
    val aStr: String? = a as? String
    println(aStr)
}