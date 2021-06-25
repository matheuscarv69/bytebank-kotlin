package entities.clients

class Address(
    var publicPlace: String = "",
    var number: Int = 0,
    var district: String = "",
    var city: String = "",
    var state: String = "",
    var cep: String = "",
    var complement: String? = null
) {

    override fun toString(): String {
        return """Address(
            | publicPlace='$publicPlace',
            | number=$number,
            | district='$district',
            | city='$city',
            | state='$state',
            | cep='$cep',
            | complement='$complement')""".trimMargin()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Address) return false

        if (cep != other.cep) return false

        return true
    }

    override fun hashCode(): Int {
        return cep.hashCode()
    }


}