package entities.account

class SalaryAccount(
    owner: String,
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