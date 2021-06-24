package entities.account

import entities.clients.Client

class SalaryAccount(
    owner: Client,
    numberAccount: Int
) : Account(
    owner = owner,
    numberAccount = numberAccount
) {
    override fun withdraw(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }

}