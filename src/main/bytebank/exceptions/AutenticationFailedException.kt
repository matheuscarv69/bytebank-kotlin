package exceptions

import java.lang.Exception

class AutenticationFailedException(message: String = "Autentication failed! ") : Exception(message) {
}