package functions

import entities.clients.Address

fun EqualAndHashCodeTests() {
    val address1 = Address(
        publicPlace = "Av. Abel Monteiro Reis",
        number = 1902,
        district = "Senador Hélio Campos",
        state = "Roraime",
        city = "Boa Vista",
        cep = "12332-392",
        complement = "Portão preto"
    )
    val address2 = Address(
        publicPlace = "Av. Manoel Felipe Monteiro Reis",
        number = 1000,
        district = "Senador Hélio Campos",
        state = "Roraime",
        city = "Boa Vista",
        cep = "12332-392",
        complement = "Portão branco"
    )

    println("Cep Hashcode 1 ${address1.cep.hashCode()}")
    println("Cep Hashcode 2 ${address2.cep.hashCode()}")

    println(address1.equals(address2))
}