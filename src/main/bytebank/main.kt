import entities.clients.Address
import exceptions.InsufficientFunds
import functions.insufficientFundsTests

fun main() {

//    funcao1()

    insufficientFundsTests()

}


fun funcao1() {
    println("início funcao1")

    try {
        funcao2()
    } catch (e: InsufficientFunds) {
        println("InsufficientFunds find")
        e.printStackTrace()
    }

    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    for (i in 1..5) {
        println(i)

        val address = Address()
        throw InsufficientFunds("Insufficient Funds")
    }

    println("fim funcao2")
}

