package functions

import entities.clients.Address
import entities.clients.Client
import java.lang.ArithmeticException
import java.lang.ClassCastException
import java.lang.NumberFormatException

fun ExceptionExpressionsTests() {
    println("início main")

    val entry: String = "1"

    val value: Double? = try {
        entry.toDouble()
    } catch (e: NumberFormatException) {
        println("try expression here")
        null
    }

    if (value == null) {
        println("Value is null")
    }
    println("Value is $value")

    var valueWithTax: Double = if (value == null) 0.0 else value * 0.1

    println("Value with tax is $valueWithTax")

    valueWithTax = when {
        value != null -> {
            valueWithTax + 5.0
        }
        else -> {
            0.0
        }
    }

    println("Value with tax is $valueWithTax")

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
//    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)

        try {
            val address = Address()
            address as Client
        } catch (e: ClassCastException) {
            println("Deu pau aqui $e.message")
//            e.printStackTrace()

        }

    }

    try {
        10 / 0
    } catch (e: ArithmeticException) {
        println("Deu pau aqui $e")
    }

    println("fim funcao2")
}