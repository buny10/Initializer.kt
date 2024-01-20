fun main() {
    val user = User("Anjali", "shah", 23)

    println("Name is ${user.name}")
}


class User( name: String, var LAstname: String, var age: Int) {
    var name: String
    init {
        if (name.uppercase().startsWith("A")) {
            this.name = name
        } else {
            this.name = "User"
            println("The name of the user not found")
        }
    }
}