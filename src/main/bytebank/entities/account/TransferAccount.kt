package entities.account

import entities.clients.Client
import exceptions.AutenticationFailedException
import exceptions.InsufficientFunds

abstract class TransferAccount(
    owner: Client,
    numberAccount: Int
) : Account(
    owner = owner,
    numberAccount = numberAccount
) {

    fun transfer(accountDestination: Account, value: Double, password: Int) {

        if (!autenticate(password)) {
            throw AutenticationFailedException()
        }

        when {
            this.balance >= value -> {
                this.balance -= value;
                accountDestination.deposit(value)
            }
            this.balance < 0.0 -> {
                println()
                println("Your balance is negative $ ${this.balance}")
            }
            this.balance < value -> {
                throw InsufficientFunds(message = "Your balance is less than value $ $value, your balance : ${this.balance}")
            }
        }
    }

}