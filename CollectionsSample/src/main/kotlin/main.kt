fun main(args: Array<String>) {
    testFirstNotNullOfOrNull_ver1_4_x()
    testFirstNotNullOfOrNull()
}

val users = listOf(
    User(name = "Michel", null),
    User(name = "Jordan", null),
    User(name = "Kobe", 20),
    User(name = "Bryant", 50),
)

fun testFirstNotNullOfOrNull_ver1_4_x() {
    println("=============testFirstNotNullOfOrNull_ver1_4_x-START============")
    val firstAge: Int? = users.mapNotNull { it.age }.firstOrNull()
    println(firstAge)
    println("=============testFirstNotNullOfOrNull_ver1_4_x-END============")
}

fun testFirstNotNullOfOrNull() {
    println("=============testFirstNotNullOfOrNull-START============")
    val firstAge: Int? = users.firstNotNullOfOrNull { it.age }
    println(firstAge)
    println("=============testFirstNotNullOfOrNull-END============")
}