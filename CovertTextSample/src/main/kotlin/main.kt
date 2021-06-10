import java.util.*

fun main(args: Array<String>) {
    uppercaseTest()
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
