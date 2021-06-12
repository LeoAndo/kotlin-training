fun main() {
    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr = IntArray(5)
    println(arr.joinToString())
    // e.g. initialise the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr2 = IntArray(5) { 42 }
    println(arr2.joinToString())
    // e.g. initialise the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    val arr3 = IntArray(5) { index -> index * 1 }
    println(arr3.joinToString())
}