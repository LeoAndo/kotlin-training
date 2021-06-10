import java.util.*

fun main(args: Array<String>) {
    uppercaseTest()
    convertCharToUnicode()
    checkCharValue()
}

fun checkCharValue() {
    println("============checkCharValue-START===========")
    println("'7'.isDigit(): "+ '7'.isDigit())
    println("'A'.isLetter(): " + 'A'.isLetter())
    println("'!'.isLetterOrDigit(): " + '!'.isLetterOrDigit())
    println("'B'.isLowerCase(): " + 'B'.isLowerCase())
    println("'C'.isUpperCase(): " + 'C'.isUpperCase())
    println("'f'.isTitleCase(): " + 'f'.isTitleCase())
    println("'.'.isISOControl(): " + '.'.isISOControl())
    println("============checkCharValue-END===========")
}

private const val UNICODE_NUM_ZERO = 51 // '1'のunicode 10進表記
private const val BASE_NUMBER = 16 // 16進数
fun convertCharToUnicode() {
    println("===============convertCharToUnicode-START==============")
    val char = '!'
    val number = 'A'
    println("char.code is : ${char.code}")
    println("number.code is : ${number.code}")
    println("Char(UNICODE_NUM_ZERO) is:  ${Char(UNICODE_NUM_ZERO)}")

    runCatching {
        println("char.digitToInt() is: " + char.digitToInt())
    }.onFailure { if (it is IllegalArgumentException) println(it.localizedMessage) }
    runCatching {
        println("char.digitToInt(16) is: " + char.digitToInt(BASE_NUMBER))
    }.onFailure { if (it is IllegalArgumentException) println(it.localizedMessage) }
    println("char.digitToIntOrNull() is: " + char.digitToIntOrNull())
    println("char.digitToIntOrNull(16) is: " + char.digitToIntOrNull(BASE_NUMBER))

    runCatching {
        println("number.digitToInt() is: " + number.digitToInt())
    }.onFailure { if (it is IllegalArgumentException) println(it.localizedMessage) }
    runCatching {
        println("number.digitToInt(16) is: " + number.digitToInt(BASE_NUMBER))
    }.onFailure { if (it is IllegalArgumentException) println(it.localizedMessage) }
    println("number.digitToIntOrNull() is: " + number.digitToIntOrNull())
    println("number.digitToIntOrNull(16) is: " + number.digitToIntOrNull(BASE_NUMBER))

    println("===============convertCharToUnicode-END==============")
}

fun uppercaseTest() {
    println("=========uppercaseTest-START=========")
    val upper = "Kotlin".uppercase()
    val lower = "KotLin".lowercase()
    val titlecase = 'ŉ'.titlecase()
    val titlecaseChar = 'ŉ'.titlecaseChar()
    val localeLanguage = "kotlin".uppercase(Locale.forLanguageTag("tr-TR"))
    println(upper)
    println(lower)
    println(titlecase)
    println(titlecaseChar)
    println(localeLanguage)
    println("=========uppercaseTest-END=========")
}
