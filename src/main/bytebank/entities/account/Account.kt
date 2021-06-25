package entities.account

import entities.clients.Client
import entities.employee.Authenticable

abstract class Account(
    val owner: Client,
    val numberAccount: Int
    // usando delegacao no padrao do kotlin, dessa forma nao eh preciso fazer um override do metodo autenticate
) : Authenticable by owner {

    var balance = 0.0
        protected set

    //
    companion object Counter {
        var totalAccounts: Int = 0
            private set
    }

    init {
        println("Iniciou a classe Account")
        totalAccounts++
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