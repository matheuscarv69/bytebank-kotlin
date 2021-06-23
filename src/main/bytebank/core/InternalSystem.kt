package core

import entities.employee.Authenticable

class InternalSystem {


    fun entry(
        adminEmployee: Authenticable,
        password: Int
    ) {
        if (adminEmployee.autenticate(password)) {
            println("Welcome to Bytebank")
            println("User is autenticated")
            return
        }
        println("Opss...User is not autenticated")
    }


}