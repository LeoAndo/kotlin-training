fun main(args: Array<String>) {
    // original
    persons.forEach {
        println(it)
    }

    // remove func
    persons.map { it.name.removeSurrounding(delimit) }.forEach {
        println(it)
    }
    persons.map { it.address.removePrefix(prefix) }.forEach {
        println(it)
    }
    persons.map { it.photo.removeSuffix(suffix) }.forEach {
        println(it)
    }
}