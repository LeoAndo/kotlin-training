fun main() {
    val person = Person1()
    println("surprising ${person.surprising}")
    println("surprising ${person.surprising}")
}

class Person1 {
    val surprising: Double
        get() {
            return Math.random()
        }
}