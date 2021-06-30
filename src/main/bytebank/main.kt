import entities.clients.Address

fun main() {

    val address = Address(
        publicPlace = "Abel Monteiro Reis",
        number = 1023
    )

    val address2: Address = Address()
        .also { println("Generating a Address") }
        .apply {
            publicPlace = "Manoel Felipe"
            number = 912
            cep = "691123721"
        }
        .run {
            publicPlace = publicPlace.uppercase()

            if (cep.length > 8)
                cep = "Invalid".uppercase()
            println("CEP: $cep")


            this // this because i need Address returns
        }

    println(address2)
    println()

    val myOldAddres: String = with(address2) {
        "My old address is: $number,  $publicPlace Street, $cep"
    }
    println(myOldAddres)

    println("\n")
    println("With")
    with(address) {
        println("My address is: $number, $publicPlace Avenue")
    }


}