package functions

import entities.account.CurrentAccount
import entities.account.SavingsAccount

fun AccountsTests() {
    val currentAccount = CurrentAccount(
        owner = "Matheus",
        numberAccount = 1000
    )

    val savingsAccount = SavingsAccount(
        owner = "Fran",
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


    currentAccount.transfer(
        accountDestination = savingsAccount,
        value = 100.0
    )

    println("Transfer Current to Saving")
    println("Current Balance: $ ${currentAccount.balance}")
    println("Saving Balance: $ ${savingsAccount.balance}")

    savingsAccount.transfer(
        accountDestination = currentAccount,
        value = 100.0
    )

    println("Transfer Saving to Current")
    println("Current Balance: $ ${currentAccount.balance}")
    println("Saving Balance: $ ${savingsAccount.balance}")
}