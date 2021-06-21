fun main() {
    println("Welcome to Bytebank")

    // val -> nao pode ser modificado
    val owner = "Matheus"

    // owner = "Fulano" // Da erro

    println("Owner $owner")

    // var -> pode ser modificado
    var lastNameOwner = "Carvalho"

    println("LastName Owner: $lastNameOwner")

    lastNameOwner = "Almeida" // aceita por ser var
    println("Updated LastName Owner: $lastNameOwner")


}