/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    val base1 = BaseImpl1("base")
    val base2 = BaseImpl2("base")
    Derived(base1).print()
    Derived(base2).print()
    println(Derived(base2).message)

    Derived2(base2).print()
    println(Derived2(base2).message)
}

interface Base {
    val message: String
    fun print()
}

class BaseImpl1(val x: String) : Base {
    override val message get() = "BaseImpl1: x = $x"
    override fun print() {
        println("BaseImpl1: ${x}")
    }
}
class BaseImpl2(val x: String) : Base {
    override val message get() = "BaseImpl2: x = $x"
    override fun print() {
        println("BaseImpl2: ${x}")
    }
}

class Derived(val base: Base) : Base by base
class Derived2(val base: Base) : Base by base {
    // delagate オブジェクトのメンバ変数、メソッドをoverrideできる.
    override val message get() = "Message of Derived"
    override fun print() {
        println("Derived2: override print!!")
    }
}