import entities.account.CurrentAccount
import entities.account.SavingsAccount
import functions.printAccountInformation

fun accountBehavioralTests() {
    // usando labels na criacao de uma conta
    val accountMatheus = CurrentAccount(owner = "Matheus", numberAccount = 1000)
    accountMatheus.deposit(535.0)
    println(
        "entities.account.Account Owner: ${accountMatheus.owner}," +
                " Number: ${accountMatheus.numberAccount}, Balance: ${accountMatheus.balance}"
    )

    // usando labels na criacao de uma conta, a ordem nao importa,desde que sejam
    // usados os mesmos nomes de variaveis que estao no construtor
    val accountFran = SavingsAccount(numberAccount = 2000, owner = "Fran")
    accountFran.deposit(1550.0)

    println(
        "entities.account.Account Owner: ${accountFran.owner}," +
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

    // as labels também funcionam para funcoes
    if (accountFran.transfer(accountDestination = accountMatheus, value = 700.0)) {
        printAccountInformation(accountFran, "Transfer", 700.0)
        printAccountInformation(accountMatheus, "Receive", 700.0)
    } else {
        println()
        println("Transfer Failed")
    }
}
