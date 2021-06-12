fun main() {
    val range: IntRange = IntRange(1, 10)
    for (x in range step 2) {
        print(x)
        print(" ")
    }
    println()

    for (x in 1..10 step 2) {
        print(x)
        print(" ")
    }
    println()

    for (x in 9 downTo 0 step 3) {
        print(x)
        print(" ")
    }
}