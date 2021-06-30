package functions.lambdas

fun testLambdas() {
    //  O kotlin identifica anonymous e lambdas funcoes com essa sintaxe tambem inferindo os tipos
//    val myFunctionLambda = {

//    Outra forma que o kotlin usa
//    val myFunctionLambda = { a: Int, b: Int ->
    val myFunctionLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println(myFunctionLambda(100, 235))

    println()

//    o lambda@ serve para poder retornar mais de um valor em uma lambda
    println("Lambda com multiplos retornos")
    val calculateBonus: (salary: Double) -> Double = lambda@{ salary ->
        if (salary > 1000.0) {
            return@lambda salary + 50.0
        }
        salary + 100.0
    }

    println(calculateBonus(1100.0))
}