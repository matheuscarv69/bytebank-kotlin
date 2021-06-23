import entities.account.Account
import methods.EmployeeTests

fun main() {
    println("Welcome to Bytebank")

    EmployeeTests()

}

fun printAccountInformation(accountMatheus: Account, operation: String, value: Double) {
    println()
    println()
    println("$operation $ $value in ${accountMatheus.owner}' entities.account.Account ")
    println("entities.account.Account Owner: ${accountMatheus.owner}, Balance: ${accountMatheus.balance}")
}

