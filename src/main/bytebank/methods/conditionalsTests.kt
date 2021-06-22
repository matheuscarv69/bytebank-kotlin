/**
 * Funcao para testar os condicionais do kotlin
 * */
fun conditionalsTest(balance: Double) {

//    if(balance > 0.0){
//        println("entities.Account is positive")
//    } else if (balance == 0.0){
//        println("entities.Account is neutral")
//    } else {
//        println("entities.Account is negative")
//    }

    when {
        balance > 0.0 -> println("entities.Account is positive")
        balance == 0.0 -> println("entities.Account is neutral")
        else -> println("entities.Account is negative")
    }
}