fun main(){
    // Hypothetical code, does not actually compile:
    val a: Int = 1 // A boxed Int (java.lang.Integer)
    val b: Long = a.toLong() // implicit conversion yields a boxed Long (java.lang.Long)
    print(b == a.toLong()) // 異なる整数値型の比較を行う場合は、明示的に型変換を行い比較しなくてはいけない.
}