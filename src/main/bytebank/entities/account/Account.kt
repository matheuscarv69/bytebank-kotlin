package entities.account

abstract class Account(
    val owner: String,
    val numberAccount: Int
) {

    var balance = 0.0
        protected set

//    segundo construtor, pode ser usado para uma logica a mais na hora de
//    iniciar a classe, mas por padrao o construtor primario deve ser usado
//    constructor(owner: String, numberAccount: Int) {
//        this.owner = owner
//        this.numberAccount = numberAccount
//    }

    fun deposit(value: Double) {
        if (value < 0.0) {
            println("The value informed is negative")
            return
        }
        this.balance += value
    }

    abstract fun withdraw(value: Double)

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