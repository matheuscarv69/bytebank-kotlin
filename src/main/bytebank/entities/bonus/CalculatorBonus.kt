package entities.bonus

import entities.employee.Employee

class CalculatorBonus {

    var total: Double = 0.0
        private set

    fun register(employee: Employee) {
        this.total += employee.bonus
    }

}