fun main() {
    println("Welcome to Bytebank")

    // for usando range
    println("For Tradicional com Range")
    for (i in 1..5) {
        println("========================")
        // val -> nao pode ser modificado
        val owner = "Matheus $i"
        val numberAccount = 1000 + i
        var balance = i + 10.0

        println("Owner: $owner")
        println("Number Account: $numberAccount")
        println("Balance: $balance")
        println()
    }

    // for decrementando de 5 ate 1
    println("For com DownTo")
    for (i in 5 downTo 1) {
        println("========================")
        // val -> nao pode ser modificado
        val owner = "Matheus $i"
        val numberAccount = 1000 + i
        var balance = i + 10.0

        println("Owner: $owner")
        println("Number Account: $numberAccount")
        println("Balance: $balance")
        println()

    }

    // for decrementando de 5 ate 1 com saltos de X numeros
    println("For com DownTo e Steps")
    for (i in 5 downTo 1 step 2) {
        println("========================")
        // val -> nao pode ser modificado
        val owner = "Matheus $i"
        val numberAccount = 1000 + i
        var balance = i + 10.0

        println("Owner: $owner")
        println("Number Account: $numberAccount")
        println("Balance: $balance")
        println()

    }

    println("While")
    var i = 0
    while (i < 5){
        println("========================")
        // val -> nao pode ser modificado
        val owner = "Matheus $i"
        val numberAccount = 1000 + i
        var balance = i + 10.0

        println("Owner: $owner")
        println("Number Account: $numberAccount")
        println("Balance: $balance")
        println()

        if(i == 3){
            break
        }

        i++
    }

    var j = 0
    do {
        j++
        println("Do while running $j++")
    }while (j < 5)


//    balance -= 1000
//    conditionalsTest(balance)

}

/**
 * Funcao para testar os condicionais do kotlin
 * */
fun conditionalsTest(balance: Double) {

//    if(balance > 0.0){
//        println("Account is positive")
//    } else if (balance == 0.0){
//        println("Account is neutral")
//    } else {
//        println("Account is negative")
//    }

    when {
        balance > 0.0 -> println("Account is positive")
        balance == 0.0 -> println("Account is neutral")
        else -> println("Account is negative")
    }
}