package functions.scopeFunctions

import core.InternalSystem
import entities.clients.Address
import entities.employee.Authenticable

fun testsScopeApplyLetRun() {
    //    val address = Address(
//        publicPlace = "Av Abel Monteiro Reis",
//        number = 1023
//    )
//
//    val addressUpperCase = "${address.publicPlace}, ${address.number}".uppercase()

//    println(addressUpperCase)
//    println("\n")

    val address = Address(
        publicPlace = "Av Abel Monteiro Reis",
        number = 1023
    ).run {
        "$publicPlace, $number".uppercase()
    }

    println(address)

//    val anAddressUppercase = Address(
//        publicPlace = "Av Abel Monteiro Reis",
//        number = 1023
//    ).apply {
//        "${this.publicPlace}, $number".uppercase()
//    }.let(::println)
//
//    println("\n")

//    listOf<Address>(
//        Address(complement = "AP"),
//        Address(complement = "Quitinete"),
//        Address()
//    ).filter { address1 -> address1.complement?.isNotEmpty() ?: false }
//        .let(::println)


    sum(1, 5, result = {
        println(it)
    })

    println("\n")


    // Usando higher order functions na autenticacao

    val peopleObject = object : Authenticable {
        val password: Int = 1234
        override fun autenticate(password: Int) = this.password == password
    }
    InternalSystem().entry(peopleObject, 1234, authenticated = {
        println("Payment already")
    })
}

fun sum(a: Int, b: Int, result: (Int) -> Unit) {
    result(a + b)
}