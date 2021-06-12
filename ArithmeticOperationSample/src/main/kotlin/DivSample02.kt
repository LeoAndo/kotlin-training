fun main() {
    val x = 5 / 2
    // println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2)

    // 浮動小数点型を返すには、引数の1つを浮動小数点型に明示的に変換する
    val y = 5 / 2.toDouble()
    println(y == 2.5)
}