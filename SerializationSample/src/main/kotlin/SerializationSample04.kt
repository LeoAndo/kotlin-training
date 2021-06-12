import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main(args: Array<String>) {
    val user = User2(name = "Leo", age = 10)
    val jsonString = Json.encodeToString(user)
    println(jsonString)

    val obj = Json.decodeFromString<User2>(jsonString)
    println(obj)
}

@Serializable
data class User2(@SerialName("namae") val name: String, val age: Int)