package novatec

class Hello {

    fun handleRequest(name: String?) = if (name?.isBlank() != false) {
        "Hello World"
    } else {
        "Hello $name"
    }


}
