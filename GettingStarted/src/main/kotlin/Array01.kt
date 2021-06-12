fun main(){
    // 繰り返しでリストのindexを取りたい時
    val array = arrayOf("a", "b", "c")
    for (i in array.indices) {
        println(array[i])
    }

    // 繰り返しでリストのindexとvalueを取りたい時
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}