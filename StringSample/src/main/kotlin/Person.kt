data class Person(
    val name: String,
    val address: String,
    val photo: String
)
const val prefix = "prefix-foo"
const val suffix = "suffix-bar"
const val delimit = "__"
val persons = buildList<Person> {
    repeat(1) {
        add(
            Person(
                name = "${delimit}Yam${delimit}ada${delimit}",
                address = "${prefix}Tokyo",
                photo = "photoUrl${suffix}",
            )
        )
    }
}