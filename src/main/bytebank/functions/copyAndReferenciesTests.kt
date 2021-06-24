import entities.account.CurrentAccount
import entities.account.SavingsAccount
import entities.clients.Client

fun copyAndReferenciesTests() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Client(name = "João", cpf = "111.111.111-11", password = 1234)
    val maria = Client(name = "Maria", cpf = "222.222.222-22", password = 1234)
    val contaJoao = CurrentAccount(joao, 1001)
    val contaMaria = SavingsAccount(maria, 1002)

    println("owner conta joao: ${contaJoao.owner.name}")
    println("owner conta maria: ${contaMaria.owner.name}")

    println(contaJoao)
    println(contaMaria)
}
