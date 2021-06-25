import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("<no name>") {
            prop, old, new ->
        println("prop: ${prop}, old: ${old}, new: ${new}")
    }
}

fun main() {
    val user = User()
    user.name = "first"
    user.name = "second"
}