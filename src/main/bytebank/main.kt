fun main() {
    println("Welcome to Bytebank")

    val matheus = Employee(
        name = "Matheus",
        cpf = "111.111.111-11",
        salary = 1000.0,
        type = 2
    )

    println("name ${matheus.name}")
    println("cpf ${matheus.cpf}")
    println("salary ${matheus.salary}")
    println("bonus ${matheus.bonus()}")

}


fun printAccountInformation(accountMatheus: Account, operation: String, value: Double) {
    println()
    println()
    println("$operation $ $value in ${accountMatheus.owner}' Account ")
    println("Account Owner: ${accountMatheus.owner}, Balance: ${accountMatheus.balance}")
}

