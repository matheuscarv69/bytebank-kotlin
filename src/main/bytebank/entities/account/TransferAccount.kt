package entities.account

abstract class TransferAccount(
    owner: String,
    numberAccount: Int
): Account(
    owner = owner,
    numberAccount = numberAccount
) {

    fun transfer(accountDestination: Account, value: Double): Boolean {
        when {
            this.balance >= value -> {
                this.balance -= value;
                accountDestination.deposit(value)
                return true
            }
            this.balance < 0.0 -> {
                println()
                println("Your balance is negative $ ${this.balance}")
            }
            this.balance == 0.0 -> {
                println()
                println("Your balance is empty $ ${this.balance}")
            }
        }
        return false;
    }

}