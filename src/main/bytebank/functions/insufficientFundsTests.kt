package functions

import entities.account.CurrentAccount
import entities.clients.Address
import entities.clients.Client
import exceptions.AutenticationFailedException
import exceptions.InsufficientFunds
import java.lang.ArithmeticException
import java.lang.Exception

fun insufficientFundsTests() {
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

    try {
        accountMatheus.transfer(
            accountDestination = accountFran,
            1600.0,
            12234
        )

    } catch (e: InsufficientFunds) {
        println("Get ${e.javaClass}")
    } catch (e: AutenticationFailedException) {
        println("Get ${e.javaClass}")
    } catch (e: Exception) {
        println("Unknown error: ${e.message} ")
    }

}