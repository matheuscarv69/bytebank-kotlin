package entities

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

    override val bonus: Double
        get() {
            return salary * 0.3
        }

    fun autentica(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }


}