fun main() {
    val b: String? = null
    val foo: Int = if (b != null) b.length else -1 // ここのコードと
    println(foo)

    val bar = b?.length ?: -2 // ここのコードは同じ処理. (エルビス演算子を使ったやり方)
    println(bar)
}