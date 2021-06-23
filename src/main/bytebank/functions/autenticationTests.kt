package functions

import core.InternalSystem
import entities.clients.Client
import entities.employee.Director
import entities.employee.Manager

fun autenticationTests() {
    val manager = Manager(
        name = "Matheus",
        cpf = "111.111.111-11",
        salary = 1000.0,
        password = 1234
    )

    val director = Director(
        name = "Alex",
        cpf = "222.222.222-22",
        salary = 1000.0,
        password = 1234,
        plr = 1000.0
    )

    val client = Client(
        name = "Gui",
        cpf = "333.333.333-33",
        password = 1234,
    )

    val system = InternalSystem()

    system.entry(manager, 1234)
    system.entry(director, 1234)
    system.entry(client, 1234)
}