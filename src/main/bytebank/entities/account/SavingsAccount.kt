package entities.account

import entities.clients.Client

class SavingsAccount(
    owner: Client,
    numberAccount: Int
) : TransferAccount(
    owner = owner,
    numberAccount = numberAccount
) {

    override fun withdraw(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }

}