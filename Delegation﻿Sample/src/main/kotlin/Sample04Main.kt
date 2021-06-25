import kotlin.properties.Delegates

fun main() {
    // default値は0にしてる
    // 戻り値:trueで変数の値をnewValueに更新できる.
    var max: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        newValue > oldValue
    }
    println(max)
    max = 10
    println(max)
    max = 5
    println(max)
    max = 20
    println(max)
}