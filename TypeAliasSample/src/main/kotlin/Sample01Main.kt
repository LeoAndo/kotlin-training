fun main() {
    val foo = Foo(onClick = { i ->
        println("onClicked:  $i")
    }, onClick2 = { i, s ->
        println("onClicked2: $i , $s")
    })
    foo.bar()
}
/**
 * onClicked:  100
 * onClicked2: 200 , test2
 */

typealias OnClickListener<T> = (T) -> Unit
typealias OnClickListener2 = (Int, String) -> Unit

class Foo(
    private val onClick: OnClickListener<Int>,
    private val onClick2: OnClickListener2) {
    fun bar() {
        onClick(100)
        onClick2(200,"test2")
    }
}