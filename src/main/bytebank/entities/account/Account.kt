package entities.account

import entities.clients.Client

abstract class Account(
    val owner: Client,
    val numberAccount: Int
) {

    var balance = 0.0
        protected set

    fun deposit(value: Double) {
        if (value < 0.0) {
            println("The value informed is negative")
            return
        }
        this.balance += value
    }

    abstract fun withdraw(value: Double)



}