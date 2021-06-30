package functions.functionsTypes

fun testFunctionTypeReference() {
    println("Inicialização via Referência")
//    val myFunction: (Int, Int) -> Int = ::sum // tradicional (doc)
//  O kotlin identifica funcoes com essa sintaxe tambem
    val myFunction = ::sum

    println(myFunction(5, 10))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}
