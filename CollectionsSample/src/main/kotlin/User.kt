data class User(val name: String, val age: Int?)

val users1 = buildList {
    repeat(3) {
        add(User(name = "$it abc", age = it))
    }
}
