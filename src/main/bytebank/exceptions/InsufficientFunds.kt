package exceptions

import java.lang.Exception

class InsufficientFunds(message: String) : Exception(message) {
}