fun main() {
    val user = User("foo", 10) // data classで定義
    val user2 = User2("bar", 20) // classで定義
    val user3 = User("bar", 30) // data classで定義
    val user4 = User("foo", 10) // data classで定義
    val user5 = User2("bar", 20) // classで定義
    val person = Person() // data classで定義

    println("....equals-START....")
    // println("user.equals(user2): ${user.equals(user2)}") // Operator '==' cannot be applied to 'User' and 'User2'
    println("user.equals(user3): ${user.equals(user3)}")
    println("user.equals(user4): ${user.equals(user4)}")
    // println("user.equals(person): ${user.equals(person)}") // Operator '==' cannot be applied to 'User' and 'Person'
    println("user2.equals(user5): ${user2.equals(user5)}")
    println("....equals-END....")

    println("")

    println("....toString-START....")
    println("from data class: $user")
    println("from class: $user2")
    println("....toString-END....")

    println("")

    println("....compornentN-START....")
    val name = user.component1()
    val age = user.component2()
    println("name: $name, age: $age")
    println("....compornentN-END....")

    println("")

    println("....copy-START....")
    val copyUser = user.copy()
    val olderUser = user.copy(age=25)
    println("copyUser $copyUser")
    println("olderUser $olderUser")

    // copyで作られたオブジェクトはコピー元とオブジェクトの参照先は別
    println("${user === copyUser}" )
    println("....copy-END....")
}

class User2(val name: String, val age: Int)

data class User(val name: String, val age: Int)

data class Person(val name: String = "foo") {
    val age: Int = 10 // option
}