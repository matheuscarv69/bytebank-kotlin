package entities.clients

import entities.employee.Authenticable

class Client(
    val name: String,
    val cpf: String,
    override val password: Int
) : Authenticable {


}