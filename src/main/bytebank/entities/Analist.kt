package entities

class Analist(
    name: String,
    cpf: String,
    salary: Double,
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override val bonus: Double = super.bonus + salary * 0.1

}