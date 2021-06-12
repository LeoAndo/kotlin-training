import Utils.safeApiCall
import java.util.*

fun main(args: Array<String>) {
    print("input number: ")
    val scan = Scanner(System.`in`)
    val response = safeApiCall(onAction = { scan.nextInt() })
    when (response) {
        is Success -> print("success: ${response.data}")
        InputMismatchError -> print("input mismatch error!")
        is Failure -> print(response.exception.localizedMessage)
    }
    scan.close()
}