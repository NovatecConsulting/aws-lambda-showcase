package novatec

class Hello {

    fun handleRequest(name: String = "") = if (name.isNotBlank()) {
        "Goodbye $name"
    } else {
        "Goodbye everyone"
    }


}
