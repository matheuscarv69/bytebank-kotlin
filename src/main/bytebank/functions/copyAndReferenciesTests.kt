import entities.account.CurrentAccount
import entities.account.SavingsAccount

fun copyAndReferenciesTests() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = CurrentAccount("João", 1001)
    val contaMaria = SavingsAccount("Maria", 1002)

    println("owner conta joao: ${contaJoao.owner}")
    println("owner conta maria: ${contaMaria.owner}")

    println(contaJoao)
    println(contaMaria)
}
