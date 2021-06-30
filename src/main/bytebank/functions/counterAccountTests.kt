package functions

import core.InternalSystem
import entities.account.Account
import entities.account.CurrentAccount
import entities.account.SavingsAccount
import entities.clients.Client
import entities.employee.Authenticable

fun CounterAccountsTests() {
    val matheus = Client(name = "Matheus", "111.111.111-11", password = 1234)
    val matheusSavingsAccount = SavingsAccount(owner = matheus, numberAccount = 1000)
    val matheusCurrentAccount = CurrentAccount(owner = matheus, numberAccount = 1001)

    println("Total of accounts: ${Account.totalAccounts}")

    // object declaration
    val anonymousClient = object : Authenticable {
        val name: String = "Anonymous"
        val cpf: String = "123.321.213-32"
        val passoword: Int = 1234

        override fun autenticate(password: Int) = this.passoword == passoword
    }

    val internalSystem = InternalSystem()

    internalSystem.entry(anonymousClient, 1234)
}