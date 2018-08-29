package novatec

class Hello {

    fun handleRequest(name: String?) = if (name?.isBlank() != false) {
        "How's it going!"
    } else {
        "Goodbye $name!"
    }


}
