fun main() {
    val ret = users1.shuffled()
    ret.forEach { println(it) }

    println("========sortedBy========")
    val ret2 = ret.sortedBy(User::age)
    ret2.forEach { println(it) }


    println("========partition-START========")
    val (ret3, ret4) = ret.partition { it.age!! < 2 }
    ret3.forEach { println(it) }
    println("================")
    ret4.forEach { println(it) }
    println("========partition-END========")
}