import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf

@OptIn(ExperimentalSerializationApi::class)
fun main(args: Array<String>) {
    val project = Project(name = "SerializationSample", language = "Kotlin")
    val bytes = ProtoBuf.encodeToByteArray(project)
    val hex = ProtoBuf.encodeToHexString(project)
    println(bytes)
    println(hex)

    val obj = ProtoBuf.decodeFromByteArray<Project>(bytes)
    val obj2 = ProtoBuf.decodeFromHexString<Project>(hex)
    println(obj)
    println(obj2)
}

@Serializable
data class Project(val name: String, val language: String)