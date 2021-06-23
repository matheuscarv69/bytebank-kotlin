package entities.employee

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
) : AdminEmployee(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
), Authenticable {

    override val bonus: Double = salary * 0.1 + salary

}