fun main() {
    val user = User2(mapOf(
        "name" to "John Doe",
        "age"  to 25))
    println(user.name)
    println(user.age)
}

class User2(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}