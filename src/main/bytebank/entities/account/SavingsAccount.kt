package entities.account

class SavingsAccount(
    owner: String,
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