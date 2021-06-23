package core

import entities.employee.AdminEmployee

class InternalSystem {


    fun entry(
        adminEmployee: AdminEmployee,
        password: Int
    ) {
        if (adminEmployee.autenticate(password)) {
            println("Welcome to Bytebank")
            println("${adminEmployee.name} is autenticated")
            return
        }
        println("Opss...${adminEmployee.name} is not autenticated")
    }


}