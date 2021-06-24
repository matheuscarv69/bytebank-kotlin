package entities.account

import entities.clients.Client

// property global, por conta do private,
// ela so pode ser alterada aqui nesse artigo
var totalAccount = 0
    private set

abstract class Account(
    val owner: Client,
    val numberAccount: Int
) {

    var balance = 0.0
        protected set

    init {
        println("Iniciou aqui")
        totalAccount++
    }

    fun deposit(value: Double) {
        if (value < 0.0) {
            println("The value informed is negative")
            return
        }
        this.balance += value
    }

    abstract fun withdraw(value: Double)


}