
import kotlin.random.Random
import kotlin.random.nextUBytes
import kotlin.random.nextUInt

fun main(args: Array<String>) {
    testUByte()
    testUInt()
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

    val nextUInt:UInt = Random.nextUInt(from = 2u, until = 5u) // 2 - 4までのランダム値生成
    println(nextUInt)
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

    @OptIn(ExperimentalUnsignedTypes::class)
    val nextUBytes:UByteArray = Random.nextUBytes(3)
    println(nextUBytes)

    println("=============UByte-END=============")
}
