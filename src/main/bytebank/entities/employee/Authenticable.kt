package entities.employee

interface Authenticable {

    fun autenticate(password: Int): Boolean

}