fun main() {
    val x = 10
    if (x in 1..10) { // 範囲内
        println("fits in range")
    }

    if (x in 1..9) { // 範囲外
        println("fits in range")
    }
}