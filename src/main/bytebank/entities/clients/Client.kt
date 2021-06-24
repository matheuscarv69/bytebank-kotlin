package entities.clients

import entities.employee.Authenticable

class Client(
    val name: String,
    val cpf: String,
    var address: Address = Address(),
    private val password: Int
) : Authenticable {

    override fun autenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }


}