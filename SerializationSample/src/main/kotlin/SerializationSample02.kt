import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main(args: Array<String>) {
    val namedColor = NamedColor(color = Color(0), name = "black")
    val jsonString = Json.encodeToString(namedColor)
    println(jsonString)

    val obj = Json.decodeFromString<NamedColor>(jsonString)
    println(obj)
}

@Serializable
data class NamedColor(val color: Color, val name: String)

@Serializable
@JvmInline
value class Color(val rgb: Int)