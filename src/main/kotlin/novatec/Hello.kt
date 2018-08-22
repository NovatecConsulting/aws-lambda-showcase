package novatec

class Hello {
    fun handleRequest(name: String) = if (name.isBlank()) {
        "Hello World"
    } else {
        "Hello $name"
    }


}
