import entities.clients.Address

fun main() {

    var nullAddress : Address = Address(publicPlace = "Av Abel Monteiro Reis")
//    var nullAddress: Address? = null

    val newAddress: String? = nullAddress?.publicPlace

    nullAddress?.let { possibleAddress: Address ->
        println(possibleAddress.publicPlace)
        println(possibleAddress.publicPlace.length)
    }


}