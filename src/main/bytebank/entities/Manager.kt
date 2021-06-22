package entities

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override val bonus: Double = super.bonus + salary

    fun autentica(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }

}