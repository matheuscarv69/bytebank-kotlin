import entities.account.CurrentAccount
import entities.account.SavingsAccount
import entities.account.totalAccount
import entities.clients.Client

fun main() {

    val matheus = Client(name = "Matheus", "111.111.111-11", password = 1234)
    val matheusSavingsAccount = SavingsAccount(owner = matheus, numberAccount = 1000)
    val matheusCurrentAccount = CurrentAccount(owner = matheus, numberAccount = 1001)


    accountBehavioralTests()

    println("Total of accounts: $totalAccount")


}