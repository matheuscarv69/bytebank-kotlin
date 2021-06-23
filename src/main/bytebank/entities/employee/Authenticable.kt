package entities.employee

interface Authenticable {

    val password: Int

    fun autenticate(password: Int): Boolean {
        println("Using implementation by interface")
        if (this.password == password) {
            return true
        }
        return false
    }

}