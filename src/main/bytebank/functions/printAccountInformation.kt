package functions

import entities.account.Account

fun printAccountInformation(accountMatheus: Account, operation: String, value: Double) {
    println()
    println()
    println("$operation $ $value in ${accountMatheus.owner}' Account ")
    println("Account Owner: ${accountMatheus.owner}, Balance: ${accountMatheus.balance}")
}