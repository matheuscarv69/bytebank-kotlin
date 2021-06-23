package entities.account

class CurrentAccount(
    owner: String,
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