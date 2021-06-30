package functions.lambdas


fun testAnonymousFunctions() {
    val myAnonymousFunctionLambda: (Int, Int) -> Int = fun(a, b): Int {
        println("My anonymous function lambda")
        return a + b
    }

    println(myAnonymousFunctionLambda(6, 7))
    println("\n")

    println()

    println("Anonymous function com multiplos retornos")
    val myAnonymousCalculateBonus: (Double) -> Double = fun(salary: Double): Double {
        if (salary > 1000)
            return salary + 50.0

        return salary + 100.0
    }
    println(myAnonymousCalculateBonus(1100.0))
}
