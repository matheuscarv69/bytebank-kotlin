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

   open fun autenticate(password: Int): Boolean {
       println("Using implementation by AdminEmployee")
       if (this.password == password) {
            return true
        }
        return false
    }


}
