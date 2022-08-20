import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/*
Call complete for quick: 5
Call complete for slow: 55
60
Complete 1011 ms
 */
fun main(args: Array<String>) = runBlocking {
    val time = measureTimeMillis {
        val slow: Deferred<Int> = async {
            var result = 0
            delay(1000) // simulate background work
            for (i in 1..10) {
                result += i
            }
            println("Call complete for slow: $result")
            result
        }

        val quick: Deferred<Int> = async {
            delay(100) // simulate background work
            println("Call complete for quick: 5")
            return@async 5
        }
        val result = slow.await() + quick.await()
        println(result)
    }
    println("Complete $time ms")
}