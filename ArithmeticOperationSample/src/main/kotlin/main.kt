fun main(args: Array<String>) {
    divKotlinVer1_4()
    testFloorDiv()
}

fun testFloorDiv() {
    println("===========testFloorDiv-START=============")
    println("5.floorDiv(3): " + 5.floorDiv(3))
    println("(-5).floorDiv(3) : " + (-5).floorDiv(3))

    val size = 2
    for(index in -3..4){
        println(index.mod(size))
    }
    println("===========testFloorDiv-END=============")
}

fun divKotlinVer1_4() {
    println("===========divKotlinVer1_4-START=============")
    println("5 / 3: " + 5 / 3)
    println("-5 / 3: " + -5 / 3)

    val size = 2
    for(index in -3..4) {
        println(index % size)
    }
    println("===========divKotlinVer1_4-END=============")
}
