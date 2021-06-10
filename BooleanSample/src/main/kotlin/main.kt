fun main(args: Array<String>) {
    testBoolean_kotlin_1_4()
    toBooleanStrict()
    toBooleanStrictOrNull()
}

fun toBooleanStrictOrNull() {
    println("=============toBooleanStrictOrNull-START============")
    println("TRUE".toBooleanStrictOrNull())
    println("FALSE".toBooleanStrictOrNull())
    println("true".toBooleanStrictOrNull())
    println("false".toBooleanStrictOrNull())
    println("=============toBooleanStrictOrNull-END============")
}

fun toBooleanStrict() {
    println("=============toBooleanStrict-START============")
    runCatching {
        println("TRUE".toBooleanStrict())
    }.onFailure { println(it.localizedMessage) }
    runCatching {
        println("FALSE".toBooleanStrict())
    }.onFailure { println(it.localizedMessage) }
    println("true".toBooleanStrict())
    println("false".toBooleanStrict())
    println("=============toBooleanStrict-END============")
}

fun testBoolean_kotlin_1_4() {
    println("=============testBoolean_kotlin_1_4-START============")

    println("TRUE".toBoolean())
    println("false".toBoolean())
    println("tRuE".toBoolean())
    println("1".toBoolean())
    println(null.toBoolean())
    println("=============testBoolean_kotlin_1_4-END============")
}
