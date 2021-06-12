fun main() {
    // IntRangeを使った繰り返し.
    for (i in 1..3) {
        println(i)
    }

    // 6から-6までを2刻みで繰り返し処理する.
    for (i in 6 downTo -6 step 2) {
        println(i)
    }

    // IntRageの範囲チェック
    val x = IntRange(11, 20)
    when(x){
        11..20 -> {
            println("x is in the range")
        }
        else ->  println("none of the above")
    }
}