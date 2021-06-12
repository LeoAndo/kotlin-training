fun main() {
    foo()
    foo2()
    foo3()
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // fooメソッドの呼び出し元まで戻る
        print(it)
    }
    println("ここまで処理は実行されない.")
}

fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // forEachまで戻る.
        print(it)
    }
    println()
    println("ここまで処理は実行される.")
}

fun foo3() {
    // runで loopラベル内の処理が実行される.
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop // loopラベルのところまで戻る.
            print(it)
        }
    }
    println()
    print("ここまで処理は実行される.")
}