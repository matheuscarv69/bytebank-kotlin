package entities.employee

class Director(
    name: String,
    cpf: String,
    salary: Double,
    password: Int,
    val plr: Double
) : AdminEmployee(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
), Authenticable {

    override val bonus: Double = salary * 0.1 + salary + plr

}