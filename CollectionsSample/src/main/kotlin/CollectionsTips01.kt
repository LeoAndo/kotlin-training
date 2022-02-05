fun main() {
    val ret = users1.shuffled()
    ret.forEach { println(it) }

    println("================")
    val ret2 = ret.sortedBy(User::age)
    ret2.forEach { println(it) }
}