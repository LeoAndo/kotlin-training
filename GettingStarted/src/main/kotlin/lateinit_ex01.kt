fun main() {
    val person = Person3()
    // Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property foo has not been initialized
    person.foo.plus("San")
    println(person.foo)
}

class Person3 {
    lateinit var foo: String
}