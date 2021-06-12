import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

fun main(){
    val currentRelativePath: Path = Paths.get("")
    val filePath: String = currentRelativePath.toAbsolutePath().toString() + "/src/main/kotlin/ResourceManager.kt"

    val stream = Files.newInputStream(Paths.get(filePath))
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}