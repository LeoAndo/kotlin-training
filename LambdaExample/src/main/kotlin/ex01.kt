import kotlin.math.pow

fun main() {
    val func: (Double) -> Double = { x -> x.pow(2.0) }
    println(func.invoke(10.0))
    println(func(10.0))
}