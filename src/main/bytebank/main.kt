import entities.clients.Address
import entities.clients.Client
import java.lang.ArithmeticException
import java.lang.ClassCastException

fun main() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    funcao2()
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

        }

    }

    try {
        10 / 0
    } catch (e: ArithmeticException) {
        println("Deu pau aqui $e")
    }

    println("fim funcao2")
}