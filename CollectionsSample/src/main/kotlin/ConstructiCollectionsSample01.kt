fun main() {
    val sourceList = listOf("a","b")
    val copyList = sourceList.toMutableList() // sourceListと別インスタンスを参照している
    copyList.add("c")
    println("sourceList size: ${sourceList.size}")
    println("copyList size: ${copyList.size}")


    val sourceList2 = mutableListOf("a","b")
    val referenceList = sourceList2 // sourceList2と同一インスタンスを参照している
    val filterdList = sourceList2.filter{ it == "a"} // sourceListと別インスタンスを参照している
    sourceList2.add("c")
    println("sourceList2 size: ${sourceList2.size}")
    println("referenceList size: ${referenceList.size}")
    println("filterdList size: ${filterdList.size}")
}