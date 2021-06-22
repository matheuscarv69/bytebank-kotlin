import entities.Account
import entities.Director
import entities.Employee
import entities.Manager

fun main() {
    println("Welcome to Bytebank")

    val matheus = Employee(
        name = "Matheus",
        cpf = "111.111.111-11",
        salary = 1000.0,
    )

    println("name ${matheus.name}")
    println("cpf ${matheus.cpf}")
    println("salary ${matheus.salary}")
    println("bonus ${matheus.bonus}")

    val fran = Manager(
        name = "Fran",
        cpf = "111.111.111-11",
        salary = 2000.0,
        password = 1234
    )

    println("name ${fran.name}")
    println("cpf ${fran.cpf}")
    println("salary ${fran.salary}")
    println("bonus ${fran.bonus}")

    if (fran.autentica(21234)) {
        println("Manager ${fran.name} is autenticated")
    } else {
        println("Manager ${fran.name} is not autenticated")
    }

    val gui = Director(
        name = "Gui",
        cpf = "111.111.111-11",
        salary = 4000.0,
        password = 1234,
        plr = 200.0
    )

    println("name ${gui.name}")
    println("cpf ${gui.cpf}")
    println("salary ${gui.salary}")
    println("bonus ${gui.bonus}")
    println("PLR ${gui.plr}")

    if (gui.autentica(1234)) {
        println("Director ${gui.name} is autenticated")
    } else {
        println("Director ${gui.name} is not autenticated")
    }

}


fun printAccountInformation(accountMatheus: Account, operation: String, value: Double) {
    println()
    println()
    println("$operation $ $value in ${accountMatheus.owner}' entities.Account ")
    println("entities.Account Owner: ${accountMatheus.owner}, Balance: ${accountMatheus.balance}")
}

