class Employee(
    val name: String,
    val cpf: String,
    val salary: Double,
    val type: Int // 0 -> emp normal, 1 -> manager, 2 -> director
) {

    fun bonus(): Double {
        when (this.type) {
            0 -> return salary * 0.1
            1 -> return salary * 0.2
            else -> return salary * 0.3
        }
    }

}
