import kotlinx.coroutines.*

/*
0 I'm working
1 I'm working
2 I'm working
無限に続く.
 */
fun main(args: Array<String>) = runBlocking {
    val job: Job = launch { // coroutineは完了しない
        var i = 0
        while (true) {
            println("$i I'm working")
            i++
            // delay(10)
            Thread.sleep(10)
        }
    }
    delay(30)
    job.cancel()
}