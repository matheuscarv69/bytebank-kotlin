package functions.functionsTypes

fun testFunctionTypeClass() {
    println("Inicialização via Classe")
//    val myFunctionClass: () -> Unit = Test() // tradicional (doc)
//  O kotlin identifica funcoes com essa sintaxe tambem
    val myFunctionClass = Sum()
    println(myFunctionClass(20, 5))
}

class Sum : (Int, Int) -> Int {

    override fun invoke(a: Int, b: Int): Int = a + b
}