import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun resourceDelegate(): ReadWriteProperty<Any?, Int> =
    object : ReadWriteProperty<Any?, Int> {
        var curValue = 0
        override fun getValue(thisRef: Any?, property: KProperty<*>): Int = curValue
        override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
            curValue = value
        }
    }

val readOnly: Int by resourceDelegate()  // ReadWriteProperty as val
var readWrite: Int by resourceDelegate()

fun main(){
    println(readOnly)
    println(readWrite)
    readWrite = 30
    println(readOnly)
    println(readWrite)
}
/**
 * 0
 * 0
 * 0
 * 30
 */