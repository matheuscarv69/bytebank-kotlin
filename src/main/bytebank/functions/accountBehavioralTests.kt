import entities.account.CurrentAccount
import entities.account.SalaryAccount
import entities.account.SavingsAccount
import entities.clients.Address
import entities.clients.Client
import functions.printAccountInformation

fun accountBehavioralTests() {

    val matheus = Client(name = "Matheus", cpf = "111.111.111-11", password = 1234)

    // usando labels na criacao de uma conta
    val accountMatheus = CurrentAccount(owner = matheus, numberAccount = 1000)
    accountMatheus.deposit(535.0)
    println(
        "Account Owner: ${accountMatheus.owner.name}," +
                " Number: ${accountMatheus.numberAccount}, Balance: ${accountMatheus.balance}"
    )

    val fran = Client(name = "Fran", cpf = "222.222.222-22", password = 1234)

    val accountFran = SavingsAccount(numberAccount = 2000, owner = fran)
    accountFran.deposit(1550.0)

    println(
        "Account Owner: ${accountFran.owner.name}," +
                " Number: ${accountFran.numberAccount}, Balance: ${accountFran.balance}"
    )

    val cat = Client(
        name = "Cat",
        cpf = "333.333.333-33",
        address = Address(publicPlace = "Av Abel Monteiro Reis"),
        password = 1234
    )

    val catSalaryAccount = SalaryAccount(numberAccount = 3000, owner = cat)
    catSalaryAccount.deposit(1000.0)

    println(
        "Account Owner: ${catSalaryAccount.owner.name}, Address: ${catSalaryAccount.owner.address.publicPlace}," +
                " Number: ${catSalaryAccount.numberAccount}, Balance: ${catSalaryAccount.balance}"
    )

    accountMatheus.deposit(50.0)
    printAccountInformation(accountMatheus, "Deposit", 50.0)

    accountFran.deposit(100.0)
    printAccountInformation(accountFran, "Deposit", 100.0)

    accountMatheus.withdraw(100.0)
    printAccountInformation(accountMatheus, "Withdraw", 100.0)

    accountFran.withdraw(1000.0)
    printAccountInformation(accountFran, "Withdraw", 1000.0)

    catSalaryAccount.withdraw(1000.0)
    printAccountInformation(catSalaryAccount, "Withdraw", 1000.0)

    // as labels também funcionam para funcoes
    if (accountFran.transfer(accountDestination = accountMatheus, value = 700.0)) {
        printAccountInformation(accountFran, "Transfer", 700.0)
        printAccountInformation(accountMatheus, "Receive", 700.0)
    } else {
        println()
        println("Transfer Failed")
    }

//    catSalaryAccount.transfer(200.0, accountMatheus)
//    catSalaryAccount.transfer(200.0, accountFran)

}
