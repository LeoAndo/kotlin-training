fun main(args: Array<String>) {
    payMoney(500) // これだと通貨がわからない.
    payMoney(Cents(200))
    payMoney(Cents2(100))
}

private fun payMoney(price: Int){
    println("payMoney: $price")
}

private fun payMoney(price: Cents){
    println("payMoney: ${price.amount}")
}

private fun payMoney(price: Cents2){
    println("payMoney: ${price.amount}")
}