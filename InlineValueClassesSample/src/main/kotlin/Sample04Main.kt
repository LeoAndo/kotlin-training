fun asInline(f: Name) {}
fun <T> asGeneric(x: T) {}
fun asInterface(i: Printable) {}
fun asNullable(i: Name?) {}
fun <T> id(x: T): T = x

fun main() {
    val f = Name("Leo")

    asInline(f)    // unboxed: used as Name itself
    asGeneric(f)   // boxed: used as generic type T
    asInterface(f) // boxed: used as type Printable
    asNullable(f)  // boxed: used as Name?, which is different from Name

    // below, 'f' first is boxed (while being passed to 'id') and then unboxed (when returned from 'id')
    // In the end, 'c' contains unboxed representation (just "Leo"), as 'f'
    val c = id(f)
    print(c)
}