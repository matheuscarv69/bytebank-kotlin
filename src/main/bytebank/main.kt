import entities.account.Account
import entities.account.CurrentAccount
import entities.account.SavingsAccount

fun main() {
    println("Welcome to Bytebank")

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


fun printAccountInformation(accountMatheus: Account, operation: String, value: Double) {
    println()
    println()
    println("$operation $ $value in ${accountMatheus.owner}' entities.account.Account ")
    println("entities.account.Account Owner: ${accountMatheus.owner}, Balance: ${accountMatheus.balance}")
}

