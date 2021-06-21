fun main() {
    println("Welcome to Bytebank")

    // val -> nao pode ser modificado
    val owner = "Matheus"
    val numberAccount = 1000
    var balance = 0.0

    balance = 100 + 2.0
    balance += 200

    println("Owner: $owner")
    println("Number Account: $numberAccount")
    println("Balance: $balance")


    balance -= 1000
    when {
        balance > 0.0 -> println("Account is positive")
        balance == 0.0 -> println("Account is neutral")
        else -> println("Account is negative")
    }


}