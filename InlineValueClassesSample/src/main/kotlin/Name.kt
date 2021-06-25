@JvmInline
value class Name(private val s: String): Printable {
    init {
        // 条件式がfalseならIllegalArgumentExceptionがスローされる.
        require(s.isNotEmpty()) {
            "init error!!! "
        }
    }

    private val uppercase: String get() = s.uppercase()
    private val lowercase: String get() = s.lowercase()

    fun greetUppercase() {
        println("Hello $uppercase")
    }

    fun greetLowercase() {
        println("Hello $lowercase")
    }

    override fun prettyPrint(): String = "Let's $s"
}