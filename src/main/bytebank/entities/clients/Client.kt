package entities.clients

import entities.employee.Authenticable

class Client(
    val name: String,
    val cpf: String,
    val password: Int
) : Authenticable {
    override fun autenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }


}