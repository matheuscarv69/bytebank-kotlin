package entities.employee

class Analist(
    name: String,
    cpf: String,
    salary: Double,
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override val bonus: Double = salary * 0.1 + salary * 0.1

}