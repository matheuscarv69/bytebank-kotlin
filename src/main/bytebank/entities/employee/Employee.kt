package entities.employee

open class Employee(
    val name: String,
    val cpf: String,
    val salary: Double,
) {

    /**
     * Era uma funcao que foi convertida em propriedade
     * */
    open val bonus: Double get() = salary * 0.1

    /**
     * A funcao/property acima também pode ser escrita
     * dessa maneira
     * */
//    open val bonus: Double
//        get() {
//            return salary * 0.3
//        }
    /**
     * Também pode ser escrita dessa maneira, iria sair do modelo
     * de property para ser um function
     * */
//    open fun getBonus(): Double = salary * 0.1


}
