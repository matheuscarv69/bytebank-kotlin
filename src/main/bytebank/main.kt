import entities.account.CurrentAccount
import entities.clients.Address
import entities.clients.Client
import exceptions.InsufficientFunds

fun main() {

//    funcao1()

    val accountMatheus: CurrentAccount = CurrentAccount(
        owner = Client(
            name = "Matheus Carvalho",
            cpf = "111.111.111-11",
            address = Address(),
            password = 1234
        ), 1000
    )
    val accountFran: CurrentAccount = CurrentAccount(
        owner = Client(
            name = "Fran Carvalho",
            cpf = "222.222.222-22",
            address = Address(),
            password = 1234
        ), 2000
    )

    accountMatheus.deposit(1500.0)
    accountFran.deposit(1500.0)

    accountMatheus.transfer(accountDestination = accountFran, 1600.0)

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

