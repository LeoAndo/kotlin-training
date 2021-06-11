import java.lang.Exception
import java.util.*

object Utils {
     inline fun <T> safeApiCall(crossinline onAction: () -> T): Response<T> {
        return try {
            Success(onAction.invoke())
        } catch (ex: Exception) {
            return when(ex){
                is InputMismatchException -> InputMismatchError
                else -> Failure(ex)
            }
        }
    }
}