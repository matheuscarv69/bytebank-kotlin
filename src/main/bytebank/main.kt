import entities.clients.Address
import java.lang.IllegalStateException

fun main() {

    var nullAddress: Address = Address(publicPlace = "Av Abel Monteiro Reis", complement = "verde")
//    var nullAddress: Address = Address(publicPlace = "Av Abel Monteiro Reis")
//    var nullAddress: Address? = null

    val newAddress: String? = nullAddress?.publicPlace

    nullAddress?.let { possibleAddress: Address ->
        println(possibleAddress.publicPlace)
        println(possibleAddress.publicPlace.length)

        // elvis operator, utilizado para retornar um int quando um objeto informado for nulo
        val complementSize: Int = possibleAddress.complement?.length ?: 0
        println("complement with elvis operator: $complementSize")

        // elvis operator, tambem pode lancar exceptions
        val complementSizeWithException: Int =
            possibleAddress.complement?.length ?: throw IllegalStateException("Complement is empty")
    }


    // testando o safe cast
    safeCastTest(1)
    // ira atribuir null para o number
    safeCastTest("potato")

}

fun safeCastTest(value: Any){
    // o safe cast garante que quando o cast nao for possivel a exception nao seja lancada,
    // dessa forma o number ali em baixo irah receber um null caso seja feito o cast
    // de uma string por exemplo
    val number: Int? = value as? Int
    println(number)


}