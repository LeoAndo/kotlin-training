// defaultは、LazyThreadSafetyMode.SYNCHRONIZED
/*
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}
*/
val lazyValue: String by lazy(LazyThreadSafetyMode.NONE) {
    println("computed!")
    "Hello"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
}
/**
 * computed!
 * Hello
 * Hello
 */