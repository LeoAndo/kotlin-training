import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main(args: Array<String>) {
    val counter = BigCounter(counted = ULong.MAX_VALUE)
    val jsonString = Json.encodeToString(counter)
    println(jsonString)

    val obj = Json.decodeFromString<BigCounter>(jsonString)
    println(obj)
}

@Serializable
data class BigCounter(val counted: ULong)