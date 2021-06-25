fun main(){
    val nullableList = listOf<String?>("a", null, null, "b")
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList) // [a, b]
}