package exceptions

import java.lang.Exception

class InsufficientFunds(message: String = "Insufficient funds!" ) : Exception(message) {
}