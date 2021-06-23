package methods

import entities.bonus.CalculatorBonus
import entities.employee.Analist
import entities.employee.Director
import entities.employee.Manager

fun EmployeeTests() {
    val matheus = Analist(
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
        cpf = "222.222.222-22",
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
        cpf = "333.333.333-33",
        salary = 4000.0,
        password = 1234,
        plr = 200.0
    )

    println("name ${gui.name}")
    println("cpf ${gui.cpf}")
    println("salary ${gui.salary}")
    println("bonus ${gui.bonus}")
    println("PLR ${gui.plr}")

    val maria = Analist(
        name = "Maria",
        cpf = "444.444.444-44",
        salary = 3000.0,
    )

    println("name ${maria.name}")
    println("cpf ${maria.cpf}")
    println("salary ${maria.salary}")
    println("bonus ${maria.bonus}")

    if (gui.autentica(1234)) {
        println("Analist ${maria.name} is autenticated")
    } else {
        println("Analist ${maria.name} is not autenticated")
    }

    val calculator = CalculatorBonus()

    calculator.register(matheus)
    calculator.register(fran)
    calculator.register(gui)
    calculator.register(maria)

    println("Total of bonus: ${calculator.total}")
}