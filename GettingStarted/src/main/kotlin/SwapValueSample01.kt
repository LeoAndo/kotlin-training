fun main() {
    var a = 1
    var b = 2
    a = b.also {
        b = a
    } // itが戻り値として返却され、bの元の値がaに代入される.
    print("a: $a b: $b")
}