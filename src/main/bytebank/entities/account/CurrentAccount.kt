package entities.account

class CurrentAccount(
    owner: String,
    numberAccount: Int
) : Account(
    owner = owner,
    numberAccount = numberAccount
) {

    override fun withdraw(value: Double) {
        val tax = value + 0.1
        super.withdraw(tax)
    }

}