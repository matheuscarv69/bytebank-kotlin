package core

import entities.employee.Authenticable

class InternalSystem {


    fun entry(
        adminEmployee: Authenticable,
        password: Int,
        authenticated: () -> Unit = {}
    ) {
        if (adminEmployee.autenticate(password)) {
            println("Welcome to Bytebank")
            authenticated()
        } else {
            println("Opss...User is not autenticated")
        }
    }


}