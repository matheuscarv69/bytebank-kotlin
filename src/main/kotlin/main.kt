fun main() {
    println("Welcome to Bytebank")

    val accountMatheus = Account()
    accountMatheus.owner = "Matheus"
    accountMatheus.numberAccount = 1000
    accountMatheus.balance = 0.0

    println(
        "Account Owner: ${accountMatheus.owner}," +
                " Number: ${accountMatheus.numberAccount}, Balance: ${accountMatheus.balance}"
    )

    val accountFran = Account()
    accountFran.owner = "Fran"
    accountFran.numberAccount = 2000
    accountFran.balance = 1550.0

    println(
        "Account Owner: ${accountFran.owner}," +
                " Number: ${accountFran.numberAccount}, Balance: ${accountFran.balance}"
    )

    accountMatheus.deposit(50.0)
    printAccountInformation(accountMatheus, "Deposit", 50.0)

    accountFran.deposit(100.0)
    printAccountInformation(accountFran, "Deposit", 100.0)

    accountMatheus.withdraw(100.0)
    printAccountInformation(accountMatheus, "Withdraw", 100.0)

    accountFran.withdraw(1000.0)
    printAccountInformation(accountFran, "Withdraw", 1000.0)

    accountFran.transfer(accountMatheus, 590.0)
    printAccountInformation(accountFran, "Transfer", 590.0)
    printAccountInformation(accountMatheus, "Receive", 590.0)
}

fun printAccountInformation(accountMatheus: Account, operation: String, value: Double) {
    println()
    println()
    println("$operation $ $value in ${accountMatheus.owner}' Account ")
    println("Account Owner: ${accountMatheus.owner}, Balance: ${accountMatheus.balance}")
}

class Account {

    var owner = ""
    var numberAccount = 0
    var balance = 0.0

    fun deposit(balance: Double) {
        if (balance == 0.0) {
            println("The value informed is zero")
        }
        this.balance += balance
    }

    fun withdraw(value: Double) {
        when {
            this.balance < 0.0 -> {
                println()
                println("Your balance is negative $ ${this.balance}")
                return
            }
            this.balance == 0.0 -> {
                println()
                println("Your balance is empty $ ${this.balance}")
                return
            }
            this.balance < value -> {
                println()
                println("${this.owner}, the value informed is greater than the available $ ${this.balance}")
                return
            }
        }

        this.balance -= value
    }

    fun transfer(accountDestination: Account, value: Double) {
        when {
            this.balance < 0.0 -> {
                println()
                println("Your balance is negative $ ${this.balance}")
                return
            }
            this.balance == 0.0 -> {
                println()
                println("Your balance is empty $ ${this.balance}")
            }
        }
        this.balance -= value;
        accountDestination.deposit(value)
    }

}


fun copyAndReferenciesTests() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Account()
    contaJoao.owner = "João"
    var contaMaria = Account()
    contaMaria.owner = "Maria"
    contaJoao.owner = "João"

    println("owner conta joao: ${contaJoao.owner}")
    println("owner conta maria: ${contaMaria.owner}")

    println(contaJoao)
    println(contaMaria)
}


fun loopingsTest() {
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
    while (i < 5) {
        println("========================")
        // val -> nao pode ser modificado
        val owner = "Matheus $i"
        val numberAccount = 1000 + i
        var balance = i + 10.0

        println("Owner: $owner")
        println("Number Account: $numberAccount")
        println("Balance: $balance")
        println()

        if (i == 3) {
            break
        }

        i++
    }

    var j = 0
    do {
        j++
        println("Do while running $j++")
    } while (j < 5)
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