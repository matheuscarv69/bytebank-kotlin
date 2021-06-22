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

//    fun bonus(): Double {
//        return salary * 0.2
//    }

    fun autentica(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }


}