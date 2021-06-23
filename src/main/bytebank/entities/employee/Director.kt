package entities.employee

class Director(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int,
    val plr: Double
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override val bonus: Double = salary * 0.1 + salary + plr

    fun autentica(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }


}