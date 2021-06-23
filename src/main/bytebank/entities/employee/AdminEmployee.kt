package entities.employee

abstract class AdminEmployee(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {

    fun autenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }


}
