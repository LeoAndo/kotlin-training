import java.lang.Exception

sealed interface Response<out T>
data class Success<out T>(val data: T): Response<T>
object InputMismatchError: Response<Nothing>
data class Failure<out T>(val exception: Exception): Response<T>