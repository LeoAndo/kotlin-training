import kotlin.random.Random
import kotlin.random.nextUInt

fun main(args: Array<String>) {
    testUByte()
    testUInt()
    testUByteToString()
}

// 基数の定義(2 ~ 36まで)
private const val BINARY_NUMBER = 2 // 2進数
private const val HEX = 16 // 16進数
private const val NG_PATTERN_BASE_NUMBER = 37

fun testUByteToString() {
    println("=============testUByteToString-START=============")
    val data: UByte = 10u
    val data2: Byte = 10
    println("UByte HEX: ${data.toString(HEX)}")
    println("UByte BINARY: ${data.toString(BINARY_NUMBER)}")
    println("Byte HEX: ${data2.toString(HEX)}")
    println("Byte BINARY: ${data2.toString(BINARY_NUMBER)}")

    val ngPattern: Byte = 10
    runCatching {
        println("Byte HEX: ${ngPattern.toString(NG_PATTERN_BASE_NUMBER)}")
    }.onFailure {
        when (it) {
            is IllegalArgumentException -> {
                println(it.localizedMessage)
            }
        }
    }

    println("=============testUByteToString-END=============")
}

fun testUInt() {
    println("=============UInt-START=============")
//    val intData:Int = Integer.MAX_VALUE + 1;
//    println(intData)

    // リテラル
    val literal: UInt = 2147483648u // intのMAX値は 2147483647
    println("Literal: $literal")

    // 0から4294967295までの値を扱える
    val unsignedData: UInt = 2147483648.toUInt()
    val unsignedData2: UInt = 4294967295.toUInt()
    println(unsignedData)
    println(unsignedData2)

    val nextUInt: UInt = Random.nextUInt(from = 2u, until = 5u) // 2 - 4までのランダム値生成
    println(nextUInt)

    runCatching {
        val nextUIntNGPattern: UInt = Random.nextUInt(from = 2u, until = 2u)
        println(nextUIntNGPattern)
    }.onFailure {
        when (it) {
            is IllegalArgumentException -> {
                println(it.localizedMessage)
            }
        }
    }
    println("=============UInt-END=============")
}


fun testUByte() {
    println("=============UByte-START=============")
//    val byte:Byte = Byte.MAX_VALUE + 1;
//    println(byte)

    // リテラル
    val byte: UByte = 128u
    println("Literal: $byte")

    // 0から255までの値を扱える
    val unsignedData: UByte = 128.toUByte()
    val unsignedData2: UByte = 255.toUByte()
    println(unsignedData)
    println(unsignedData2)
    println("=============UByte-END=============")
}
