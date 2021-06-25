fun main() {
    val point = Point(10,20)
    println(-point) // Point(x=-10, y=-20)
    println(point) // Point(x=10, y=20)
}

data class Point(val x: Int, val y: Int)
operator fun Point.unaryMinus() = Point(-x, -y)