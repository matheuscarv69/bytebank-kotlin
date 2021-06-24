package entities.account

import entities.clients.Client

class CurrentAccount(
    owner: Client,
    numberAccount: Int
) : TransferAccount(
    owner = owner,
    numberAccount = numberAccount
) {

    override fun withdraw(value: Double) {
        val tax = value + 0.1

        if (this.balance >= tax) {
            this.balance -= tax
        }


    }

}