class Employee(
    val name: String,
    val cpf: String,
    val salary: Double
) {

    fun bonus(): Double {
        return salary * 0.1
    }

}
