import entities.account.Account

fun main() {
    println("Welcome to Bytebank")

    accountBehavioralTests()
}

fun printAccountInformation(accountMatheus: Account, operation: String, value: Double) {
    println()
    println()
    println("$operation $ $value in ${accountMatheus.owner}' entities.account.Account ")
    println("entities.account.Account Owner: ${accountMatheus.owner}, Balance: ${accountMatheus.balance}")
}

