fun main() {
    println(getLength("abc"))
    println(getLength(1))
}

private fun getLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}