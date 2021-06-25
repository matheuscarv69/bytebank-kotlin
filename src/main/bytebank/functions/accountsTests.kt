package functions

import entities.account.CurrentAccount
import entities.account.SavingsAccount
import entities.clients.Client

fun AccountsTests() {

    val matheus = Client(name = "Matheus", cpf = "111.111.111-11", password = 1234)
    val currentAccount = CurrentAccount(
        owner = matheus,
        numberAccount = 1000
    )

    val fran = Client(name = "Fran", cpf = "222.222.222-22", password = 1234)
    val savingsAccount = SavingsAccount(
        owner = fran,
        numberAccount = 1001
    )

    currentAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    println("Deposit")
    println("Current Balance: $ ${currentAccount.balance}")
    println("Saving Balance: $ ${savingsAccount.balance}")

    currentAccount.withdraw(100.0)
    savingsAccount.withdraw(100.0)

    println("withdraw")
    println("Current Balance: $ ${currentAccount.balance}")
    println("Saving Balance: $ ${savingsAccount.balance}")


//    currentAccount.transfer(
//        accountDestination = savingsAccount,
//        value = 100.0
//    )

    println("Transfer Current to Saving")
    println("Current Balance: $ ${currentAccount.balance}")
    println("Saving Balance: $ ${savingsAccount.balance}")

//    savingsAccount.transfer(
//        accountDestination = currentAccount,
//        value = 100.0
//    )

    println("Transfer Saving to Current")
    println("Current Balance: $ ${currentAccount.balance}")
    println("Saving Balance: $ ${savingsAccount.balance}")
}