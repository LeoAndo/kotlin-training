fun main(args: Array<String>) {
    val name = Name("kotlin")
    name.greetUppercase()
    name.greetLowercase()

    runCatching {
        val name2 = Name("")
        name2.greetUppercase()
        name2.greetLowercase()
    }.onFailure {
        when (it) {
            is IllegalArgumentException -> {
                print(it.localizedMessage)
            }
        }
    }
}