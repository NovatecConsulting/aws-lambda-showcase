package novatec

class Hello {

    fun handleRequest(name: String?) = if (name?.isBlank() != false) {
        "Goodbye everyone!"
    } else {
        "Goodbye $name!"
    }


}
